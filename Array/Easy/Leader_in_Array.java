

/*
Leaders in an array
        EasyAccuracy: 29.94%Submissions: 484K+Points: 2
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

        

        Example 1:
        Input:
        n = 6
        A[] = {16,17,4,3,5,2}
        Output: 17 5 2
        Explanation: The first leader is 17 
        as it is greater than all the elements
        to its right.  Similarly, the next 
        leader is 5. The right most element 
        is always a leader so it is also 
        included.
        

        Example 2:
        Input:
        n = 5
        A[] = {1,2,3,4,0}
        Output: 4 0
 */




package Array.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class Leader_in_Array {

    static ArrayList<Integer> bruteForceleaders(int arr[], int n){

        ArrayList<Integer>ls = new ArrayList<>();

        for(int i=0;i<n;i++){
            boolean flag = true;
            for(int j=i+1;j<n;j++){
                
                if(arr[i]<arr[j]){
                    flag = false;
                    break;
                } 
            }
            if(flag){
                ls.add(arr[i]);
            }
        }
        return ls;
    }


    static ArrayList<Integer> Optimalleaders(int arr[], int n){

        ArrayList<Integer>ls = new ArrayList<>();

        int max = arr[n-1];
        ls.add(max);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                ls.add(arr[i]);
            }
        }
        Collections.sort(ls, Collections.reverseOrder());
        return ls;
    }

    
    public static void main(String[] args) {
        int  n = 6;
        int A[] = {16,17,4,3,5,2};

        System.out.println(Optimalleaders(A, n));
    }
}
