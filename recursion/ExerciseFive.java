class ExerciseFive {

  // recursive method to get product of two numbers
  public static int product(int a, int b) {
    if (b == 1) {
      return a;
    } else {
      return a + product(a, b - 1);
    }
  } // product(

  public static void main(String[] args) {

    // print product of 5 and 3
    System.out.println(product(1, 2));

  } // main(

}
