class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = 3;
        Map<Integer, Integer> map = new HashMap<>();

        for(int x : nums){
            if(map.containsKey(x)) map.put(x, map.get(x)+1);
            else if(map.size() <  n-1){
                map.put(x, 1);
            }
            else{
                Map<Integer, Integer> newMap = new HashMap<>();

                for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                    if(entry.getValue() > 1) newMap.put(entry.getKey(), entry.getValue() - 1);
                }
                map = newMap;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int freq = 0;
            for(int x : nums){
                if (x == entry.getKey()) freq++;
            }
            if(freq > nums.length / n){
                result.add(entry.getKey());
            }
        }

        return result;
    }
}