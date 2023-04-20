import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner numsFile;

        try {
            
            int i;
            
            numsFile = new Scanner(new File("nums.txt"));
            PrintWriter pw = new PrintWriter("twice_nums.txt");
            while(numsFile.hasNext()) {
                i = (numsFile.nextInt() * 2);
                pw.println(i);
            }
            pw.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
