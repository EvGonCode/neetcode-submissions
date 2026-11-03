class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        List<int[]> pairs = new ArrayList<>();
        for(int i = 0; i < position.length; i++){
            pairs.add(new int[]{position[i], speed[i]});
        }
        pairs.sort((a, b) -> Integer.compare(b[0], a[0]));



        for(int i = 0; i < pairs.size(); i++){
            double time = (double)(target - pairs.get(i)[0]) / pairs.get(i)[1];
            if(stack.isEmpty() || stack.peek() < time){
                stack.push(time);
            }
        }
        return stack.size();
    }
}
