public class App {

  public static void displayArray(String[][] array) {
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        System.out.print(array[row][col] + " ");
      }
      System.out.println();
    }
  }

  public static void displayArray(int[][] array) {
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        System.out.print(array[row][col] + " ");
      }
      System.out.println();
    }
  }

  public static String[][] getPopulatedArray(int rows, int cols) {
    String[][] array = new String[rows][cols];
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        array[row][col] = "[" + row + "][" + col + "]";
      }
    }
    return array;
  }

  public static int[][] getPopulatedIntArray(int rows, int cols) {
    int[][] array = new int[rows][cols];
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        array[row][col] = row + col;
      }
    }
    return array;
  }

  public static boolean isTargetInArray(int[][] array, int target) {
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        if (array[row][col] == target) {
          return true;
        }
      }
    }
    return false;
  }

  public static int[] findTargetLocation(int[][] array, int target) {
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        if (array[row][col] == target) {
          return new int[] { row, col };
        }
      }
    }
    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {

    // array
    // in memory, create some contiguous space to store a bunch of values
    // 32 bits per value (4 bytes) = 12 bytes

    // int[] values = { 3, 5, 2343 };
    // int[][] ints = new int[3][5];
    int[] row1 = { 3, 5, 2343 };
    int[] row2 = { 2, 4 };
    int[] row3 = { 1, 2, 3, 4, 5 };
    int[][] ints = { row1, row2, row3 };

    displayArray(ints);

    String[][] strings = {
        { "Bob", "Smith", "123 Main St" },
        { "Sue", "Jones", "456 Maple Ave" },
        { "John", "Doe", "789 Elm St" }
    };

    displayArray(strings);

    System.out.println();

    String[][] popArray = getPopulatedArray(3, 5);
    displayArray(popArray);

    System.out.println();

    int[][] popIntArray = getPopulatedIntArray(3, 5);
    displayArray(popIntArray);

    System.out.println();

    System.out.println(isTargetInArray(popIntArray, 7));

    System.out.println();

    int[] targetLocation = findTargetLocation(popIntArray, 3);
    System.out.println(targetLocation[0] + ", " + targetLocation[1]);

    // values[1][1] = 12;
    //
    // System.out.println(values[0][0]);
    // System.out.println(values[1][1]);
    // System.out.println(values[2][4]);
    //
    // System.out.println(values.length);
    // System.out.println(values[0].length);
    // System.out.println(values[1].length);
    // System.out.println(values[2].length);
  }
}
