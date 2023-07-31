

/*
 Find Missing And Repeating
        MediumAccuracy: 24.83%Submissions: 319K+Points: 4
        Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

        Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

        Example 1:
        Input:
        N = 2
        Arr[] = {2, 2}
        Output: 2 1
        Explanation: Repeating number is 2 and 
        smallest positive missing number is 1.

        Example 2:
        Input:
        N = 3
        Arr[] = {1, 3, 3}
        Output: 3 2
        Explanation: Repeating number is 3 and 
        smallest positive missing number is 2.

 */



package Array.Medium;
import java.util.*;

public class findMissingAndRepetatingElement {

    static int[] findTwoElement(int arr[], int n) {
        int ans[] = new int[2];
        Set<Integer>s = new TreeSet<>();

        int arrsum =0;
        int actualSum = 0;

        for(int i=0;i<arr.length-1;i++){
            arrsum +=arr[i];
            if(s.contains(arr[i])){
                ans[0] = arr[i];
            }
            s.add(arr[i]);
        }

        actualSum = (arr.length * (arr.length+1))/2;

        if(arrsum>actualSum){
            ans[1] = ans[0]-(arrsum-actualSum);
        }

        else{

            ans[1] = ans[0]+(actualSum-arrsum);
        }



        return ans;
    }

    public static void main(String[] args) {
        int []arr = {1,3,3};
        int[] ans = findTwoElement(arr, 0);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
