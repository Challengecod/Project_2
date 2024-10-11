public class LinearEquation {
  private double xOne;
  private double xTwo;
  private double yOne;
  private double yTwo;

  // Constructor
  public LinearEquation(double xOne, double yOne, double xTwo, double yTwo) {
    this.xOne = xOne;
    this.yOne = yOne;
    this.xTwo = xTwo;
    this.yTwo = yTwo;
  }

  // Returns the slope after using the slope formula
  public double slope() {
    if(xOne - xTwo == 0){
      return 0;
    }
    double slope = (yOne - yTwo)/( xOne - xTwo);
    return slope;
  }

  public String equationSlope() {
    //divide by zero
    if (slope() == 0) {
      return "undefined";
    }
    // checks if slope is decimal
    if (slope() % 1 != 0) {
      // if slope is negative
      if (0 > slope()) {
        return "-" + (int) Math.abs (yOne - yTwo) + "/" + (int) Math.abs((xOne - xTwo));
      }
      // if slope is postive but both the x and y deltas are negatives cancels out to a positive
      else if (yOne - yTwo<0 && xOne - xTwo<0 ){
        return (int) Math.abs((yOne - yTwo)) + "/" + (int) Math.abs((xOne - xTwo));
      }

      // if it's a decimal we just put the fraction in between
      else{
        return (int) (yOne - yTwo) + "/" + (int) (xOne - xTwo);
      }
    }
     // else return the whole number slope as a String
    else{
      return Integer.toString((int)slope());
    }
  }
  
  // formats the slope
  public String equation(){
    
    // if the slope of the x equals zero
    if (equationSlope().equals("undefined")){
      return "undefined";
    }

    // if y intercept is zero we don;t need to add the y-intercept
    if (yIntercept() == 0) {
      return "y = " + equationSlope() + "x";
    }
      
    // y intercept is negative
    else if (yIntercept() < 0){
      return "y = " + equationSlope() + "x " + yIntercept();
    }
      
    // y intercept is positive
    else{
      return "y = " + equationSlope() + "x + " + yIntercept();
    }
  }

  public double yIntercept() {
    double yIntercept = yOne - (xOne * slope());
    yIntercept = yIntercept * 100;
    yIntercept = Math.round(yIntercept);
    yIntercept = yIntercept / 100;
    return yIntercept;

  }

  public double distance() {
    double distance = Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2);
    double distanced = Math.sqrt(distance);
    double roundDistance = Math.round(distanced * 100);
    double divideDistance = roundDistance / 100;
    return divideDistance;
  }

  public double thirdValue(double xThree) {
    double yThree = xThree * slope() + yIntercept();
    yThree = yThree * 100;
    yThree = Math.round(yThree);
    yThree = yThree / 100;
    return yThree;
  }
  
// displays all of the information of the coordinates, slope, yintercept, equation and distance.
  public String toString() {
    String s =
            "First pair: (" + (int) xOne + "," + (int) yOne + ")\n"
                    + "Second pair: (" + (int) xTwo + "," + (int) yTwo + ")\n"
                    + "Slope of line: " + equationSlope() + "\n"
                    + "Y-intercept: " + yIntercept() + "\n"
                    + "Slope intercept form: " + equation() + "\n"
                    + "Distance between points: " + distance() + "\n";
    return s;

  }
}





