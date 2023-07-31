
/*

 Valid Substring
        MediumAccuracy: 23.37%Submissions: 108K+Points: 4
        This Problem will always be here, but this offer won't be back! Save 25% Now

        Given a string S consisting only of opening and closing parenthesis 'ie '('  and ')', find out the length of the longest valid(well-formed) parentheses substring.
        NOTE: Length of the smallest valid substring ( ) is 2.

        Example 1:
        Input: S = "(()("
        Output: 2
        Explanation: The longest valid 
        substring is "()". Length = 2.


        Example 2:
        Input: S = "()(())("
        Output: 6
        Explanation: The longest valid 
        substring is "()(())". Length = 6.

 */



package String.Medium;
import java.util.*;

public class validSubString {

    static int findMaxLen(String S) {
        Stack<Character>st = new Stack<>();
        int count = 0;

        for(char ch : S.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }

            else{

                if(!st.isEmpty()){
                    st.pop();
                    count = count +2;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        String S = "))()(()";

        System.out.println(findMaxLen(S));
    }
}
