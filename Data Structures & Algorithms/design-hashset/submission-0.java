class MyHashSet {
    private int size = 10000;
    private List[] list;

    public MyHashSet() {
        list = new LinkedList[size];
    }
    
    public void add(int key) {
        int listKey = key % size;
        if(list[listKey] == null){
            list[listKey] = new LinkedList<Integer>();
        }
        if(!list[listKey].contains(key)){
            list[listKey].add(key);
        }
    }

    public void remove(int key) {
        int listKey = key % size;
        if(list[listKey]!= null){
            list[listKey].remove((Integer)key);
        }
    }
    
    public boolean contains(int key) {
        int listKey = key % size;
        if(list[listKey] != null) return list[listKey].contains(key);
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */