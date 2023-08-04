
/*

 Count Substrings
        EasyAccuracy: 45.53%Submissions: 19K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a binary string S. The task is to count the number of substrings that starts and end with 1.
        Note: The starting and the ending 1s should be different.

        Example 1:
        Input:
        S = "10101"
        Output: 3
        Explanation: The 3 substrings are "101",
        "10101" and "101".

        â€‹Example 2:
        Input: 
        S = "100"
        Output: 0
        Explanation: No substring that starts and
        ends with 1.


 */




package String.Easy;

import javax.print.FlavorException;

import Tree.BinaryTree.Medium.bottomView;

public class countSubstring {

    static int countSubstr (String S){

        int count = 0;
        char[] ch = S.toCharArray();
        for(int i=0;i<S.length()-1;i++){
            if(ch[i]=='1'){
                for(int j=i+1;j<S.length();j++){
                    String str = S.substring(i, j+1);
                    System.out.println(str);
                    if(str.charAt(0)=='1' && str.charAt(str.length()-1)=='1'){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    static int countSubstrs (String S){

        int count = 0;
        char[] ch = S.toCharArray();
        int init = 0;
        String str = "";
        int ptr = 0;
        for(int i=0;i<S.length();i++){
            if(ch[init]=='1'){
                str +=ch[i];
                if(str.length()>=2 && str.charAt(0)=='1' && str.charAt(str.length()-1)=='1'){
                    count++;
                    System.out.println(str);
                }
            }

            if(init<S.length()-1 && i+1==S.length()){
                i= init;
                init = i+1;
                str = "";
            }

        }

        return count;
    }
    static int countSubstrz (String S){

       int count =0;
        int x =1;
        boolean flag = false;
       for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='1' && !flag){
                flag =true;
            }
            else if(S.charAt(i)=='1'){
                count = count+x;
                x++;
            }
       }

        return count;
    }

    public static void main(String[] args) {
        String  S = "10011";

        System.out.println(countSubstrz(S));
    }
}
