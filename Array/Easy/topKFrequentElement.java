
/*

 Top K Frequent Elements in Array - |
        EasyAccuracy: 40.23%Submissions: 43K+Points: 2
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given a non-empty array of integers, find the top k elements which have the highest frequency in the array. If two numbers have the same frequency then the larger number should be given preference. 

        Note: Print the elements according to the frequency count (from highest to lowest) and if the frequency is equal then larger number will be given preference.

        Example 1:
        Input:
        N = 6
        nums = {1,1,1,2,2,3}
        k = 2
        Output: {1, 2}


        Example 2:
        Input:
        N = 8
        nums = {1,1,2,2,3,3,3,4}
        k = 2
        Output: {3, 2}
        Explanation: Elements 1 and 2 have the
        same frequency ie. 2. Therefore, in this
        case, the answer includes the element 2
        as 2 > 1.


 */



package Array.Easy;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class topKFrequentElement {

    static int[] topK(int[] nums, int k) {
        
        TreeMap<Integer,Integer>hm = new TreeMap<>(Collections.reverseOrder());
        
        int arr[] = new int[k];
        for(int i=0;i<nums.length;i++){
            
            int x = hm.getOrDefault(nums[i],0);
            
            hm.put(nums[i],x+1);
        }
        
        List<Map.Entry<Integer,Integer>>list  = new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return -((o1.getValue())-(o2.getValue()));
            }
        });
         
       
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        System.out.println(temp);
        
        int count = 0;
        for(Map.Entry<Integer,Integer>entry : temp.entrySet()){
            
           if(count < k){
               arr[count] = entry.getKey();
           }
           else{
               
               break;
           }
           
           count++;

        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[]  nums = {1,1,2,2,3,3,3,4};
        int k = 2;

        System.out.println(topK(nums, k));
    }
}
