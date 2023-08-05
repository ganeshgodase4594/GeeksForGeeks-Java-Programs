

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
import java.math.BigInteger;
import java.util.*;

public class findMissingAndRepetatingElement {

    static int[] findTwoElement(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
         int a[] = new int[2];
         
         for(int i=0;i<n;i++){
             if(!(map.containsKey(arr[i]))){
                 map.put(arr[i],arr[i]);
             }
             
             else{
                 a[0] = arr[i];
             }
         }
         
         int sum = n*(n+1)/2;
         int s=0;
         for(int i=0;i<n;i++){
             s = s+arr[i];
         }
         
        //  System.out.println(s);
         
         if(s>sum){
             a[1] = a[0]-(s-sum);
         }
         
         else{
             a[1] = a[0]+(sum-s);
         }
        return a;
    }
    
    public static void main(String[] args) {
        int []arr = {1,3,3};
        int[] ans = findTwoElements(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
