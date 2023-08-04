package Array.Medium;
import java.util.*;

public class tripletSumzero {

    static  boolean findTriplets(int arr[] , int n){

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){

            if(i==0 || arr[i]!=arr[i-1]){
                int sum = 0-arr[i];
                int left = i+1;
                int right = arr.length-1;
                
                while(left<right){
                    if(arr[left]+arr[right] == sum){
                        return true;
                    }

                    else if(arr[left]+arr[right]<sum){
                        left++;
                    }

                    else if(arr[left]+arr[right]>sum){
                        right--;
                    }
                }  
            }
           
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        System.out.println(findTriplets(arr, 0));
    }
}
