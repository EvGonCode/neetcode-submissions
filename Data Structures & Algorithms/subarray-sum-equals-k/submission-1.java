class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int sum = 0;
        map.put(0, 1);
        for(int x : nums){
            sum += x;
            int pref = sum - k;
            if(map.containsKey(pref)){
                result += map.get(pref);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}