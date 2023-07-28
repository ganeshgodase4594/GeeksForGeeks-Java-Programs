

/*
 Anagram
        EasyAccuracy: 44.93%Submissions: 250K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

        Note:-

        If the strings are anagrams you have to return True or else return False

        |s| represents the length of string s.


        Example 1:
        Input:a = geeksforgeeks, b = forgeeksgeeks
        Output: YES
        Explanation: Both the string have same characters with
                same frequency. So, both are anagrams.


        Example 2:
        Input:a = allergy, b = allergic
        Output: NO
        Explanation: Characters in both the strings are 
                not same, so they are not anagrams.

 */





package String.Easy;

import java.util.Arrays;

public class Anagram {

   static boolean isAnagram(String a,String b){

        if(a.length()!=b.length()){
            return false;
        }
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }

        return true;
   }

    public static void main(String[] args) {
        String a = "geeksforgeeks", b = "forgeeksgeeks";

        System.out.println(isAnagram(a, b));
    }
}
