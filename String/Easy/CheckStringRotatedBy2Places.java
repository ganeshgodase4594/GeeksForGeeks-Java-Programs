

/*

Check if string is rotated by two places
        EasyAccuracy: 32.7%Submissions: 165K+Points: 2
        Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.

        Example 1:
        Input:
        a = amazon
        b = azonam
        Output: 
        1
        Explanation: 
        amazon can be rotated anti-clockwise by two places, which will make it as azonam.

        Example 2:
        Input:
        a = geeksforgeeks
        b = geeksgeeksfor
        Output: 
        0
        Explanation: 
        If we rotate geeksforgeeks by two place in any direction, we won't get geeksgeeksfor.


 */



package String.Easy;

public class CheckStringRotatedBy2Places {

    public static boolean isRotated(String str1, String str2)
    {
        char ch1[] = new char[str1.length()];
        
        int x = 0;
        for(int i=2;i<str1.length();i++){
            
            ch1[i-2] = str1.charAt(i);
            x++;
        }
        
        for(int i=0;i<2;i++){
            ch1[x] = str1.charAt(i);
            x++;
        }
        
        if(new String(ch1).equals(str2)){
            return true;
        }
        
        
        char ch2[] = new char[str1.length()];
        
        for(int i=0;i<str1.length()-2;i++){
            ch2[i+2] = str1.charAt(i);
        }
        
        int j=0;
        for(int i=str1.length()-2;i<str1.length();i++){
            ch2[j] = str1.charAt(i);
            j++;
        }
        
        if(new String(ch2).equals(str2)){
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {

        String  a = "geeksforgeeks";
        String b = "geeksgeeksfor";
        a.su

        System.out.println(isRotated(a, b));
    }
}
