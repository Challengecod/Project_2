public class LinearEquation {
  private double xOne;
  private double xTwo;
  private double yOne;
  private double yTwo;
  private double xThree;


  // Constructor
  public LinearEquation(double xOne, double yOne, double xTwo, double yTwo) {
    this.xOne = xOne;
    this.yOne = yOne;
    this.xTwo = xTwo;
    this.yTwo = yTwo;
  }

//  public LinearEquation(double xThree) {
//    this.xThree = xThree;
//  }

  // Returns the slope after using the slope formula
  public double slope() {
    double slope = (yOne - yTwo) / (xOne - xTwo);
    double slopeRound = (Math.round(slope) * 100) / 100;
    return slopeRound;
  }

  public double yIntercept() {
    double yIntercept = yOne - (xOne * slope());
    double yInterceptRound = (Math.round(yIntercept) * 100) / 100;
    return yInterceptRound;
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
    return yThree;
  }

  public String toString() {
    String s = "First pair: (" + (int) xOne + "," + (int) yOne + ")\n"
            + "Second pair: (" + (int) xTwo + "," + (int) yTwo + ")\n"
            + "Slope of line: " + slope() + "\n"
            + "Y-intercept: " + yIntercept() + "\n"
            + "Slope intercept form: y = " + slope() + "x + " + yIntercept() + "\n"
            + "Distance between points: " + distance() + "\n";
    return s;

  }
}




