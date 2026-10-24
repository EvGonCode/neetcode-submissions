class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((s1, s2) -> s2[1] - s1[1]);
        
        for(int n : nums){
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(new int[]{entry.getKey(), entry.getValue()});
        }
        int[] arr = new int[k];
        while(k > 0){
            arr[k-1] = pq.poll()[0];
            k--;
        }
        return arr;
    }
}
