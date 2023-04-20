import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleArrayList;
        rectangleArrayList = new ArrayList<>();

        try {
            Scanner rectangleData;
            Rectangle temp;

            rectangleData = new Scanner(new File("rectangle_data.txt"));
            while(rectangleData.hasNext()) {
                temp = new Rectangle(rectangleData.nextInt(), rectangleData.nextInt());
                rectangleArrayList.add(temp);

            }

            rectangleData.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        printRectangles(rectangleArrayList);
    }
    public static void printRectangles(ArrayList<Rectangle> rectangleArrayList) {
        for(Rectangle r : rectangleArrayList) {
            System.out.println(r.getLength() + " " + r.getWidth());
        }
    }
}
