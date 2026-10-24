class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = "";

        for(int i = 0; i < strs[0].length(); i++){
            for(String str : strs){
                if(str.length() == i || str.charAt(i) != strs[0].charAt(i)){
                    return pref;
                }
            }
            pref += strs[0].charAt(i);
        }
        return pref;
    }
}