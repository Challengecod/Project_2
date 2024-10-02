import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner linear = new Scanner(System.in);
    System.out.print("Enter your first coordinate point: ");
    String pointStrOne = linear.nextLine();
    System.out.print("Enter your second coordinate point: ");
    String pointStrTwo = linear.nextLine();

    // replace the commas with a blank space
    pointStrOne = pointStrOne.replace("(", "").replace(")", "");
    pointStrTwo = pointStrTwo.replace("(", "").replace(")", "");
    // find the position of the comma
    int commaPosition = pointStrOne.indexOf(",");
    int commaPositionTwo = pointStrTwo.indexOf(",");
    // find the substring the number
    int xOne = Integer.parseInt(pointStrOne.substring(0,commaPosition));
    int yOne = Integer.parseInt(pointStrOne.substring(commaPosition+1, pointStrOne.length()));
    int xTwo = Integer.parseInt(pointStrTwo.substring(0,commaPositionTwo));;
    int yTwo = Integer.parseInt(pointStrTwo.substring(commaPosition+1, pointStrTwo.length()));;

    LinearEquation points = new LinearEquation(xOne, yOne, xTwo, yTwo);
    System.out.print(points.toString());

    System.out.print("Enter a third x value: ");
    String xThreeStr = linear.nextLine();
    double xThree = Double.parseDouble(xThreeStr);

    System.out.print("Solved coordinate point is : (" + xThree + "," + points.thirdValue(xThree) +")");

    linear.close();

  }
}
