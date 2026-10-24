class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((s1, s2) -> s2[1] - s1[1]);
        
        for(int n : nums){
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n)+1);
        }

        List<Integer>[] list = new List[nums.length+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(list[entry.getValue()] == null) list[entry.getValue()] = new ArrayList<>();
            list[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        for(int i = list.length-1; i > -1; i--){
            if(list[i] == null) continue;
            for(int x : list[i]){
                k--;
                res[k] = x;
                if(k == 0) return res;
            }
        }
        
        return res;
    }
}
