import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuildTriangle {
    public static void main(String[] args) throws IOException {

        int [] sides;

        do  {
            System.out.println("Insert 3 values so it is possible to build a triangle.");
            sides = insertValidSides();
        } while (!isTriangleBuildable(sides));

        Triangle triangle = new Triangle(sides);

        System.out.printf("\n%d,%d,%d -> %s\n", sides[0], sides[1], sides[2], triangle.typeOfTriangle());

    }

    private static int[] insertValidSides() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int i = 0;
        int [] validSides =  new int [3];

        while (i<3) {
            System.out.println("Please insert the side " + (i+1));
            input = reader.readLine();

            if (isSingleInputValid(input)){
                validSides[i] = Integer.parseInt(input);
                i++;
            }
        }

        return validSides;
    }

    private static boolean isSingleInputValid (String input) {
        int valueParsed;

        try{
            valueParsed = Integer.parseInt(input);
        }catch (NumberFormatException ex) {
            System.out.println("Please insert a positive integer number");
            return false;
        }

        if (valueParsed <= 0){
            System.out.println("Please insert a positive integer number");
            return false;
        }

        return true;
    }

    private static boolean isTriangleBuildable(int[] sides){

        if (sides[0]< (sides[1] + sides[2]) && sides[1]< (sides[0] + sides[2]) && sides[2]< (sides[0] + sides[1])){
            System.out.println("Triangle is buildable");
            return true;
        }
        else{
            System.out.println("Please insert a valid group of sides. No side should be bigger than the sum of the other two sides.");
            return false;
        }
    }


}
