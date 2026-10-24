class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2;
        int[] ans = new int[nums.length*n];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < n; j++){
                ans[nums.length * j + i] = nums[i];
            }
        }
        return ans;
    }
}