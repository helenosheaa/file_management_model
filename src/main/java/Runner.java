import db.DBFolder;
import db.DBHelper;
import db.DBOwner;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Owner helen = new Owner("helen", "sheaa");
        DBHelper.save(helen);

        Owner nick = new Owner("nick", "wells");
        DBHelper.save(nick);

        Folder my_code = new Folder("code_files", helen);
        DBHelper.save(my_code);

        Folder your_code = new Folder("code_files", nick);
        DBHelper.save(your_code);

        File file1 = new File("hello_world", ".rb", 10, my_code);
        DBHelper.save(file1);

        File file2 = new File("goodbye_world", ".txt", 20, your_code);
        DBHelper.save(file2);


        List<File> files = DBHelper.getAll(File.class);

        List<File> filesInFolder = DBFolder.getFilesForFolder(my_code);

        List<Folder> foldersOfOwner = DBOwner.getFoldersOfOwner(helen);

    }

}

