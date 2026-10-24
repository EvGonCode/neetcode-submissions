class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        s = s.toLowerCase();
        System.out.println(s);

        while(l < r){
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            if(!isAlphanumeric(lc)) l++;
            else if(!isAlphanumeric(rc)) r--;
            else{
                if(rc != lc) return false;
                l++;
                r--;
            }
        }
        return true;
    }

    private boolean isAlphanumeric(char c){
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}

