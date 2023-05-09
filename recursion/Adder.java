class Adder {

  public static int add(int a, int b) {
    if (a == 0)
      return b;
    return add(a - 1, b + 1);
  } // end of add(

  public static void main(String[] args) {

    System.out.println(add(3, 4));

  } // end of main(

}
