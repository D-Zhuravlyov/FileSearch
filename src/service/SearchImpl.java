package service;

import model.ResultListContainer;
import thread.SearchThread;

import java.io.File;


/**
 * Created by nofuruct on 09.02.15.
 */
public class SearchImpl implements ISearch {

    private   SearchThread searchThread;
    private File root;
    private ResultListContainer res = new ResultListContainer();




    @Override
    public void searchFile(String filename, File searchDirectory) {
        if (searchDirectory.isDirectory()) {                          // Checking if the search directory is Directory, not a File
            if (searchDirectory.listFiles() != null) {                // Checking if the directory is not empty
                for (int i = 0; i < searchDirectory.listFiles().length; i++) {
                        searchThread = new SearchThread(searchDirectory, filename);  // creating new thread which will check the search directory for having searching file
                        searchThread.run();
                        root = searchDirectory.listFiles()[i];
                        searchFile(filename, root);        // recursively calling the "searchFile" method for all child folders one by one
                }
            }
        }
    }

    @Override
    public synchronized void addResult(File file) {
        res.addResult(file);
    }

}
