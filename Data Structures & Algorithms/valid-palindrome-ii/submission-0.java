class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() < 2) return true;
        int margine = 1;
        return recfun(s, 0, s.length()-1, margine);
    }

    private boolean recfun(String s, int l, int r, int margine){
        if(l == r || l > r) return true;
        if(s.charAt(l) == s.charAt(r)){
            return recfun(s, l+1, r-1, margine);
        }
        else if(margine > 0){
            return (recfun(s, l+1, r, margine-1) || recfun(s, l, r-1, margine-1));
        }
        return false;
    }
}