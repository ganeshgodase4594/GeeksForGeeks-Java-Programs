

/*

 Multiply two strings
        MediumAccuracy: 20.06%Submissions: 141K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given two numbers as strings s1 and s2. Calculate their Product.

        Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. There can be zeros in the begining of the numbers.

        Example 1:

        Input:
        s1 = "0033"
        s2 = "2"
        Output:
        66
        Example 2:

        Input:
        s1 = "11"
        s2 = "23"
        Output:
        253

 */



package String.Medium;

import java.math.BigInteger;

public class multiplyTwoStrings {

    static String multiplyStrings(String s1,String s2){

        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);

        return b1.multiply(b2)+"";

    }

    public static void main(String[] args) {
        String s1 = "-11";
        String s2 = "23";

        System.out.println(multiplyStrings(s1, s2));

    }
}
