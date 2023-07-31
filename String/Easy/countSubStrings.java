
/*

 Count the Substrings
        EasyAccuracy: 65.83%Submissions: 21K+Points: 2
        Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

        Given a string S. The task is to count the number of substrings which contains equal number of lowercase and uppercase letters. 

        Example 1:
        Input:
        S = "gEEk"
        Output: 3
        Explanation: There are 3 substrings of
        the given string which satisfy the
        condition. They are "gE", "gEEk" and "Ek".


        Example 2:
        Input:
        S = "WomensDAY"
        Output: 4
        Explanation: There are 4 substrings of 
        the given string which satisfy the
        condition. They are "Wo", "ensDAY", 
        "nsDA" and "sD"

 */



package String.Easy;

public class countSubStrings {

    static int countSubstring(String S){
        int count =0;
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<S.length();j=j+2){
                String str = S.substring(i, j+1);
                int uCount = 0;
                int lCount= 0;
                for(int k=0;k<str.length();k++){
                    if(str.charAt(k)>=65 && str.charAt(k)<=90){
                        uCount++;
                    }
                    else{
                        lCount++;
                    }
                }
                if(lCount==uCount){
                    count++;
                }
            }
        }
        return count;
    }


    static int countSubstrings(String S){
        int count =0;
        int initial =0;

        for(int i=0;i<S.length()+1;i=i+2){
            String str = S.substring(initial, i);

            if(str.length()==0){
                continue;
            }
            int uCount = 0;
            int lCount= 0;

            for(int k=0;k<str.length();k++){
                if(str.charAt(k)>=65 && str.charAt(k)<=90){
                    uCount++;
                }
                else{
                    lCount++;
                }
            }

            if(lCount==uCount){
                count++;
            }

            if((i+2)>S.length()){
                i = initial+1;
                initial = i;
            }
        }
        return count;
    }

    

    public static void main(String[] args) {
        String S = "WomensDAY";

        System.out.println(countSubstrings(S));
    }
}
