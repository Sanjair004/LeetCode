class Solution {
    public int maximumCount(int[] nums) {
        int countp=0;
        int countd=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                countp++;
            }
            else if(nums[i]<0)
            {
                countd++;
            }
        }
        return (countp>countd)?countp:countd;
    }
}