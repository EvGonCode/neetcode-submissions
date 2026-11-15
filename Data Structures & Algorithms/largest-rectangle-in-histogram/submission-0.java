class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < heights.length; i++){
            if(stack.isEmpty() || stack.peek()[0] <= heights[i]) stack.push(new int[]{heights[i], i});
            else{
                if(max < heights[i]){
                    max = heights[i];
                }

                int prevH = 0;
                int prevId = 0;
                while(!stack.isEmpty() && stack.peek()[0] >= heights[i]){
                    prevH = stack.peek()[0];
                    prevId = stack.peek()[1];
                    
                    int localArea = (i - prevId) * prevH;
                    if(max < localArea) max = localArea;

                    stack.pop();
                }
                stack.push(new int[]{heights[i], prevId});
            }
        }

        int prevH = 0;
        int prevId = 0;
        while(!stack.isEmpty()){
            prevH = stack.peek()[0];
            prevId = stack.peek()[1];
            if(prevH > max) max = prevH;

            int localArea = (heights.length - prevId) * prevH;
            if(max < localArea) max = localArea;

            stack.pop();
        }
        return max;
    }
}
