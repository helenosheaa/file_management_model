import db.DBFolder;
import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder my_code = new Folder("code_files");
        DBHelper.save(my_code);

        Folder your_code = new Folder("code_files");
        DBHelper.save(your_code);

        File file1 = new File("hello_world", ".rb", 10, my_code);
        DBHelper.save(file1);

        File file2 = new File("goodbye_world", ".txt", 20, your_code);
        DBHelper.save(file2);


        List<File> files = DBHelper.getAll(File.class);

        List<File> filesInFolder = DBFolder.getFilesForFolder(my_code);

    }

}

