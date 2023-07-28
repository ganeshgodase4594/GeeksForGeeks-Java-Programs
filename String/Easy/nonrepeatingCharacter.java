

/*

 Non Repeating Character
        EasyAccuracy: 40.43%Submissions: 179K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

        Example 1:
        Input:
        S = hello
        Output: h
        Explanation: In the given string, the
        first character which is non-repeating
        is h, as it appears first and there is
        no other 'h' in the string.


        Example 2:
        Input:
        S = zxvczbtxyzvy
        Output: c
        Explanation: In the given string, 'c' is
        the character which is non-repeating. 

 */



package String.Easy;

import java.util.Map;
import java.util.TreeMap;



public class nonrepeatingCharacter {

    static char nonrepeatingCharacters(String S)
    {
        Map<Character, Integer> hm = new TreeMap<>();

        for(int i=0;i<S.length();i++){
            int x = hm.getOrDefault(S.charAt(i), 0);
            hm.put(S.charAt(i), x+1);
        }

        // System.out.println(hm);
        for(Map.Entry<Character,Integer>entry : hm.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return '$';
    }

    public static void main(String[] args) {
        String   S = "zxvczbtxyzvy";

        System.out.println(nonrepeatingCharacters(S));
    }
}
