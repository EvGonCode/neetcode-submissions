class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        s = s.toLowerCase();
        while(l < r){
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            
            if(!isAlphanumeric(lc)){
                l++;
                continue;
            }
            if(!isAlphanumeric(rc)){
                r--;
                continue;
            }
            if(lc != rc) return false;

            r--;
            l++;
        }
        return true;
    }

    private boolean isAlphanumeric(char c){
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}

