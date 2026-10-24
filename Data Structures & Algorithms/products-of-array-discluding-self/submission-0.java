class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length+2];
        int[] post = new int[nums.length+2];
        pref[0] = 1;
        pref[pref.length-1] = 1;
        post[0] = 1;
        post[post.length-1] = 1;
        for(int i = 0; i < nums.length; i++){
            pref[i+1] = nums[i];
            post[i+1] = nums[i];
        }

        for(int i = 1; i < pref.length-1; i++){
            pref[i] = pref[i] * pref[i-1];
            post[post.length - i - 1] = post[post.length - i - 1] * post[post.length - i];
        }

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = pref[i] * post[i+2];
        }
        return res;

    }
}





/**
"" 1,  2,  4,  6,  ""

1, 1,  2,  8,  48, 1
1, 48, 48, 24, 6,  1

"" 48, 24, 12, 8 ""
**/