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
    private ResultListContainer resultListContainer;



    @Override
    public void searchFile(String fileName, String searchDirectory) {
        File searchDirectoryFile = new File(searchDirectory);
        if (searchDirectoryFile.isDirectory()) {                          // Checking if the search directory is Directory, not a File
            if (searchDirectoryFile.listFiles() != null) {                // Checking if the directory is not empty
               for (int i = 0; i < searchDirectoryFile.listFiles().length; i++) {
                   root =  searchDirectoryFile.listFiles()[i];
                   searchFile(fileName, root.getAbsolutePath());        // recursively calling the "searchFile" method for all child folders one by one
                   searchThread = new SearchThread(root, fileName);  // creating new thread which will check the search directory for having searching file
                   searchThread.run();
               }
            }
        }
    }







}
