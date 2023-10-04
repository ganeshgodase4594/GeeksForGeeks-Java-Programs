
/*

Longest Distinct characters in string
        EasyAccuracy: 31.32%Submissions: 108K+Points: 2
        Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

        banner
        Given a string S, find the length of the longest substring with all distinct characters. 

        Example 1:
        Input:
        S = "geeksforgeeks"
        Output: 7
        Explanation: "eksforg" is the longest 
        substring with all distinct characters.

        Example 2:
        Input: 
        S = "aaa"
        Output: 1
        Explanation: "a" is the longest substring 
        with all distinct characters.

 */



package String.Easy;

import java.util.HashMap;

public class LongestDistinctChar {

    static int longestSubstrDistinctChars(String S){
        
        if(S.length()==0){
            return 0;
        }

        int max = 0;
        HashMap<Character,Integer>hm = new HashMap<>();

        for(int i=0;i<S.length();i++){

            if(!hm.containsKey(S.charAt(i))){
                hm.put(S.charAt(i), i);
            }

            else{
                max = Math.max(max,hm.size());
                i = hm.get(S.charAt(i));
                hm.clear();
            }
        }

        max = Math.max(max,hm.size());
        return max;
    }

    public static void main(String[] args) {
        String  S = "geeksforgeeks";

        System.out.println(longestSubstrDistinctChars(S));
    }
}
