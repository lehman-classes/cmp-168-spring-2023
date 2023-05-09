class BaseToExponent {

  public static int getBaseToExponent(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    } else {
      return base * getBaseToExponent(base, exponent - 1);
    }
  }

  public static void main(String[] args) {

    System.out.println(getBaseToExponent(3, 4));
  }
}
