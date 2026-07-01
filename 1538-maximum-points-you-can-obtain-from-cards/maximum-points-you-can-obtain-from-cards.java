class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int leftsum =0;
        int rightsum =0;
        int maxsum=0;
        int n=cardPoints.length;

        for (int i=0; i<k; i++){
            leftsum+=cardPoints[i];
        }
        maxsum=Math.max(leftsum,maxsum);

        int right = n-1;
        for (int r=k-1; r>=0; r--){
            leftsum-=cardPoints[r];
            rightsum+=cardPoints[right];
            right--;
            maxsum=Math.max(leftsum+rightsum,maxsum);
        }
        return maxsum;
        
        
    }
}