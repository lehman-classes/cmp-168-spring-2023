public class Chapter7Exercises {
  
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(String.valueOf(arr[i]) + ' ');
    }
    System.out.println();
  }

  // Exercise 1
  public static void swap(int indexA, int indexB, int[] arr) {
    int tmp = arr[indexA];
    arr[indexA] = arr[indexB];
    arr[indexB] = tmp;
  }

  // Exercise 2
  public static void displayArray(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
     System.out.println(arr[i]); 
    }
  }

  // Exercise 3
  public static int findMinimumValue(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
     if(arr[i] < min) {
        min = arr[i];
      } 
    }
    return min;
  }

  public static void main(String[] args) {

    // Exercise 3
    int[] arr = new int[] {24, 7, 19, 8, 11, 12, 6};
    int minimun = findMinimumValue(arr);
    System.out.println(minimun);
    
    // Exercise 2
    // String[] names = new String[] {"Jesse", "Hank", "Walter", "Saul"};
    // displayArray(names);

    // Exercise 1
    // int[] arr = new int[] {6, 1, 9, 4, 7};
    // printArray(arr);
    // swap(0, 4, arr);
    // printArray(arr);
  }
}
