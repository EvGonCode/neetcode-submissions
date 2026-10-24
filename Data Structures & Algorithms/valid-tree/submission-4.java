class Solution {
    public boolean validTree(int n, int[][] edges) {
        int nodes = 0;
        Map<Integer, ArrayList<Integer>> reqs = new HashMap<>();
        for(int i = 0; i < edges.length; i++){
            if(reqs.containsKey(edges[i][0])){
                ArrayList<Integer> tmp = reqs.get(edges[i][0]);
                tmp.add(edges[i][1]);
                reqs.put(edges[i][0], tmp);
            }else{
                nodes++;
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                tmp.add(edges[i][1]);
                reqs.put(edges[i][0], tmp);
            }
            if(!reqs.containsKey(edges[i][1])){
                nodes++;
                reqs.put(edges[i][1], new ArrayList<Integer>());
            }
        }
        if(edges.length == 0) return true;
        if(nodes > edges.length * 2 - 2) return false;

        System.out.println(reqs);
        System.out.println();

        for(var e : reqs.entrySet()){
            if(!dfs(e.getKey(), reqs, new HashSet<Integer>())) return false;
        }

        return true;
        
    }

    public boolean dfs(int cur, Map<Integer, ArrayList<Integer>> reqs, Set<Integer> checked){
        if(reqs.get(cur).size() == 0) return true;

        for(Integer e : reqs.get(cur)){
            if(checked.contains(e)){
                return false;
            }
            checked.add(e);
            if(!dfs(e, reqs, checked)) return false;
        }
        return true;
    }
}
