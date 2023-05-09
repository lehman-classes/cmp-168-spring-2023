class ExerciseThree {

  public static void countToZero(int n) {
    if (n == 0) {
      System.out.println("Blastoff!");
      return;
    }

    if (n < 0) {
      System.out.println(n);
      countToZero(n + 1);
    } else {
      System.out.println(n);
      countToZero(n - 1);
    }
  }

  public static void main(String[] args) {
    countToZero(0);

  }
}
