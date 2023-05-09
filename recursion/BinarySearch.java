class BinarySearch {

  public static int binarySearch(int[] arr, int target, int start, int end) {
    if (start > end) {
      return -1;
    }
    int mid = (start + end) / 2;
    if (arr[mid] == target) {
      return mid;
    }
    if (arr[mid] > target) {
      return binarySearch(arr, target, start, mid - 1);
    }
    return binarySearch(arr, target, mid + 1, end);
  }

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5 };

    System.out.println(binarySearch(arr, 5, 0, arr.length - 1));

  }
}
