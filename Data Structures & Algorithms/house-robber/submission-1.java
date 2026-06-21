class Solution {
    public int rob(int[] nums) {
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++)
        {
            int curr=Math.max(s1,s2+nums[i]);
            s2=s1;
            s1=curr;
        }
        return s1;
    }
}
