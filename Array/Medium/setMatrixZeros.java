

/*
 73. Set Matrix Zeroes
        Medium
        12.2K
        635
        Companies
        Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

        You must do it in place.

        

        Example 1:
        Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
        Output: [[1,0,1],[0,0,0],[1,0,1]]


        Example 2:
        Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]


 */


package Array.Medium;

public class setMatrixZeros {

    static void setZeroesBruteForce(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    int x = i-1;
                    while(x>=0){
                        if(matrix[x][j]!=0){
                            matrix[x][j]=-1;

                        }
                        x--;
                    }
                    int y=i+1;
                    while(y<=matrix.length-1){
                        if(matrix[y][j]!=0){

                            matrix[y][j]=-1;
                        }
                        y++;
                    }

                    int p= j-1;
                    while(p>=0){
                        if(matrix[i][p]!=0){

                            matrix[i][p]=-1;
                        }
                        p--;
                    }

                    int q = j+1;
                    while(q<=matrix[0].length-1){
                        if(matrix[i][q]!=0){
                            matrix[i][q]=-1;
                        }
                        q++;
                    }

                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    static void setMatrixZerosBetter(int[][] matrix){
        int[] col = new int[matrix[0].length];
        int[] row = new int[matrix.length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(col[j]==1 || row[i]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        // setZeroesBruteForce(matrix);

        setMatrixZerosBetter(matrix);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
