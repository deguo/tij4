package ch18io;

import java.io.*;

/**
 * (Execute to see output)
 */
public class D10_BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(D06_BufferedInputFile.read("src/main/java/ch18io/D10_BasicFileOutput.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        // Show the stored file:
        System.out.println(D06_BufferedInputFile.read(file));
    }
}