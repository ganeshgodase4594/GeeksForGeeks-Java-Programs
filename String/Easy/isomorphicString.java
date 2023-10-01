
/*
 
Isomorphic Strings
        EasyAccuracy: 34.21%Submissions: 122K+Points: 2
        DO NOT DOWNLOAD the GfG App if you don't wish to learn on the go, download videos, access offline learning and much more. JUST DON'T!

        banner
        Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
        Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2 while preserving the order.
        Note: All occurrences of every character in str1 should map to the same character in str2

        Example 1:
        Input:
        str1 = aab
        str2 = xxy
        Output: 1
        Explanation: There are two different
        charactersin aab and xxy, i.e a and b
        with frequency 2and 1 respectively.


        Example 2:
        Input:
        str1 = aab
        str2 = xyz
        Output: 0
        Explanation: There are two different
        charactersin aab but there are three
        different charactersin xyz. So there
        won't be one to one mapping between
        str1 and str2.

 */




package String.Easy;

import java.util.*;
import java.util.Map.Entry;

public class isomorphicString {

    static boolean areIsomorphic(String str1,String str2)
    {
        
        if(str1.length()!=str2.length()){
            return false;
        }
        
        HashMap<Character,Integer>hm1 = new HashMap<>();
        
        for(char ch : str1.toCharArray()){
            
            int x = hm1.getOrDefault(ch,0);
            hm1.put(ch,x+1);
        }
        
        HashMap<Character,Integer>hs2 = new HashMap<>();
        
        for(char ch : str2.toCharArray()){
            
            int x = hm2.getOrDefault(ch,0);
            hm2.put(ch,x+1);
        }
        
       List<Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer> >(hm1.entrySet());
       
       Collection.
        
    }
    public static void main(String[] args) {
        
    }
}
