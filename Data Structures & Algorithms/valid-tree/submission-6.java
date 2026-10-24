class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length == 0) return true;
        
        Map<Integer, ArrayList<Integer>> reqs = new HashMap<>();
        for(int i = 0; i < edges.length; i++){
            if(reqs.containsKey(edges[i][0])){
                ArrayList<Integer> tmp = reqs.get(edges[i][0]);
                tmp.add(edges[i][1]);
                reqs.put(edges[i][0], tmp);
            }else{
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                tmp.add(edges[i][1]);
                reqs.put(edges[i][0], tmp);
            }
            if(!reqs.containsKey(edges[i][1])){
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                tmp.add(edges[i][0]);
                reqs.put(edges[i][1], tmp);
            }else{
                ArrayList<Integer> tmp = reqs.get(edges[i][1]);
                tmp.add(edges[i][0]);
                reqs.put(edges[i][1], tmp);
            }
        }

        System.out.println(reqs);
        System.out.println();

        Set<Integer> checked = new HashSet<>();
        if(!dfs(edges[0][0], reqs, checked, -1)) return false;

        System.out.println(reqs.size());
        System.out.println(checked.size());

        return checked.size() + 1 == reqs.size();
        
    }

    public boolean dfs(int cur, Map<Integer, ArrayList<Integer>> reqs, Set<Integer> checked, int prev){
        if(reqs.get(cur).size() == 0) return true;

        for(Integer e : reqs.get(cur)){
            if(e == prev) continue;
            if(checked.contains(e)){
                return false;
            }
            checked.add(e);
            if(!dfs(e, reqs, checked, cur)) return false;
        }
        return true;
    }
}
