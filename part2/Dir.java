package JPL0Lab11.part2;

import java.io.File;

public class Dir { //DONE
    static void listPath(File path) {
        // get all files (or directories) in File path
        File[] files = path.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].toString());
        }
    }
    public static void main(String[] args) {
        listPath(new File("C:\\WINDOWS\\"));
    }
}

