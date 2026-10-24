class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if (nums[i] <= 0) nums[i] = nums.length+1;
        }

        for(int i = 0; i < nums.length; i++){
            int x = Math.abs(nums[i]) - 1;
            if(x >= 0 && x < nums.length){
                nums[x] = Math.abs(nums[x]) * -1;
            } 
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0) return i+1;
        }
        return nums.length+1;
    }
}