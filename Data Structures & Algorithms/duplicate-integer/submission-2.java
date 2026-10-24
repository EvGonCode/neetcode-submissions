class Solution {
    public boolean hasDuplicate(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for(int i: nums){
            if(stack.contains(i)) return true;
            stack.add(i);
        }
        return false;
    }
}