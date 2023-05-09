/**
 * CountDown
 */
public class CountDown {

  public static void printCountDownTail(int n) {
    if (n == 0) { // base case
      System.out.println("Happy New Year!");
    } else {
      System.out.println(n);
      // this is a tail recursion because the recursive call is the last thing
      printCountDownTail(n - 1); // calling itself
    }
  }

  public static void printCountDownHead(int n) {
    if (n == 0) { // base case
      System.out.println("Happy New Year!");
    } else {
      // this is a head recursion because the recursive call is the first thing
      printCountDownHead(n - 1); // calling itself
      System.out.println(n);
    }
  }

  public static void main(String[] args) {

    // System.out.println(3);
    // System.out.println(2);
    // System.out.println(1);
    // System.out.println("Happy New Year!");
    printCountDownHead(3);
  }
}
