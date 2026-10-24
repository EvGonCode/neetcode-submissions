class Solution {
    public void islandsAndTreasure(int[][] grid) {
        boolean isChanged = true;
        int depth = 0;
        while(isChanged){
            isChanged = false;
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[i].length; j++){
                    if(grid[i][j] == depth){
                        mark(grid, i, j, depth + 1);
                        isChanged = true;
                    }
                }
            }
            depth++;
        }
    }

    public void mark(int[][] grid, int y, int x, int path){
        if(y > 0){
            if(grid[y-1][x] > path) grid[y-1][x] = path;
        }
        if(y + 1 < grid.length){
            if(grid[y+1][x] > path) grid[y+1][x] = path;
        }
        if(x > 0){
            if(grid[y][x-1] > path) grid[y][x-1] = path;
        }
        if(x + 1 < grid[y].length){
            if(grid[y][x+1] > path) grid[y][x+1] = path;
        }
    }
}
