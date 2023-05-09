/**
 * NonRecursive
 */
public class NonRecursive {

  public static void printGreeting() {
    System.out.println("Hello World!");
  }

  public static void displaySum(int num1, int num2) {
    int sum = num1 + num2;
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
  }

  public static int getValueTripled(int num) {
    int tripled = num * 3;
    System.out.println("The tripled value of " + num + " is " + tripled);
    return tripled;
  }

  public static void displaySumFromZeroUp(int num) {
    int sum = 0;
    for (int i = 0; i <= num; i++) {
      sum += i;
    }
    System.out.println("The sum of all numbers from 0 to " + num + " is " + sum);
  }

  public static void main(String[] args) {

    displaySumFromZeroUp(4);

    // int result = getValueTripled(5);
    // System.out.println("result = " + result);

    // printGreeting();
    //
    // displaySum(3, 5);
    //
    // displaySum(7, 9);
    for (int i = 0; i < 10; i++) {
      displaySum(i, i + 1);
    }
  }
}
