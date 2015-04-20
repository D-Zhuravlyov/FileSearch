package model;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by nofuruct on 17.04.15.
 */
public class ResultListContainer {

    public ResultListContainer() {
    }


    public static class ResultListHolder {
        public static final ArrayList<File> RESULT_LIST = new ArrayList<File>();
    }


    public static ArrayList<File> getResultList() {
        return ResultListHolder.RESULT_LIST;
    }

}
