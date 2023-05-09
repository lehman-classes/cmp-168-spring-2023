class MergeSort {

  public static void mergeSort(int[] arr, int start, int end) {
    if (start >= end) {
      return;
    }
    int mid = (start + end) / 2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);
    merge(arr, start, mid, end);
  }

  public static void merge(int[] arr, int start, int mid, int end) {
    int[] temp = new int[end - start + 1];
    int i = start;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= end) {
      if (arr[i] <= arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    while (i <= mid) {
      temp[k] = arr[i];
      i++;
      k++;
    }
    while (j <= end) {
      temp[k] = arr[j];
      j++;
      k++;
    }
    for (int index = 0; index < temp.length; index++) {
      arr[start + index] = temp[index];
    }
  }

  public static void main(String[] args) {

    int[] arr = { 3, 1, 5, 2, 4 };

    mergeSort(arr, 0, arr.length - 1);

    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
