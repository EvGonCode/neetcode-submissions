class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }

        for(int x : nums){
            if(x > 0 && x < n+1){
                arr[x-1] = 1;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) return i+1;
        }
        return n+1;
    }
}