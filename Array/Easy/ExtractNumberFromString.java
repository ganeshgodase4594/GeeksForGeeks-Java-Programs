
package Array.Easy;

public class ExtractNumberFromString {

    static long ExtractNumber(String S){
        
        String str = "";
        int ptr = 0;
        long max = -1;
        while(ptr<S.length()){
            // System.out.println(ptr);
            
            if(S.charAt(ptr)==57){
                
                while(ptr<S.length() && S.charAt(ptr)!=' '){
                    ptr++;
                }
            }
            
            if( ptr<S.length() && S.charAt(ptr)>=48 && S.charAt(ptr)<=56){
                str +=S.charAt(ptr);
                // System.out.println(str);
            }
            
            else {
                
                if(str!=null && str !=""){
                
                    max = Math.max(max,Long.parseLong(str));

                }
                
                str = "";
            }

            
            ptr++;
        }

        if(str!=null && str!=""){

            max = Math.max(max,Long.parseLong(str));
        }
        
        return max;
    }

    public static void main(String[] args) {

        String str = "This is alpha 5057 and 97";

        System.out.println(ExtractNumber(str));
    }
}
