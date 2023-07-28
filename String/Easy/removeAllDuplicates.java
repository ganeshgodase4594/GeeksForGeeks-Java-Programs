

/*
 Remove all duplicates from a given string
        EasyAccuracy: 58.68%Submissions: 48K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

        Example 1:
        Input:
        Str = geeksforgeeks
        Output: geksfor
        Explanation: After removing duplicate
        characters such as e, k, g, s, we have
        string as "geksfor".


        Example 2:
        Input:
        Str = HappyNewYear
        Output: HapyNewYr
        Explanation: After removing duplicate
        characters such as p, e, a, we have
        string as "HapyNewYr".

 */


package String.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class removeAllDuplicates {

    static String removeDuplicates(String str) {
        
        ArrayList<Character> ls = new ArrayList<Character>();

        
        String s1 = "";

        for(int i=0;i<str.length();i++){
            if(!(ls.contains(str.charAt(i)))){
                ls.add(str.charAt(i));
            }
        }

        Iterator<Character> i = ls.iterator();
  
        while (i.hasNext()){
            char ch1 = i.next();
            s1+=ch1;
           
        }
        return s1;
    }

    public static void main(String[] args) {
        String Str = "HappyNewYear";

        System.out.println(removeDuplicates(Str));
    }
}
