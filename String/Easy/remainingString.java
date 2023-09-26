
/*
 
Remaining String
    EasyAccuracy: 17.06%Submissions: 32K+Points: 2
    Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
    Given a string S without spaces, a character ch, and an integer count, the task is to find the string after the specified character has occurred count number of times.

    Example 1:
    Input:  S = "Thisisdemostring", ch = 'i', 
    count = 3
    Output: ng
    Explanation: Substring of S after the 3rd
    occurrence of 'i' is "ng".


    Example 2:
    Input:  S = "Thisisdemostri", ch = 'i', 
    count = 3
    Output: Empty string
    Explanation: 'i' occurce 3rd time at 
    last index.


 */



package String.Easy;

public class remainingString {

    static String printString(String S, char ch, int count) {
        
        int countCh = 0;
        int ind = -1;
        
        if(count==0){
            return S;
        }
        for(int i=0;i<S.length();i++){
            
            if(S.charAt(i)==ch){
                countCh++;
            }
            
            if(count==countCh){
                ind = i+1;
                break;
            }
        }
        
        if(ind>=0 && ind<=S.length()-1){
            
            return S.substring(ind);
        }
        
        return "Empty string";
    }
    
    public static void main(String[] args) {
        String S = "Thisisdemostring";
        char ch = 'i';
        int count = 3;

        System.out.println(printString(S, ch, count));
    }
}
