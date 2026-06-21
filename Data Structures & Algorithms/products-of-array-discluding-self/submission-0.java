class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pl=1,pr=1;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=pl;
            pl=pl*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            a[i]*=pr;
            pr=pr*nums[i];
        }
        return a;
    }
}  
