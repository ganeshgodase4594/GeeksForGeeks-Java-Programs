

/*

Decode It
        EasyAccuracy: 33.43%Submissions: 3K+Points: 2
        An encoded string S consisting of alphabets(lowercase) and integers(1<=num<=9) is given, the task is to decode it and print the character at the 'K'th position in the string. The pattern in which the strings were encoded were as follows :
        original string: jonjonsnowjonjonsnowjonjonsnow
        encoded string: jon2snow3

        Note: encoded string will always start with an alphabet and end with a number.

        Example 1:
        Input:
        str = "jon2snow3"
        k = 8

        Output:
        n

        Explanation:
        The given string after decoding it will be 
        as such: jonjonsnowjonjonsnowjonjonsnow. 
        8th character in the string after decoding is:'n'.

        Example 2:
        Input:
        str = "q3"
        k = 3

        Output:
        q

        Explanation:
        The given string after decoding it will be
        as such: qqq. 3rd character in the string 
        after decoding is:'q'.


 */



package String.Easy;

public class DecodeIt {

    static char decodeIt(String str,int k){
        
        String s = "";
        String finalStr = "";
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                // System.out.println(s);
                finalStr ="";
                for(int j=1;j<=(str.charAt(i)-48);j++){
                    
                    finalStr +=s;
                }

                s = finalStr;

            }
            
            else{
                s+=str.charAt(i);
            }
        }
        
        System.out.println(finalStr);
        
        return finalStr.charAt(k-1);
    }

    public static void main(String[] args) {
        String s = "jon2snow3";

        System.out.println(decodeIt(s, 8));
    }
}
