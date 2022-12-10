package Alpha375;
//leetcode
public class ContainsDuplicate04 {
   public boolean containsDuplicate(int[] nums) {
	   for(int i=0;i<nums.length;i++)
	   {
		   int element = nums[i];
		   for(int j=i+1;j<nums.length;j++)
		   {
			   if(nums[j]==element)
			   return true;
		   }
	   }
	   return false;
   }
	
}
