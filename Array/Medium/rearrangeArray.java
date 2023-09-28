

/*
 Rearrange Array Alternately
        MediumAccuracy: 35.15%Submissions: 210K+Points: 4
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
        Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

        Example 1:
        Input:
        n = 6
        arr[] = {1,2,3,4,5,6}
        Output: 6 1 5 2 4 3
        Explanation: Max element = 6, min = 1, 
        second max = 5, second min = 2, and 
        so on... Modified array is : 6 1 5 2 4 3.


        Example 2:
        Input:
        n = 11
        arr[]={10,20,30,40,50,60,70,80,90,100,110}
        Output:110 10 100 20 90 30 80 40 70 50 60
        Explanation: Max element = 110, min = 10, 
        second max = 100, second min = 20, and 
        so on... Modified array is : 
        110 10 100 20 90 30 80 40 70 50 60.

 */



package Array.Medium;

import java.util.ArrayList;

public class rearrangeArray {

    static void rearrange(long arr[], int n){
        
        ArrayList<Long>ls1 = new ArrayList<>();
        ArrayList<Long>ls2 = new ArrayList<>();
        
        int left = 0;
        int right = arr.length-1;
        
        while(left <= right){
            
            if(left == right){
                
                ls1.add(arr[left]);
            }
            
            else{
                
                ls1.add(arr[right]);
                ls2.add(arr[left]);
            }
            
            left++;
            right--;
        }
        
        int ind1 = 0;
        int ind2 = 0;
        
        
        for(int i=0;i<arr.length;i++){
            
            if(i % 2==0){
                
                arr[i] = ls1.get(ind1);
                ind1++;
            }
            
            else{
                arr[i] = ls2.get(ind2);
                ind2++;
            }
        }
        
    }

    public static void main(String[] args) {
        int n = 11;
        long arr[]={10,20,30,40,50,60,70,80,90,100,110};

        rearrange(arr, n);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
