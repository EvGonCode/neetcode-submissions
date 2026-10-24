class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(smap.containsKey(schar)) smap.put(schar, smap.get(schar)+1);
            else{smap.put(schar, 1);}

            if(tmap.containsKey(tchar)) tmap.put(tchar, tmap.get(tchar)+1);
            else{tmap.put(tchar, 1);}
        }

        for(Map.Entry<Character, Integer> entry : smap.entrySet()){
            if(!entry.getValue().equals(tmap.get(entry.getKey()))) return false;
        }
        return true;
    }
}
