class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            int[] entry = new int[]{temperatures[i], i};
            if(stack.isEmpty() || stack.peek()[0] >= entry[0]){
                stack.push(entry);
                continue;
            }

            while(!stack.isEmpty() && stack.peek()[0] < entry[0]){
                result[stack.peek()[1]] = entry[1] - stack.peek()[1];
                stack.pop();
            }
            stack.push(entry);
        }

        while(!stack.isEmpty()){
            result[stack.peek()[1]] = 0;
            stack.pop();
        }
        return result;
    }
}
