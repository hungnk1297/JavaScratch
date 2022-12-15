package demo_reskill;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        File f = new File("files/names.txt");

        if (!f.exists()) {
            f.createNewFile();
        }

//        FileInputStream fis = new FileInputStream(f);
        FileWriter fw = new FileWriter(f, true);
        fw.write("\nhung");
        fw.close();
    }
}
