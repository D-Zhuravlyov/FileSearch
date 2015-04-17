package service;


import java.io.File;
import java.util.ArrayList;

public interface ISearch {

    void searchFile(String filename, File searchDirectory);
    void addResult(File file);
}
