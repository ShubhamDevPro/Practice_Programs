public class BS_Ceiling_Floor_Que {
  public static void main(String[] args) {
    int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
    int target = -12;
    int ans = Ceiling_Que(arr, target);
    System.out.println("Answer for the increasing order array is:");
    System.out.println(ans);
    ////////////////////////////////////////////////////////////////////////////
    int[] arr2 = {1003, 234, 104, 56, 47, 46, 35, 28, 14, 10, -1, -12, -144};
    int target2 = 1003;
    int ans2 = Ceiling_Que(arr2, target2);
    System.out.println("Answer for the decreasing order array is:");
    System.out.println(ans2);
  }

  static int Ceiling_Que(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // find whether the array is sorted in ascending or descending
    boolean isAsc;
    isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2; // == (2s+e-s)/2
      if (arr[mid] == target) {
        return mid;
        // answer found
      }
      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else if (target > arr[mid]) {
          start = mid + 1;
        } else {
          // answer found
          return mid;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1; // element not found
  }
}


