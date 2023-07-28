

/*
 Panagram Checking
        EasyAccuracy: 61.34%Submissions: 33K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a string check if it is Panagram or not. A panagram is a sentence containing every letter in the English Alphabet (either lowercase or uppercase or both). For example, we say the letter A is present in the string if either 'a' is present or 'A' is present.

        Example 1:
        Input:
        S = Bawds jog, flick quartz, vex nymph
        Output: 1
        Explanation: In the given input, there
        are all the letters of the English
        alphabet. Hence, the output is 1.


        Example 2:
        Input:
        S = sdfs
        Output: 0
        Explanation: In the given input, there
        aren't all the letters present in the
        English alphabet. Hence, the output
        is 0.

 */


package String.Easy;

import java.util.ArrayList;
import java.util.List;

public class panagram {

    static boolean checkPangram  (String str) {

        if(str.length()<26){
            return false;
        }

        List<Character>ls = new ArrayList<>();

        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>=65 && str.charAt(i)<=90) ||(str.charAt(i)>=97 && str.charAt(i)<=122)){
                ls.add(str.charAt(i));
            }
            
        }

        System.out.println(ls);

        char ch1 = 65;
        char ch2 = 97;
        for(int i=1;i<=26;i++){
            if(ls.contains(ch1) || ls.contains(ch2)){
                System.out.println(ch1);
                ch1++;
                ch2++;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String  S = "Bawds jog, flick quartz, vex nymph";

        System.out.println(checkPangram(S));
    }
}
