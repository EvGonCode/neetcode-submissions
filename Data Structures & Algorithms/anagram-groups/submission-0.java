class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> resMap = new HashMap<>();
        for(String str : strs){
            Map<Character, Integer> subMap = new HashMap<>();
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(subMap.containsKey(c)) subMap.put(c, subMap.get(c)+1);
                else{
                    subMap.put(c,1);
                }
            }
            if(resMap.containsKey(subMap)){
                resMap.get(subMap).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                resMap.put(subMap, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<Map<Character, Integer>, List<String>> entry : resMap.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}
