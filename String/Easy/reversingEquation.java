
/*
 Reversing the equation
        EasyAccuracy: 58.61%Submissions: 30K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
        It is guaranteed that the given equation is valid, and there are no leading zeros.

        Example 1:

        Input:
        S = "20-3+5*2"
        Output: 2*5+3-20
        Explanation: The equation is reversed with
        numbers remaining the same.
        Example 2:

        Input: 
        S = "5+2*56-2/4"
        Output: 4/2-56*2+5
        Explanation: The equation is reversed with
        numbers remaining the same.

 */




package String.Easy;

import java.util.Stack;

public class reversingEquation {

    static String reverseEqn(String S){
        Stack<Character>st = new Stack<>();

        for(int i=0;i<S.length();i++){
            StringBuffer sb = new StringBuffer("");
            int ptr = i;
            while(S.charAt(i)<=47 || S.charAt(i)>=58){
                sb.append(S.charAt(ptr));
                ptr++;

            }
        }

        String str = "";

        while(st.size()!=1){
            str+=st.peek();
            st.pop();

        }

        str +=st.peek();

        return str;
    }

    public static void main(String[] args) {
        String  str ="20-3+5*2";

        System.out.println(reverseEqn(str));
    }
}
