class MinStack {
    private List<int[]> minList;
    private List<Integer> list;

    public MinStack() {
        minList = new ArrayList<>();
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        if(list.size() == 0 || minList.getLast()[0] > val){
            minList.add(new int[]{val, list.size()});
        }
        list.add(val);
    }
    
    public void pop() {
        list.removeLast();
        if(minList.getLast()[1] == list.size()){
            minList.removeLast();
        }
    }
    
    public int top() {
        return list.getLast();
    }
    
    public int getMin() {
        return minList.getLast()[0];
    }
}
