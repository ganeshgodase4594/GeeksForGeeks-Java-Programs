
/*
 Parenthesis Checker
        EasyAccuracy: 28.56%Submissions: 460K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
        For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

        Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".

        Example 1:
        Input:
        {([])}
        Output: 
        true
        Explanation: 
        { ( [ ] ) }. Same colored brackets can form 
        balanced pairs, with 0 number of 
        unbalanced bracket.


        Example 2:
        Input: 
        ()
        Output: 
        true
        Explanation: 
        (). Same bracket can form balanced pairs, 
        and here only 1 type of bracket is 
        present and in balanced way.


        Example 3:
        Input: 
        ([]
        Output: 
        false
        Explanation: 
        ([]. Here square bracket is balanced but 
        the small bracket is not balanced and 
        Hence , the output will be unbalanced.
 */




package Stack.Easy;

import java.util.Stack;

public class ParenthesisChecker {

    static boolean ispar(String x)
    {
        Stack<Character>st = new Stack<>();

        for(char ch1:x.toCharArray()){
            if(ch1=='{' || ch1=='[' || ch1=='('){
                st.push(ch1);
            }

            else{

                if(st.isEmpty()){
                    return false;
                }

                char ch2 = st.pop();
                if(ch1=='}' && ch2=='{' || ch1==')' && ch2=='(' || ch1==']' && ch2=='['){
                    continue;
                }

                else{
                    return false;
                }
            }
        }

        return st.isEmpty();
        
    }
    public static void main(String[] args) {
        String x = "{([])}";

        System.out.println(ispar(x));
    }
}
