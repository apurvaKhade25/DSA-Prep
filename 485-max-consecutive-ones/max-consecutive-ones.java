class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlen=0;
        for (int i=0; i<nums.length; i++){
            boolean foundzero = false;
            for (int j=i; j<nums.length; j++){
                if (nums[j]==0){
                    maxlen=Math.max(j-i,maxlen);
                    foundzero=true;
                    break;
                }
            }
            if (!foundzero){
                maxlen=Math.max(nums.length-i,maxlen);
            }

        }
        return maxlen;
    }
}