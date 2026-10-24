class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = "";
        int i = 0;
        while(pref.length() < strs[0].length()){
            char c = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].length() <= i) return pref;
                if(strs[j].charAt(i) != c) return pref;
            }
            pref += c;
            i++;
        }
        return pref;
    }
}