

/*

 Column name from a given column number
        MediumAccuracy: 32.41%Submissions: 36K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given a positive integer, return its corresponding column title as appear in an Excel sheet.
        Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA” and so on.

        Example 1:

        Input:
        N = 28
        Output: AB
        Explanation: 1 to 26 are A to Z.
        Then, 27 is AA and 28 = AB.

        Example 2:

        Input: 
        N = 13
        Output: M
        Explanation: M is the 13th character of
        alphabet.


 */


package String.Medium;

public class ColumnNameForGivenCloumnNumber {

    static String colName (int n)
    {   
        
        if(n<=26){
            return ((char)(n+64))+"";
        } 
        
        int count = 0;
        // while()
        return "";
    }

    public static void main(String[] args) {
        System.out.println(colName(26));
    }
}
