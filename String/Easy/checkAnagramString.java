
/*

 Check if two strings are k-anagrams or not
    EasyAccuracy: 26.28%Submissions: 51K+Points: 2
    100+ Candidates recieved offers in the last 3 months through Job-A-Thon. Your call is just a click away

    Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.

    Two strings are called K-anagrams if both of the below conditions are true.
    1. Both have same number of characters.
    2. Two strings can become anagram by changing at most K characters in a string.

    Example:
    Input:
    str1 = "fodr", str2="gork"
    k = 2
    Output:
    1
    Explanation: Can change fd to gk

 */



package String.Easy;

import java.util.HashMap;
import java.util.Map;

public class checkAnagramString {

    static boolean areKAnagrams(String s1, String s2, int k) {
        HashMap<Character,Integer>hm1 = new HashMap<>();
        HashMap<Character,Integer>hm2 = new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            
            int x = hm1.getOrDefault(s1.charAt(i),0);
            
            hm1.put(s1.charAt(i),x+1);
        }
        
           
        for(int i=0;i<s2.length();i++){
            
            int x = hm2.getOrDefault(s2.charAt(i),0);
            
            hm2.put(s2.charAt(i),x+1);
        }

        System.out.println(hm1);
        System.out.println(hm2);
        
        int count = 0;
        for(Map.Entry<Character,Integer>entry : hm1.entrySet()){

            if(!hm2.containsKey(entry.getKey())){
                count = count + entry.getValue();
            }

            else if(entry.getValue()!=hm2.get(entry.getKey())){
                count= count + Math.abs(entry.getValue()-hm2.get(entry.getKey()));
            }
        }
        
        if(count==k){
            return true;
        }

        System.out.println(count);
        return false;
    }

    public static void main(String[] args) {
        String str1 = "uovwhqfaemqodyksjj",str2="swwhzsiowocjfyadvj";

        System.out.println(areKAnagrams(str1, str2, 18));
    }
}
