class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        
        for(int n : nums){
            set.add(n);
        }

        int index = 0;
        while(set.size() > 0){
            int localMax = 0;
            int curr = 0;
            while(index < nums.length && !set.contains(nums[index])){
                index++;
            }
            if(index >= nums.length) break;
            curr = nums[index];
            while(set.contains(curr)){
                localMax++;
                set.remove(curr--);
            }
            curr = nums[index]+1;
            while(set.contains(curr)){
                localMax++;
                set.remove(curr++);
            }
            max = max > localMax ? max : localMax;
            index++;
        }

        return max;
    }
}
