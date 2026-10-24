class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == 0) return new int[0];

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] count = new List[nums.length+1];

        for(int i = 0; i < count.length; i++){
            count[i] = new ArrayList<Integer>();
        }

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            count[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i = count.length-1; i >= 0; i--){
            for(int n : count[i]){
                ans[index++] = n;
                if(index == k) return ans;
            }
        }
        return ans;
    }
}
