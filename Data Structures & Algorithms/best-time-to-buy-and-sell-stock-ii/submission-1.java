class Solution {
    public int maxProfit(int[] prices) {
        int cur = prices[0];
        int sum = 0;

        for(int x : prices){
            if(cur < x){
                sum += x - cur;
            }
            cur = x;
        }

        return sum;

    }
}