class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
        for(String str: strs){
            Map<Character, Integer> subMap = toMap(str);
            if(map.containsKey(subMap)){
                map.get(subMap).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(subMap, list);
            }
        }
        for(Map.Entry<Map<Character, Integer>, List<String>> entry : map.entrySet()){
            ans.add(map.get(entry.getKey()));
        }
        return ans;
    }

    private Map<Character, Integer> toMap(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else{
                map.put(c, 1);
            }
        }
        return map;
    }
}
