class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)) map.put(n, map.get(n)+1);
            else{
                if(map.size() < 2){
                    map.put(n, 1);
                }
                else{
                    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                        if(entry.getValue() < 2){
                            map.remove(entry.getKey());
                            map.put(n, 1);
                            break;
                        }
                        else{
                            map.put(entry.getKey(), entry.getValue()-1);
                        }
                    }
                }
            }
        }

        int max = 0;
        int maxVal = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxVal = entry.getKey();
            }
        }
        return maxVal;
    }
}