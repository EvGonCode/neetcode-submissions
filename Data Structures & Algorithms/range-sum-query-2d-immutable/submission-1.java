class NumMatrix {
    int[][] sumMatrix; 
    public NumMatrix(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;
        sumMatrix = new int[height][width];

        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                sumMatrix[j][i] = matrix[j][i];
                if(i > 0){
                    sumMatrix[j][i] += sumMatrix[j][i-1];
                }
                if(j > 0){
                    sumMatrix[j][i] += sumMatrix[j-1][i];
                }
                if(i > 0 && j > 0){
                    sumMatrix[j][i] -= sumMatrix[j-1][i-1];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = sumMatrix[row2][col2];

        if(col1 > 0){
            sum -= sumMatrix[row2][col1-1];
        }
        if(row1 > 0){
            sum -= sumMatrix[row1-1][col2];
        }
        if(col1 > 0 && row1 > 0){
            sum += sumMatrix[row1-1][col1-1];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */