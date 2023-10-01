
/*


Single Number
    EasyAccuracy: 41.64%Submissions: 21K+Points: 2
    DO NOT DOWNLOAD the GfG App if you don't wish to learn on the go, download videos, access offline learning and much more. JUST DON'T!

    banner
    Given an array Arr of positive integers of size N where every element appears even times except for one. Find that number occuring odd number of times.

    Example 1:
    Input: 
    N = 5
    Arr[] = {1, 1, 2, 2, 2}
    Output: 2
    Explanation: In the given array all
    element appear two times except 2
    which appears thrice.

    Example 2:
    Input: 
    N = 7
    Arr[] = {8, 8, 7, 7, 6, 6, 1}
    Output: 1
    Explanation: In the given array all
    element appear two times except 1
    which appears once.


 */



package Array.Easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    static int getSingle(int arr[], int n) {
        
       HashMap<Integer,Integer>hm = new HashMap<>();
       
       for(int i=0;i<arr.length;i++){
           int x = hm.getOrDefault(arr[i],0);
           
           hm.put(arr[i],x+1);
       }
       
       for(Map.Entry<Integer,Integer>entry : hm.entrySet()){
           
           if(entry.getValue()%2==1){
               return entry.getKey();
           }
       }
       
       return 0;
    }

    public static void main(String[] args) {
        
        int  Arr[] = {1, 1, 2, 2, 2};

        System.out.println(getSingle(Arr, 0));
    }
}
