public class HomeworkTwo {

  public static int sum(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }

    return total;
  }

  public static int sum(int[] arr, int firstIndex, int lastIndex) {
    int total = 0;
    if(firstIndex < 0 || lastIndex > arr.length-1) {
      return -666;
    }

    for (int i = firstIndex; i <= lastIndex; i++) {
      total += arr[i];
    }
    return total;
  }
  
  public static void main(String[] args) {
    
    int[] myArray = {45, 22, 18, 89, 82, 79, 15, 69, 100, 55, 48, 72, 16, 98, 57, 75, 44, 32, 21, 14, 7, 16, 49, 58, 72};

    int result = sum(myArray, -1, 2);

    System.out.println(result);

    // if(result != 1253) {
    //   System.err.println("Not working");
    // } else {
    //   System.out.println("All good");
    // }


  }
}
