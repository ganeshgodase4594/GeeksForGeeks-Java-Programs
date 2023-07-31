

package Array.Easy;
/*
 Intersection of two arrays
        EasyAccuracy: 32.83%Submissions: 145K+Points: 2
        Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

        Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of elements in the intersection (or common elements) of the two arrays.

        For this question, the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

        Example 1:
        Input:
        n = 5, m = 3
        a[] = {89, 24, 75, 11, 23}
        b[] = {89, 2, 4}

        Output: 1
        Explanation:

        89 is the only element 
        in the intersection of two arrays.


        Example 2:
        Input:
        n = 6, m = 5
        a[] = {1, 2, 3, 4, 5, 6}
        b[] = {3, 4, 5, 6, 7} 

        Output: 4

        Explanation: 
        3 4 5 and 6 are the elements 
        in the intersection of two arrays.
 */

import java.util.ArrayList;

public class intersectionOfTwoArray {

    static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int count =0;
        ArrayList<Integer>ls = new ArrayList<>();
        if(a.length>b.length){
            for(int i=0;i<a.length;i++){
                ls.add(a[i]);
            }

            for(int i=0;i<b.length;i++){
                if(ls.contains(b[i])){
                    count++;
                }
            }
        }

        else{
             for(int i=0;i<b.length;i++){
                ls.add(b[i]);
            }

            for(int i=0;i<a.length;i++){
                if(ls.contains(a[i])){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {3, 4, 5, 6, 7};
        
        System.out.println(NumberofElementsInIntersection(a, b, 0, 0));
    }
}
