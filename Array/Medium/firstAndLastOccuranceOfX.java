package Array.Medium;

import java.util.ArrayList;

/*
 First and last occurrences of x
        MediumAccuracy: 37.36%Submissions: 203K+Points: 4
        100+ Candidates recieved offers in the last 3 months through Job-A-Thon. Your call is just a click away

        Given a sorted array arr containing n elements with possibly duplicate is to find indexes of first elements, the task is to find the first and last occurrences of an element x in the given array.
        Note: If the number x is not found in the array then return both the indices as -1.


        Example 1:
        Input:
        n=9, x=5
        arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
        Output:  
        2 5
        Explanation: 
        First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 

        Example 2:
        Input:
        n=9, x=7
        arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
        Output:  
        6 6
        Explanation: 
        First and last occurrence of 7 is at index 6.
 */


public class firstAndLastOccuranceOfX {
   static ArrayList<Integer> find(int arr[], int n, int x)
    {
        
        ArrayList<Integer>ls = new ArrayList<>();
        int ind = binarySearch(arr,x);
        
        if(ind == -1){
            ls.add(-1);
            ls.add(-1);
            return ls;
        }
        
        if(arr[0]== x){
            ls.add(0,0);
        }
        
        
        for(int i=ind;i>=0;i--){
            
            if(arr[i]!=x){
                ls.add(0,i+1);
                break;
            }
        }
        
        if(arr[arr.length-1]==x ){
            ls.add(1,arr.length-1);
        }
        
        for(int i=ind;i<arr.length;i++){
            
            if(arr[i]!=x){
                ls.add(1,i-1);
                break;
            }
        }
        
        return ls;
        
    }
    
    
    static int binarySearch(int[] arr,int x){
        int left =0;
        int right = arr.length-1;
        
        
        while(left<=right){
            
            int mid = left+(right-left)/2;
            
            if(arr[mid]==x){
                return mid;
            }
            
            else if(arr[mid]>x){
                right = mid-1;
            }
            
            else{
                left = mid + 1;
            }
        }
        
        return -1;
    }
}
