package y1.s2.Modules.Module1.cse205_h01.h01.src;

// CLASS: H01_43
// AUTHOR: Eyad Mohamed AbdelMohsen Ghanem,
// your ASURITEID username,
// your email address

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class H01_43 {
    public static void main(String[] pArgs) {
        new H01_43().run();
    }

    private String getFileName() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        return kbd.next();
    }

    private void listFile(String pFileName) {
        try {
            Scanner in = new Scanner(new File(pFileName));
            PrintWriter out = new PrintWriter(pFileName + ".txt");
            int lineNum = 0;
            while (in.hasNext()) {
                String line = in.nextLine();
                out.printf("[%03d] %s%n", ++lineNum, line);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException pExcept) {
            System.out.println("Could not open '" + pFileName + "' for reading.");
        }
    }

    private void run() {
        listFile(getFileName());
    }
}