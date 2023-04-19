import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileOutputFun {
    public static void main(String[] args) {


        try {
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hello World!");
            pw.println("Testing file output");
            pw.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Could not write to file.");
        }
    }
}
