class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> result = new ArrayList<>();

       int i = 0;
       while(i < nums.length-2){
        int sum;
        int l = i+1;
        int r = nums.length-1;
        while(l < r){
            sum = nums[i] + nums[l] + nums[r];
            if(sum == 0){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[l]);
                list.add(nums[r]);
                result.add(list);
            }
            else if(sum > 0){
                while(r > l && nums[r] == nums[r-1]){
                    r--; 
                }
                r--;
                continue;
            }
            while(l < r && nums[l] == nums[l+1])l++;
            l++;
        }

        while(i < nums.length-2 && nums[i] == nums[i+1])i++;
        i++;
       }
       return result;
    }
}
