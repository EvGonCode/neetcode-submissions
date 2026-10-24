class Solution {
    public int search(int[] nums, int target) {
        int bot = 0;
        int top = nums.length-1;
        int mid = 0;

        if(nums[0] > target || nums[nums.length-1] < target) return -1;

        while(bot < top){
            mid = (top + bot) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                top = mid - 1;
            }
            else{
                bot = mid + 1;
            }
        }

        if(nums[top] == target) return top;
        if(nums[bot] == target) return bot;

        return -1;
    }
}
