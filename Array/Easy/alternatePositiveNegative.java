
/*

 Alternate positive and negative numbers
        EasyAccuracy: 33.86%Submissions: 138K+Points: 2
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
        Note: Array should start with a positive number and 0 (zero) should be considered a positive element.
        

        Example 1:
        Input: 
        N = 9
        Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
        Output:
        9 -2 4 -1 5 -5 0 -3 2
        Explanation : Positive elements : 9,4,5,0,2
        Negative elements : -2,-1,-5,-3
        As we need to maintain the relative order of
        postive elements and negative elements we will pick
        each element from the positive and negative and will
        store them. If any of the positive and negative numbers
        are completed. we will continue with the remaining signed
        elements.The output is 9,-2,4,-1,5,-5,0,-3,2.

        Example 2:
        Input:
        N = 10
        Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
        Output:
        5 -5 2 -2 4 -8 7 1 8 0
        Explanation : Positive elements : 5,2,4,7,1,8,0
        Negative elements : -5,-2,-8
        As we need to maintain the relative order of
        postive elements and negative elements we will pick
        each element from the positive and negative and will
        store them. If any of the positive and negative numbers
        are completed. we will continue with the remaining signed
        elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
        Your Task:  

        You don't need to read input or print anything. Your task is to complete the function rearrange() which takes the array of integers arr[] and n as parameters. You need to modify the array itself.

 */



package Array.Easy;

import java.util.ArrayList;

public class alternatePositiveNegative {

    static void rearrange(int arr[], int n) {
        ArrayList<Integer>ls1 = new ArrayList<>();
        ArrayList<Integer>ls2 = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                ls1.add(arr[i]);
            }
            else{
                ls2.add(arr[i]);
            }
        }

        if(ls1.size()==0){
            int i = 0;
            for(int p : ls2){
                arr[i] = p;
                i++;
            }
        }

        else if(ls2.size()==0){
             int i = 0;
            for(int p : ls1){
                arr[i] = p;
                i++;
            }
        }


       else if(ls1.size()<ls2.size()){
           
           int i =0;
           for(int x : ls1){
               arr[i] = x;
               i= i+2;
           }

           int j = 1;
           for(int y : ls2){
            if(j>=ls1.size()*2){
                arr[j] = y;
                j++;
            }
            else{

                arr[j] = y;
                j= j+2;
            }
           }  
       }

       else{
            int i =1;
           for(int x : ls2){
               arr[i] = x;
            //    System.out.println(i);
               i= i+2;
           }

           int j = 0;
           for(int y : ls1){
            if(j>=ls2.size()*2){
                arr[j] = y;
                j++;
            }
            else{

                arr[j] = y;
                j= j+2;
            }
           }  
        }

    }

    public static void main(String[] args) {
        int  Arr[] = {93,85 ,-59, 45, -89, -41, -4, -98, 79 ,-12};

        rearrange(Arr, 0);
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
    }
}
