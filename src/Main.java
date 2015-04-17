import service.ISearch;
import service.SearchImpl;

import java.io.File;

/**
 * Created by nofuruct on 15.04.15.
 */
public class Main {
    public static void main(String[] args) {

        String searchFileName = "av.jpg";
        ISearch iSearch = new SearchImpl();
        Initialize initialize = new Initialize();
        File file = new File("/Users/apple/Desktop");
        iSearch.searchFile(searchFileName, file /* initialize.getSystemRoot()*/);
        initialize.showResults();
    }
}
