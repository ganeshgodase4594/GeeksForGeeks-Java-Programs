
/*
 Find first repeated character
        EasyAccuracy: 41.97%Submissions: 68K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. S contains only lowercase letters.

        

        Example 1:
        Input: S="geeksforgeeks"
        Output: e
        Explanation: 'e' repeats at third position.
        

        Example 2:
        Input: S="hellogeeks"
        Output: l
        Explanation: 'l' repeats at fourth position.
        

        Example 3:
        Input: S="abc"
        Output: -1
        Explanation: There is no repeated character.
        Your Task:  
        You don't need to read input or print anything. Your task is to complete the function firstRepChar() which accepts a string S as input parameter and returns a string containing first repeated character in it. If there is no repeated character in the string S then return "-1".

 */




package String.Easy;

import java.util.ArrayList;

public class firstRepeatingCharacter {

    static String firstRepChar(String s){
        ArrayList<Character>ls = new ArrayList<>(s.length());
        int minInd = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=0;i<s.length();i++){

            if(!ls.contains(s.charAt(i)))
                ls.add(i, s.charAt(i));

            else{
                flag = true;
                ls.add(i, s.charAt(i));
                minInd = Math.min(minInd,i);
          
          }
        }

        if(!flag){
            return "-1";
        }

        // System.out.println(minInd);
        // System.out.println(ls);
        return ls.get(minInd)+"";
    }

    public static void main(String[] args) {
        String S="abc";
        System.out.println(firstRepChar(S));
    }
}
