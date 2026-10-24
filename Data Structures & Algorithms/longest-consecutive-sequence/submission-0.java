class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int res = 0;

        for(int x : nums){
            if(map.containsKey(x)){
               continue; 
            }
            int newMin = x;
            int newMax = x;
            map.put(x, new ArrayList<>());
            map.get(x).add(newMin);
            map.get(x).add(newMax);
            if(map.containsKey(x-1)){
                newMin = map.get(x-1).get(0);
                map.get(newMin).set(1, newMax);
                map.get(x).set(0, newMin);
            }
            if(map.containsKey(x+1)){
                newMax = map.get(x+1).get(1);
                map.get(newMin).set(1, newMax);
                map.get(newMax).set(0, newMin);
            }
        }

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            int min = entry.getValue().get(0);
            int max = entry.getValue().get(1);
            res = res > max - min + 1 ? res : max - min + 1;
        }
        return res;
    }
}