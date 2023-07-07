
/*
 Reverse words in a given string
        EasyAccuracy: 56.08%Submissions: 253K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

        Example 1:
        Input:
        S = i.like.this.program.very.much
        Output: much.very.program.this.like.i
        Explanation: After reversing the whole
        string(not individual words), the input
        string becomes
        much.very.program.this.like.i

        Example 2:
        Input:
        S = pqr.mno
        Output: mno.pqr
        Explanation: After reversing the whole
        string , the input string becomes
        mno.pqr
 */




package String.Easy;

import java.util.Stack;

public class reverseWords {

    static String reverseWord(String S)
    {   
        if(S.length()==0 || S.length()==1){
            return S;
        }
        Stack<String>st = new Stack<>();
        String str="";

        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='.'){
                st.push(str);
                str = "";
            }

            else{
                str +=S.charAt(i);
            }
        }

        st.push(str);

        String ans = "";
        while (st.size() != 1) {
            ans += st.peek() + ".";
            st.pop();
        }
        ans += st.peek();

        return ans;
    }
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";

        System.out.println(reverseWord(s));
    }
}
