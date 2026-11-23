class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        s = s.toLowerCase();
        while(l < r){
            if(!isAlphaNum(s.charAt(l))){
                l++;
            }
            else if(!isAlphaNum(s.charAt(r))){
                r--;
            }
            else{
                if(s.charAt(l) != s.charAt(r)) return false;
                l++;
                r--;
            }
        }
        return true;
    }

    private boolean isAlphaNum(char c){
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
