class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> operations = new HashSet<>();
        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");

        for(String s : tokens){
            if(operations.contains(s)){
                int y = stack.pop();
                int x = stack.pop();

                switch (s) {
                    case "+": stack.push(x + y); break;
                    case "-": stack.push(x - y); break;
                    case "*": stack.push(x * y); break;
                    case "/": stack.push(x / y); break;
                }
            }
            else{
                stack.push(Integer.valueOf(s));
            }
        }
        return(stack.pop());
    }
}
