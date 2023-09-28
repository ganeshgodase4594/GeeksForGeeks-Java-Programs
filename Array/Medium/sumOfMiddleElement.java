
/*

Sum of Middle Elements of two sorted arrays
        Medium Accuracy: 47.98%Submissions: 57K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today!

        banner
        Given 2 sorted arrays Ar1 and Ar2 of size N each. Merge the given arrays and find the sum of the two middle elements of the merged array.

        

        Example 1:
        Input:
        N = 5
        Ar1[] = {1, 2, 4, 6, 10}
        Ar2[] = {4, 5, 6, 9, 12}
        Output: 11
        Explanation: The merged array looks like
        {1,2,4,4,5,6,6,9,10,12}. Sum of middle
        elements is 11 (5 + 6).
        

        Example 2:
        Input:
        N = 5
        Ar1[] = {1, 12, 15, 26, 38}
        Ar2[] = {2, 13, 17, 30, 45}
        Output: 32
        Explanation: The merged array looks like
        {1, 2, 12, 13, 15, 17, 26, 30, 38, 45} 
        sum of middle elements is 32 (15 + 17).

 */



package Array.Medium;

import java.util.ArrayList;

public class sumOfMiddleElement {

    static int findMidSum(int[] ar1, int[] ar2, int n) {
        
        ArrayList<Integer>ls = new ArrayList<>();
        
        int i=0;
        int j=0;
        while(i<ar1.length && j<ar2.length){
            
            if(ar1[i]<ar2[j]){
                ls.add(ar1[i]);
                i++;
            }
            else if(ar1[i]==ar2[j]){
                ls.add(ar1[i]);
                ls.add(ar2[j]);
                i++;
                j++;
            }
            
            else{
                ls.add(ar2[j]);
                j++;
            }
        }
        
        while(i<ar1.length){
            ls.add(ar1[i]);
            i++;
        }
        
        while(j<ar2.length){
            ls.add(ar2[j]);
            j++;
        }
        
        int sum = 0;
        if(ls.size() % 2==0){
            
            sum = ls.get(ls.size()/2) + ls.get(ls.size()/2-1);
        }
        
        else{
            sum = ls.get(ls.size()/2) + ls.get(ls.size()/2+1);
        }
        
        return sum;
    }


    public static void main(String[] args) {
        
        int  Ar1[] = {1, 2, 4, 6, 10};
        int  Ar2[] = {4, 5, 6, 9, 12};

        System.out.println(findMidSum(Ar1, Ar2, 0));

    }
}
