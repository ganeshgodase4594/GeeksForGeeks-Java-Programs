
/*
 Longest Palindrome in a String
        MediumAccuracy: 23.2%Submissions: 239K+Points: 4

        Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string that reads the same backward. More formally, S is a palindrome if reverse(S) = S. In case of conflict, return the substring which occurs first ( with the least starting index).

        Example 1:
        Input:
        S = "aaaabbaa"
        Output: aabbaa
        Explanation: The longest Palindromic
        substring is "aabbaa".


        Example 2:
        Input: 
        S = "abc"
        Output: a
        Explanation: "a", "b" and "c" are the 
        longest palindromes with same length.
        The result is the one with the least
        starting index.
 */




package String.Medium;

public class longest_palindrome_substring {

    static String longestPalin(String S){
        String original = "";
        int maxLength=0;
        maxLength = original.length();
        
        for(int i=0;i<S.length()-1;i++){
            String s="";
            int left = i;
            int right = S.length()-1;

            while(left<right){
                if(S.charAt(left)==S.charAt(right)){
                    s +=S.charAt(left);

                    left++;
                    right--;
                }
                else{
                    right--;
                }

            }

            s.length();

            if(s.length()>maxLength){
                original ="";
                maxLength=s.length();
                original +=s;
            }
        }

        return original;
        
    }
    public static void main(String[] args) {
        String S = "aaaabbaa";

        System.out.println(longestPalin(S));
    }
}
