package WorkWithFIles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testwritefile.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("text to file");
        pw.close();
    }
}
