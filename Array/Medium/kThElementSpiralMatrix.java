
/*

 Find kth element of spiral matrix
        MediumAccuracy: 50.66%Submissions: 47K+Points: 4
        Win from a prize pool of INR 15K and get exciting merch! Register your team for Hack-A-Thon today!

        Given a matrix with n rows and m columns. Your task is to find the kth element which is obtained while traversing the matrix spirally. You need to complete the method findK which takes four arguments the first argument is the matrix A and the next two arguments will be n and m denoting the size of the matrix A and then the forth argument is an integer k. The function will return the kth element obtained while traversing the matrix spirally.

        Example 1:
        Input:
        n = 4, m = 4, k = 10
        A[][] = {{1  2  3  4},
                {5  6  7  8},
                {9  10 11 12},
                {13 14 15 16}}
        Output:
        13
        Explanation:

        The spiral order of matrix will look like 1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10. So the 10th element in this order is 13. 


        Example 2:
        Input:
        n = 3, m = 3, k = 4
        A[][] = {{1 2 3},
                {4 5 6},
                {7 8 9}}
        Output:
        6
        Explanation:
        The spiral order of matrix will look like 1->2->3->6->9->8->7->4->5. So the 4th element in this order is 6.


 */



package Array.Medium;

public class kThElementSpiralMatrix {

    static int findK(int A[][], int n, int m, int k){

        int left = 0,top=0;
        int right = A[0].length-1;
        int bottom = A.length-1;
        int count = 0;

        while(left<=right && top <= bottom){

            for(int i=left;i<=right;i++){
                count++;
                if(count==k){
                    return A[top][i];
                }
            }
            top++;

            for(int i=top;i<=bottom;i++){
                count++;
                if(count==k){
                    return A[i][right];
                }
            }
            right--;

            if(top<=bottom){

                for(int i=right;i>=left;i--){
                    count++;
                    if(count==k){
                        return A[bottom][i];
                    }
                }

                bottom--;
            }

            if(left<=right){

                for(int i=bottom;i>=top;i--){
                    count++;
                    if(count==k){
                        return A[i][left];
                    }
                }
                left++;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3},
        {4 ,5, 6},
        {7 ,8 ,9}};

        System.out.println(findK(A, 3, 3, 4));
    }
}
