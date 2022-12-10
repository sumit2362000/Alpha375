package Alpha375;

import java.util.Arrays;

public class KthlargestElement10 {
  public int findKthLargest(int[] nums, int k) {
	  final int N = nums.length;
	  Arrays.sort(nums);
	  return nums[N-k];
  }
}
