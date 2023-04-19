import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jacob");
        names.add("Michael");

        try {
            PrintWriter pw = new PrintWriter("names.txt");
            for (String name: names) {
                pw.println(name);
            }

            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Could not write to file");

        }

    }

}
