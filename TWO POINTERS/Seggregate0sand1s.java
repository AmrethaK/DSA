
/*Segregate 0s and 1s
Solved
Difficulty: EasyAccuracy: 54.25%Submissions: 197K+Points: 2Average Time: 15m
Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

Examples :

Input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 0, 0, 1, 1, 1, 1, 1].
Input: arr[] = [1, 1]
Output: [1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1]
Constraints:

1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 1
 */
import java.util.Arrays;

public class Seggregate0sand1s {

  void segregate0and1(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      // Advance left pointer while it points to 0
      while (left < right && arr[left] == 0) {
        left++;
      }
      // Move right pointer backward while it points to 1
      while (left < right && arr[right] == 1) {
        right--;
      }
      // Swap misplaced 1 at left and 0 at right
      if (left < right) {
        arr[left] = 0;
        arr[right] = 1;
        left++;
        right--;
      }
    }
  }

  public static void main(String[] args) {
    Seggregate0sand1s solver = new Seggregate0sand1s();

    int[] arr1 = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
    System.out.println("Before: " + Arrays.toString(arr1));
    solver.segregate0and1(arr1);
    System.out.println("After:  " + Arrays.toString(arr1));

    System.out.println();

    int[] arr2 = { 1, 1 };
    System.out.println("Before: " + Arrays.toString(arr2));
    solver.segregate0and1(arr2);
    System.out.println("After:  " + Arrays.toString(arr2));
  }
}