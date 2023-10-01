

/*
 
Counting elements in two arrays
        MediumAccuracy: 37.12%Submissions: 69K+Points: 4
        Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

        banner
        Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].

        Example 1:
        Input:
        m = 6, n = 6
        arr1[] = {1,2,3,4,7,9}
        arr2[] = {0,1,2,1,1,4}
        Output: 4 5 5 6 6 6
        Explanation: Number of elements less than
        or equal to 1, 2, 3, 4, 7, and 9 in the
        second array are respectively 4,5,5,6,6,6.

        Example 2:
        Input:
        m = 5, n = 7
        arr1[] = {4,8,7,5,1}
        arr2[] = {4,48,3,0,1,1,5}
        Output: 5 6 6 6 3
        Explanation: Number of elements less than
        or equal to 4, 8, 7, 5, and 1 in the
        second array are respectively 5,6,6,6,3.


 */


package Array.Medium;

import java.util.*;


public class CountElementInTwoArray {

    static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       LinkedHashSet<Integer>hs = new LinkedHashSet<>();
       
       for(int i=0;i<arr1.length;i++){
           hs.add(arr1[i]);
       }
       
       TreeMap<Integer,Integer>hm = new TreeMap<>();

       for(int i=0;i<arr2.length;i++){
           
           int x = hm.getOrDefault(arr2[i],0);

           hm.put(arr2[i],x+1);
       }

       int sum = 0;
       for(Map.Entry<Integer,Integer>entry : hm.entrySet()){
            int x = entry.getValue();
            hm.put(entry.getKey(),x+sum);
            sum +=x;
       }

       System.out.println(hm);
       ArrayList<Integer>ls = new ArrayList<>();
       
       for(int data : hs){
            
            if(hm.get(data)!=null){
                ls.add(hm.get(data));
            }

            if(hm.get(data)==null){

                while(data> 0 && true){
                    if(hm.get(data)!=null){
                        break;
                    }
                    data--;
                    System.out.println(data);
                }

                ls.add(hm.get(data));
            }
       }

        return ls;
    }


    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,7,9};
        int arr2[] = {0,1,2,1,1,4};

        ArrayList<Integer>ls = countEleLessThanOrEqual(arr1, arr2, 0, 0);

        System.out.println(ls);
    }
}
