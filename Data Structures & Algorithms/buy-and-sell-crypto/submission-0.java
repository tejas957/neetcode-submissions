class Solution {
    public int maxProfit(int[] prices) {
        //[(-6, 0), (0, 0), (4, 4), (2, 4), ]


        int left = 0, right = 1;
        int best = 0;
        while(right < prices.length){
            if(prices[right] > prices[left]) {
                int curr = prices[right]-prices[left];
                best = Math.max(best, curr);
            }
            else {
                left = right;
                
            }
            right++;
        }

        return best;


    }
}
