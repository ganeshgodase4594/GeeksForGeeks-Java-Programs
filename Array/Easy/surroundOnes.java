
package Array.Easy;

public class surroundOnes {

    static int  Count(int[][] matrix){

        if(matrix.length==1){
            return 0;
        }

        int count =0;
        for(int i=0;i<matrix.length;i++){
            int zeroCount=0;
            for(int j=0;j<matrix[i].length;j++){

                if(matrix[i][j]==1){

                    if(i==0){

                        if(j==0){
                            if(matrix[i][j+1]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j+1]==0){
                                 zeroCount++;
                            }

                            if(matrix[i+1][j]==0){
                                zeroCount++;
                            }
                        }

                        else if(j>0 && j<matrix[i].length-1){
                            if(matrix[i][j-1]==0){
                                zeroCount++;
                            } 
                            
                            if(matrix[i+1][j]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j+1]==0 ){
                                zeroCount++;
                            }

                            if(matrix[i+1][j]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j-1]==0){
                                zeroCount++;
                            }
                        }

                        else if(j==matrix[i].length-1){
                            if(matrix[i][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j]==0){
                                zeroCount++;
                            }
                        }

                    }

                    else if(i>0 && i<matrix.length-1){
                        if(j==0){
                            if(matrix[i][j+1]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j+1]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j+1]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j]==0){
                                zeroCount++;
                            }
                        }

                        else if(j>0 && j<matrix[i].length-1){
                            if(matrix[i][j-1]==0){
                                zeroCount++;
                            } 

                            if(matrix[i][j+1]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j+1]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j+1]==0){
                                zeroCount++;
                            }
                        }

                        else if(j==matrix[i].length-1){
                            if(matrix[i][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i+1][j]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j]==0){
                                zeroCount++;
                            }
                        }
                    }

                    else if(i==matrix.length-1){
                        if(j==0){
                            if(matrix[i-1][j]==0){
                                zeroCount++;
                            }

                            if( matrix[i-1][j+1]==0){
                                zeroCount++;
                            }

                            if( matrix[i][j+1]==0){
                                zeroCount++;
                            }
                        }

                        else if(j>0 && j<matrix[i].length-1){
                            if(matrix[i][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j+1]==0){
                                zeroCount++;
                            }

                            if(matrix[i][j+1]==0){
                                zeroCount++;
                            }
                        }

                        else if(j==matrix[i].length-1){
                            if(matrix[i][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j-1]==0){
                                zeroCount++;
                            }

                            if(matrix[i-1][j]==0){
                                zeroCount++;
                            }
                        }
                    }
                }
                    
                   
            }

            if(zeroCount % 2==0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int [][]matrix = {{1, 0, 0}, 
                          {1, 1, 0}, 
                         {0, 1, 0}};

        System.out.println(Count(matrix));
    }
}
