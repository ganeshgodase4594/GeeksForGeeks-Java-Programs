
/*
 
Remove Duplicates
        EasyAccuracy: 52.35%Submissions: 94K+Points: 2
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given a string without spaces, the task is to remove duplicates from it.

        Note: The original order of characters must be kept the same. 

        Example 1:
        Input: S = "zvvo"
        Output: "zvo"
        Explanation: Only keep the first
        occurrence


        Example 2:
        Input: S = "gfg"
        Output: gf
        Explanation: Only keep the first
        occurrence

 */


package String.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class remove_duplicates {
    static String removeDups(String S) {

        ArrayList<Character> ls = new ArrayList<Character>();

        
        String s1 = "";

        char ch[] = S.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(!(ls.contains(ch[i]))){
                ls.add(ch[i]);
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
        String s = "zvvo";

        System.out.println(removeDups(s));
    }
}
