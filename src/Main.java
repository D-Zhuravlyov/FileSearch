import service.ISearch;
import service.SearchImpl;

import java.io.File;

/**
 * Created by nofuruct on 15.04.15.
 */
public class Main {
    public static void main(String[] args) {

        // init data
        // producer - consumer multithreading

        // then link all beans

        String searchFileName = "av.jpg";
        ISearch iSearch = new SearchImpl();
        Initialize initialize = new Initialize();
        String PATH = "/Users/apple/Documents";
        iSearch.searchFile(searchFileName, PATH /* initialize.getSystemRoot()*/);
        initialize.showResults();
    }
}
