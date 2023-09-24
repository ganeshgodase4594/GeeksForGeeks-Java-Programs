


/*

 Reverse each word in a given string
        MediumAccuracy: 53.96%Submissions: 40K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given a String. Reverse each word in it where the words are separated by dots.

        Example 1:
        Input:
        S = "i.like.this.program.very.much"
        Output: 
        i.ekil.siht.margorp.yrev.hcum
        Explanation: 
        The words are reversed as
        follows:"i" -> "i","like"->"ekil",
        "this"->"siht","program" -> "margorp",
        "very" -> "yrev","much" -> "hcum".


        Example 2:
        Input: 
        S = "pqr.mno"
        Output: 
        rqp.onm
        Explanation: 
        The words are reversed as
        follows:"pqr" -> "rqp" ,
        "mno" -> "onm".

 */

package String.Medium;

import java.util.Stack;

public class reverseEachWordString {

    static String reverseWords(String S)
    {
        String str = "";
        Stack<Character>st = new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='.'){
                
                while(!st.isEmpty()){
                    str+=st.pop();
                }
                str+=".";
            }

            else{
                st.push(S.charAt(i));
            }
        }

        while(!st.isEmpty()){
            str+=st.pop();
        }
        return str;

    }

    public static void main(String[] args) {
        String  S = "i.like.this......program.very.much";

        System.out.println(reverseWords(S));
    }
}
