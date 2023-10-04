
/*

 Largest Number formed from an Array
        MediumAccuracy: 37.82%Submissions: 114K+Points: 4
        Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

        banner
        Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.The result is going to be very large, hence return the result in the form of a string.


        Example 1:
        Input: 
        N = 5
        Arr[] = {3, 30, 34, 5, 9}
        Output: 9534330
        Explanation: Given numbers are {3, 30, 34,
        5, 9}, the arrangement 9534330 gives the
        largest value.

        Example 2:
        Input: 
        N = 4
        Arr[] = {54, 546, 548, 60}
        Output: 6054854654
        Explanation: Given numbers are {54, 546,
        548, 60}, the arrangement 6054854654 
        gives the largest value.

 */




package String.Medium;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFormedString {

    static String printLargest(String[] arr) {
        
        Arrays.sort(arr, new Comparator<String>(){
        public int compare(String s1, String s2){
            String leftRight = s1+s2;
            // System.out.println(s1);
            // System.out.println(s2);
            String rightLeft = s2+s1;
            // System.out.println(rightLeft);
            return -leftRight.compareTo(rightLeft);
        }
        });

        StringBuffer sb = new StringBuffer();

        for(String str : arr){
            sb.append(str);
        }

        while(sb.charAt(0)=='0' && sb.length()>1){
            sb.deleteCharAt(0);
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        String Arr[] = {"3", "30", "34", "5", "9"};

        System.out.println(printLargest(Arr));

    }
}
