import model.ResultListContainer;

import java.io.File;

/**
 * Created by nofuruct on 15.04.15.
 */
public class Initialize {

private ResultListContainer resList;


    //sets root as the root file of the system.
    public File getSystemRoot() {
        File[] files = File.listRoots();
        System.out.println(files[0]);
        return files[0];
    }

    public void showResults(){
        System.out.println("Search results: " +
                "Found "+ ResultListContainer.getResultList().size()+" results: ");
        for(File f : ResultListContainer.getResultList()){
            System.out.println(f.getName() + " " + f.getAbsolutePath());
        }
    }


}
