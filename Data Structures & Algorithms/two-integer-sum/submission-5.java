class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[]{0,0};

        for(int i = 0; i < nums.length; i++){
            int newTarget = target - nums[i];
            if(map.containsKey(newTarget)){
                ans[0] = map.get(newTarget);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
