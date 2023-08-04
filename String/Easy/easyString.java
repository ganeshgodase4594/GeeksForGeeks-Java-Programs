



package String.Easy;

public class easyString {

    static String transform(String S) 
    {       
        int count = 1;
        String str = "";
        for(int i=1;i<S.length();i++){

            if(S.charAt(i)==S.charAt(i-1)){
                count++;
            }
            else{
                str +=count+""+S.charAt(i-1);
                count = 1;
            }
        }
        
        return str;
    }
    public static void main(String[] args) {
        String S = "aaABBb";

        System.out.println(transform(S));
    }
}
