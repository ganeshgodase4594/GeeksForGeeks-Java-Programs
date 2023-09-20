

/*

 Sorting Elements of an Array by Frequency
        MediumAccuracy: 44.93%Submissions: 44K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given an array of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.

        Example 1:
        Input:
        N = 5
        A[] = {5,5,4,6,4}
        Output: 4 4 5 5 6
        Explanation: The highest frequency here is
        2. Both 5 and 4 have that frequency. Now
        since the frequencies are same then 
        smallerelement comes first. So 4 4 comes 
        firstthen comes 5 5. Finally comes 6.
        The output is 4 4 5 5 6.


        Example 2:
        Input:
        N = 5
        A[] = {9,9,9,2,5}
        Output: 9 9 9 2 5
        Explanation: The highest frequency here is
        3. The element 9 has the highest frequency
        So 9 9 9 comes first. Now both 2 and 5
        have same frequency. So we print smaller
        element first.
        The output is 9 9 9 2 5.


 */



package Array.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class sortingElementByFrequency {

     static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        ArrayList<Integer> ls = new ArrayList<>();
        TreeMap<Integer,Integer>map= new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            
            int x = map.getOrDefault(arr[i],0);
            
            map.put(arr[i],x+1);
            
        }
        
       List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());

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

        HashMap<Integer,Integer>map2 = temp;

        
        for(Map.Entry<Integer,Integer>entry : map2.entrySet()){

            for(int i=0;i<entry.getValue();i++){
                ls.add(entry.getKey());
            }
        }

        

        return ls;
    }

    public static void main(String[] args) {
        int  A[] = {9,9,9,2,5};

        System.out.println(sortByFreq(A, 0));
    }
}
