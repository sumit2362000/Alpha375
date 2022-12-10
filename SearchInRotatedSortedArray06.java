package Alpha375;
//leetcode
public class SearchInRotatedSortedArray06 {
       public int search(int[] nums,int target) {
    	   for(int i=0;i<nums.length-1;i++) {
    		   if(nums[i]==target) {
    			   return i;
    		   }
    	   }
    	   return -1;
       }
}
