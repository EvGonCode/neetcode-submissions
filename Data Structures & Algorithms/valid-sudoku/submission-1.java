class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> cols = new ArrayList<>();
        List<Set<Character>> sqs = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
        }
        for(int i = 0; i < board.length/3*board[0].length/3; i++){
            sqs.add(new HashSet<>());
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                char c = board[i][j];
                if(c == '.') continue;
                if(rows.get(i).contains(c)) return false;
                if(cols.get(j).contains(c)) return false;
                int sqID = (j/3) + 3 * (i/3);
                if(sqs.get(sqID).contains(c)) return false;
                rows.get(i).add(c);
                cols.get(j).add(c);
                sqs.get(sqID).add(c);
            }
        }

        return true;
    }
}
