

/*

 Palindrome String
        EasyAccuracy: 51.21%Submissions: 239K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a string S, check if it is palindrome or not.

        Example 1:
        Input: S = "abba"
        Output: 1
        Explanation: S is a palindrome


        Example 2:
        Input: S = "abc" 
        Output: 0
        Explanation: S is not a palindrome

 */


package String.Easy;

public class palindromeString {

    static int isPalindrome(String S) {
        int left =0;
        int right = S.length()-1;

        while(left<right){
            if(S.charAt(left)!=S.charAt(right)){
                return 0;
            }
            left++;
            right--;
        }

        return 1;
    }


    public static void main(String[] args) {
        String S = "abba";

        System.out.println(isPalindrome(S));
    }
}
