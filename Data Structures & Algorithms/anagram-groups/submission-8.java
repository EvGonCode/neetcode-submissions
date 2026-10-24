class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String key = toKeyString(str);
            if(map.containsKey(key)) map.get(key).add(str);
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        
        return new ArrayList<>(map.values());
    }

    private String toKeyString(String str){
        int[] arr = new int['z'-'a'+1];
        for(char c : str.toCharArray()){
            arr[c - 'a']++;
        }
        return Arrays.toString(arr);
    }
}
