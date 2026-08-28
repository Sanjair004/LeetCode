class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
            int total=accounts[i][0];
            for(int j=1;j<accounts[i].length;j++)
            {
                accounts[i][j]=accounts[i][j-1]+accounts[i][j];
                total=accounts[i][j];
            }
            if(total>max)
            {
                max=total;
            }
        }
        return max;
    }
}