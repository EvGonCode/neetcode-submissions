class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while(l < r){
            if(numbers[l] + numbers[r] < target) l++;
            else if(numbers[l] + numbers[r] > target) r--;
            else{
                int[] res = new int[]{l+1, r+1};
                return res;
            }
        }
        return null;
    }
}
