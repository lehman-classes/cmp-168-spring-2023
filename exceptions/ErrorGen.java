public class ErrorGen {

  public static void recursiveNum(int num) {
    if (num == 0) {
      System.out.println("Done!");
    } else {
      System.out.println(num);
      recursiveNum(++num);
    }
  }

  public static void main(String[] args) {
    recursiveNum(-5);
  }
}
