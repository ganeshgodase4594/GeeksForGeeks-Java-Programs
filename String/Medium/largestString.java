

/*

 Length of the longest substring
        MediumAccuracy: 27.88%Submissions: 95K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given a string S, find the length of the longest substring without repeating characters.


        Example 1:
        Input:
        S = "geeksforgeeks"
        Output:
        7
        Explanation:
        Longest substring is
        "eksforg".

        Example 2:
        Input:
        S = "abdefgabef"
        Output:
        6
        Explanation:
        Longest substring are
        "abdefg" , "bdefga" and "defgab".


 */


package String.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class largestString {
    static int longestUniqueSubsttr(String S){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<S.length();i++){
            ArrayList<Character>ls = new ArrayList<>();
            String str = "";
            for(int j=i;j<S.length();j++){

                if(ls.contains(S.charAt(j))){
                    break;
                }
                str +=S.charAt(j);
                ls.add(S.charAt(j));
            }
            max = Math.max(max,str.length());
        }
        return max;
    }

    static int longestUniqueSubsttrs(String S){
        int max = Integer.MIN_VALUE;
        int left = 0,right = 0;
        Set<Character>st = new HashSet<>();

        while(right<=S.length()-1){
            if(st.contains(S.charAt(right))){
                while(st.contains(S.charAt(right))){
                    st.remove(S.charAt(left));
                    left++;
                }
                
            } 
            else{
                max = Math.max(max, right-left+1);
                st.add(S.charAt(right));
                right++;
            }  
        }
        return max;
    }

    static int longestUniqueSubsttrOptimal(String S){
        int max = Integer.MIN_VALUE;
        int left = 0,right = 0;
        Map<Character,Integer>mp = new HashMap<>();

        while(right<=S.length()-1){
            if(mp.containsKey(S.charAt(right))){
                left = Math.max(mp.get(S.charAt(right))+1,left);
            }

            max = Math.max(max, right-left+1);
            mp.put(S.charAt(right), right);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        String S = "geeksforgeeks";

        System.out.println(longestUniqueSubsttrOptimal(S));
    }

}
