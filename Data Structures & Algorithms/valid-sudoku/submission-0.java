class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] rows = new HashSet[board.length];
        Set<Integer>[] cols = new HashSet[board[0].length];
        Set<Integer>[] regions = new HashSet[board.length];
        for(int i = 0; i < board.length; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            regions[i] = new HashSet<>();
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '.') continue;
                int x = board[i][j];
                if(rows[i].contains(x)) return false;
                rows[i].add(x);
                if(cols[j].contains(x)) return false;
                cols[j].add(x);
                if(regions[(i/3)*3+j/3].contains(x)) return false;
                regions[(i/3)*3+j/3].add(x);
            }
        }

        return true;
    }
}
