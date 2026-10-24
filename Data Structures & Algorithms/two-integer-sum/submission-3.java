class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int dif = target - nums[i];
            if(map.containsKey(dif)){
                result[0] = map.get(dif);
                result[1] = i;
                return result;
            }else{
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
