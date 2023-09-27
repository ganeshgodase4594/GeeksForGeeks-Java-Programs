
/*

Print Anagrams Together
        MediumAccuracy: 65.78%Submissions: 60K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of their appearance in the original array. Look at the sample case for clarification.

        Note: The final output will be in lexicographic order.

        Example 1:
        Input:
        N = 5
        words[] = {act,god,cat,dog,tac}
        Output:
        act cat tac 
        god dog
        Explanation:
        There are 2 groups of
        anagrams "god", "dog" make group 1.
        "act", "cat", "tac" make group 2.

        Example 2:
        Input:
        N = 3
        words[] = {no,on,is}
        Output: 
        is
        no on
        Explanation:
        There are 2 groups of
        anagrams "is" makes group 1.
        "no", "on" make group 2.


 */





package String.Medium;

import java.util.*;

public class PrintAnagramTogether {

    static List<List<String>> Anagrams(String[] string_list) {
        
        if (string_list == null || string_list.length == 0){
            return new ArrayList<>();
        }

        Map<String,List<String>>Freqstr = new HashMap<>();

        for(String str : string_list){
            String freqString = frequencyString(str);

            if (Freqstr.containsKey(freqString)) {
                Freqstr.get(freqString).add(str);
            }

            else{

                List<String>ls = new ArrayList<>();
                ls.add(str);

                Freqstr.put(freqString, ls);
            }
        }

        return new ArrayList<>(Freqstr.values());
    }

    static String frequencyString(String s){

        int freq[] = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        StringBuilder frequencystring = new StringBuilder("");
        char c = 'a';
        for (int i : freq) {
            frequencystring.append(c);
            frequencystring.append(i);
            c++;
        }
    
        return frequencystring.toString();
    }


    public static void main(String[] args) {
        String words[] = {"act","god","cat","dog","tac"};

        List<List<String>>ls = Anagrams(words) ;

        System.out.println(ls);
    }
}
