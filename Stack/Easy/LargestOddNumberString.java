
/*


 Largest odd sber in string
        EasyAccuracy: 50.0%Submissions: 11K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given an string S, representing a large interger. Return the largest-valued odd integer (as a string) that is substring of the given string S.


        Note : A substring is a contiguous sequence of characters within a string. Null string ("") is also a substring.

        Example 1:
        Input: s = "504"
        Output: "5"
        Explanation: The only subtring "5" is odd sber.
        

        Example 2:
        Input: s = "2042"
        Output: ""
        Explanation: All the possible non-empty substring have even value.


 */



package Stack.Easy;

public class LargestOddNumberString {

    static String maxOdd(String s) {
        int ind =0;
        boolean flag = false;
        for(int i=s.length()-1;i>=0;i--){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2!=0){
                flag = true;
                ind = i;
                break;
            }
        }

        String str1 = s.substring(0, ind+1);

        if(!flag){
            return "";
        }

        return str1;
    }
    public static void main(String[] args) {
        String str = "504";
        System.out.println(maxOdd(str));
    }
}
