class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        l_sum=0
        r_sum=0
        max_sum=0
        n=len(cardPoints)

        for i in range (0,k):
            l_sum +=cardPoints[i]
        max_sum=l_sum

        r_ind=n-1
        for i in range(k-1,-1,-1):
            l_sum-=cardPoints[i]
            r_sum+=cardPoints[r_ind]
            r_ind-=1
        
            max_sum=max(max_sum,l_sum+r_sum)
        return max_sum