

/*

 Twice Counter
    EasyAccuracy: 62.61%Submissions: 36K+Points: 2
    Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
    Given a list of N words. Count the number of words that appear exactly twice in the list.

    Example 1:
    Input:
    N = 3
    list = {Geeks, For, Geeks}
    Output: 1
    Explanation: 'Geeks' is the only word that 
    appears twice.

    Example 2:
    Input:
    N = 8
    list = {Tom, Jerry, Thomas, Tom, Jerry, 
    Courage, Tom, Courage}
    Output: 2
    Explanation: 'Jerry' and 'Courage' are the 
    only words that appears twice.

 */

package String.Easy;

import java.util.HashMap;
import java.util.Map;

public class TwiceCount {
    
    static int countWords(String list[], int n)
    {
        HashMap<String,Integer>hm = new HashMap<>();
        
        for(int i=0;i<list.length;i++){
            
            int x = hm.getOrDefault(list[i],0);
            
            hm.put(list[i],x+1);
        }
        
        int count = 0;
        for(Map.Entry<String,Integer>entry : hm.entrySet()){
            
            if(entry.getValue()==2){
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String list[] = {"Geeks", "For", "Geeks"};

        System.out.println(countWords(list, 0));

    }
}
