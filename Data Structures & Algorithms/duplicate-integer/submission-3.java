class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> stack = new HashSet<>();
        for(int i: nums){
            if(stack.contains(i)) return true;
            stack.add(i);
        }
        return false;
    }
}