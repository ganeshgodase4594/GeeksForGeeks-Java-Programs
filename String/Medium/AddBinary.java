

/*
 
 */



package String.Medium;

public class AddBinary {

    static String addBinary(String A, String B) {

        
        if(A==null && B==null){
            return "";
        }

        
        // A = new StringBuffer(A).reverse().toString();
        // B = new StringBuffer(B).reverse().toString();
        
        if(A.length()>B.length()){
            
            String temp = A;
            A = B;
            B = temp;
        }
        
        String str = "";
        int carry = 0;
        int x= B.length()-1;
        for(int i=A.length()-1;i>=0;i--){
            
            int sum = A.charAt(i)-48 +B.charAt(x)-48+carry;
            
            if(sum==0){
                str = "0"+str;
                carry =0;
            }
            
            else if(sum==1){
                str ="1"+str;
                carry = 0;
            }
            
            else if(sum==2){
                str = "0"+str;
                carry =1;
            }
            
            else {
                str = "1"+str;
                carry =1;
            }
            x--;
        }

        // System.out.println(str);
        
        
        for(int i=x;i>=0;i--){
            int sum = B.charAt(i)-48 + carry;

             if(sum==0){
                str ="0"+str;
                carry =0;
            }
            
            else if(sum==1){
                str ="1"+str;
                carry = 0;
            }
            
            else if(sum==2){
                str ="0"+str;
                carry =1;
            }
            
            else {
                str ="1"+str;
                carry =1;
            }
        }
        
        if(carry==1){
            str ="1"+str;
        }


        if(str.charAt(0)=='0'){
           int p = 0;

           while( p<str.length()-1 && str.charAt(p)=='0'){
                p++;
           }

            str = str.substring(p, str.length());
          
        }
        
        // str = new StringBuffer(str).reverse().toString();

        return str;
    }

    public static void main(String[] args) {
        String B =  "001101"; 
          String A = "111";

        System.out.println(addBinary(A, B));
    }
}
