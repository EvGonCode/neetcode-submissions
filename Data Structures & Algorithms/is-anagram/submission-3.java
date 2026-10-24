class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(mapS.containsKey(charS)) mapS.put(charS, mapS.get(charS) + 1);
            else{
                mapS.put(charS, 1);
            }
            if(mapT.containsKey(charT)) mapT.put(charT, mapT.get(charT) + 1);
            else{
                mapT.put(charT, 1);
            }
        }
        return mapS.equals(mapT);
    }
}
