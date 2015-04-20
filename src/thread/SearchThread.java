package thread;

import model.ResultListContainer;
import service.ISearch;
import service.SearchImpl;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by nofuruct on 15.04.15.
 */
public class SearchThread implements Runnable {


    private File root;
    private String searchKey;

    public SearchThread() {
    }

    public SearchThread(File root, String searchKey) {
        this.root = root;
        this.searchKey = searchKey;
    }

    @Override
    public void run() {
        File[] fileList;
        if ((root != null) && (searchKey != null)) {
            if (root.isDirectory()) {
                fileList = root.listFiles();
                for (File f : fileList) {
                    compareFiles(f);
                }
            } else {
                compareFiles(root);
            }
        }
    }

    public void compareFiles(File f) {
        if (f.getName().equals(searchKey)) {
            ResultListContainer.ResultListHolder.RESULT_LIST.add(f);
        }
    }
}
