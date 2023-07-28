
/*
 
Second most repeated string in a sequence
    EasyAccuracy: 45.95%Submissions: 60K+Points: 2
    Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

    Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.

    Note: No two strings are the second most repeated, there will be always a single string.

    Example 1:
    Input:
    N = 6
    arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
    Output: bbb
    Explanation: "bbb" is the second most 
    occurring string with frequency 2.

    Example 2:
    Input: 
    N = 6
    arr[] = {geek, for, geek, for, geek, aaa}
    Output: for
    Explanation: "for" is the second most
    occurring string with frequency 2.

 */




package String.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class secondMostRepeatedString {

    static String secFrequent(String arr[], int N){

        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int x = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], x+1);
        }

        ArrayList<Integer>ls = new ArrayList<>();
        for(Integer x:hm.values()){
           ls.add(x);
        }

        Collections.sort(ls);

        int target = ls.get(ls.size()-2);
        String targetStr = "-1";
        
        for(Map.Entry<String,Integer>entry : hm.entrySet()){
            if(target == entry.getValue()){
                targetStr = entry.getKey();
            }
        }
        return targetStr;
    }
    

    public static void main(String[] args) {
        String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};

        System.out.println(secFrequent(arr, 0));
    }
}
