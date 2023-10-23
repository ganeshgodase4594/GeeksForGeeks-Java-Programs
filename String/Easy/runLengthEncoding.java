
/*
 
Run Length Encoding
        EasyAccuracy: 43.33%Submissions: 48K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
        eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
        You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.

        Example 1:

        Input:
        str = aaaabbbccc
        Output: a4b3c3
        Explanation: a repeated 4 times
        consecutively b 3 times, c also 3
        times.
        Example 2:

        Input:
        str = abbbcdddd
        Output: a1b3c1d4
 */



package String.Easy;


public class runLengthEncoding {

    static String encode(String str)
	{
        
        if(str.length()==1){
	        return str+"1";
	    }
	    int cnt = 1;
	    String s = "";
	    
	    for(int i=1;i<str.length();i++){
	        
	        if(str.charAt(i)==str.charAt(i-1)){
	            cnt++;
	        }
	        
	        else{
	            
	            s = s+str.charAt(i-1)+cnt+"";
	            cnt = 1;
	        }
	    }
	    
	    s = s+str.charAt(str.length()-1)+cnt+"";
	    
	    return s;
	}

    public static void main(String[] args) {
        String str = "ddddabbbc";

        System.out.println(encode(str));
    }
}
