public class Demo {

  public static void printArray(int[] array) {
    // print each element in the array
    for (int i = 0; i < array.length; i++) {
      System.out.print(String.valueOf(array[i]) + ' ');
    }
    System.out.println();
  }

  public static int[] copyOfArray(int[] array) {
    int[] copy = new int[array.length];

    for (int i = 0; i < array.length; i++) {
     copy[i] = array[i]; 
    }

    return copy;
  }
  
  public static void main(String[] args) {
    
    int[] nums = new int[] {2, 6, 8, 11, 7};

    // [0]  [1]  [2] [ 3] [4]
    // [2]  [6]  [8] [11] [7]

    // System.out.println(num[3]);
    // num[3] = 0;
    // System.out.println(num[3]);

    // printArray(nums);
    // nums[2] = 5;
    // printArray(nums);

    // int tmp = nums[3];
    // nums[3] = nums[0];
    // nums[0] = tmp;

    // printArray(nums);
    // int[] newArray = copyOfArray(nums);
    // printArray(newArray);

    int[] newArray = nums;
    newArray[0] = 22;
    printArray(nums);
    printArray(newArray);
    

    // System.out.println("prog continues here");
  }
}
