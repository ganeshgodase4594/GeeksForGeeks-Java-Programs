
/*

 Reverse a string using Stack
        EasyAccuracy: 76.17%Submissions: 83K+Points: 2
        This Problem will always be here, but this offer won't be back! Save 25% Now

        You are given a string S, the task is to reverse the string using stack.

        

        Example 1:
        Input: S="GeeksforGeeks"
        Output: skeeGrofskeeG

 */




package String.Easy;

import java.util.Stack;

public class reverseStringUsingStack {

    static String reverse(String S){
        Stack<Character>st = new Stack<>();

        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }

        String str = "";
        while(st.size()!=1){
            str +=st.pop();
        }

        str +=st.pop();

        return str;
    }
    
    public static void main(String[] args) {
        String S="GeeksforGeeks";

        System.out.println(reverse(S));
    }
}
