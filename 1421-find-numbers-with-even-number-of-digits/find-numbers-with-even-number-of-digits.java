class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            int countd=0;
            while(temp!=0)
            {
                temp/=10;
                countd++;
            }
            if(countd%2==0)
            {
                count++;
            }
        }
        return count;
    }
}