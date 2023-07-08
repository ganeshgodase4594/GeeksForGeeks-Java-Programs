
/*
 Count number of substrings
        MediumAccuracy: 20.46%Submissions: 28K+Points: 4
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that have exactly k distinct characters. 


        Example 1:
        Input:
        S = "aba", K = 2
        Output:
        3
        Explanation:
        The substrings are:
        "ab", "ba" and "aba".

        Example 2:
        Input: 
        S = "abaaca", K = 1
        Output:
        7
        Explanation:
        The substrings are:
        "a", "b", "a", "aa", "a", "c", "a".
 */


package String.Medium;

import java.util.ArrayList;
import java.util.HashMap;

public class CountSubString {

    static long substrCount (String S, int K) {
        ArrayList<String>ls = new ArrayList<>();
        for(int i=0;i<S.length()-K+1;i++){
            for(int j=i+K-1;j<S.length();j++){
                ls.add(S.substring(i, j+1));
            }
        }

        System.out.println(ls);
        int ind=0;
        long substrCount=0;
        while(ls.size()>ind){
            String str = ls.get(ind);
            HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
            long count=0;
            for(int i=0;i<str.length();i++){
                if(hm.containsKey(str.charAt(i))){
                    continue;
                }
                else{
                    hm.put(str.charAt(i), 1);
                    count++;
                }
                
            }

            if(count==K){
                substrCount++;
            }
            ind++;
        }

        return substrCount++;
    }

    public static void main(String[] args) {
        String s = "abaaca";
        int k=1;

        System.out.println(substrCount(s, k));
    }
}
