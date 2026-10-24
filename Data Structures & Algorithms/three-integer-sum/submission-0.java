class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> threeSum(int[] nums) {
        result = new ArrayList<>();
        Arrays.sort(nums);
        recfun(nums, 0, new ArrayList<>());
        return result;
    }

    private void recfun(int[] nums, int i, List<Integer> list){
        if(list.size() == 3){
            if(list.get(0) + list.get(1) + list.get(2) == 0){
                result.add(new ArrayList(list));
            }
        }else{
            if(i >= nums.length) return;
            list.add(nums[i]);
            recfun(nums, i+1, list);
            list.remove(list.size()-1);
            while(i < nums.length - 1 && nums[i] == nums[i+1]){
                i++;
            }
            recfun(nums, i+1, list);
        }
    }
}
