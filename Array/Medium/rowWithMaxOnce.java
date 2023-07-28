
/*
 
Row with max 1s
        MediumAccuracy: 33.09%Submissions: 210K+Points: 4
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

        Example 1:
        Input: 
        N = 4 , M = 4
        Arr[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}}
        Output: 2
        Explanation: Row 2 contains 4 1's (0-based
        indexing).

        Example 2:
        Input: 
        N = 2, M = 2
        Arr[][] = {{0, 0}, {1, 1}}
        Output: 1
        Explanation: Row 1 contains 2 1's (0-based
        indexing).

 */



package Array.Medium;
public class rowWithMaxOnce {

    static int rowWithMax1s(int arr[][], int n, int m) {

        int max = Integer.MIN_VALUE;
        int row = -1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1 && max<arr[i].length-j){
                    row = i;
                    max = arr[i].length-j;
                    break;
                }
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int  N = 4 , M = 4;
        int Arr[][] = {{0, 0}, {1, 1}};

        System.out.println(rowWithMax1s(Arr, N, M));
    }
}
