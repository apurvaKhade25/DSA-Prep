class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        int n=nums.length;

        for (int j=0; j<n; j++){
            if (nums[j]==1){
                count++;
            }else{
                maxcount=Math.max(count,maxcount);
                count=0;
            }
        }
        return Math.max(maxcount,count);
        
    }
}