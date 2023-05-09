/**
 * Recursive
 */
public class Recursive {

  private int count = 0;

  public int callingItself(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be greater than 0");
    }
    if (n == 0) {
      return 1;
    }
    return n * callingItself(n - 1);
  }

  public void callingItself() {
    if (count == 10) {
      return;
    }
    count++;
    System.out.println("Calling itself " + count + " times");
    callingItself();
  }

  public void callingItselfIteractive() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Calling itself " + i + " times");
    }
  }

  public static void main(String[] args) {

    Recursive recursive = new Recursive();
    // recursive.callingItself(-1);
    recursive.callingItself();
    // recursive.callingItselfIteractive();

    // int result = recursive.callingItself(5);
    // System.out.println("Result: " + result);

  }
}
