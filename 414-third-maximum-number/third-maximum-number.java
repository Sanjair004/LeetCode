class Solution {
    public int thirdMax(int[] nums) {
        long Fmax=Long.MIN_VALUE;
        long Smax=Long.MIN_VALUE;
        long Tmax=Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>Fmax)
            {
                Tmax=Smax;
                Smax=Fmax;
                Fmax=nums[i];
            }
            else if(nums[i]>Smax && nums[i]!=Fmax)
            {
                Tmax=Smax;
                Smax=nums[i];
            }
            else if(nums[i]>Tmax && nums[i]!=Smax && nums[i]!=Fmax)
            {
                Tmax=nums[i];
            }
        }
     return Tmax==Long.MIN_VALUE?(int) Fmax:(int) Tmax;
}
}