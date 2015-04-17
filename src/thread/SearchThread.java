package thread;

import service.ISearch;
import service.SearchImpl;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by nofuruct on 15.04.15.
 */
public class SearchThread implements Runnable {

    private ISearch search = new SearchImpl();
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
            fileList = root.listFiles();
            for (File f : fileList) {
                if (f.getName().equals(searchKey)) {
                    search.addResult(f);
                }
            }


        }
    }
}
