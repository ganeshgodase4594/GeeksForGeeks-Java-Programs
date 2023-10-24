package String.Medium;

public class SumOfLargeNumbers {

    static String findSum(String X, String Y) {
        
        // if(Long.parseLong(X)<=(long)Integer.MAX_VALUE && Long.parseLong(Y)<=(long)Integer.MAX_VALUE){
        //     return (Integer.parseInt(X)+Integer.parseInt(Y))+"";
        // }
        
        
        if(X.length()>Y.length()){
            String temp = X;
            X = Y;
            Y = temp;
        }
        
        X  = new StringBuffer(X).reverse().toString();
        Y  = new StringBuffer(Y).reverse().toString();

        int carry = 0;
        String str = "";
        for(int i=0;i<X.length();i++){
            int sum = X.charAt(i)-48 + Y.charAt(i)-48+carry;
            str +=sum%10;
            carry = sum/10;
        }
        
        

        for(int i=X.length();i<Y.length();i++){

            int sum = Y.charAt(i)-48 +carry;
            str +=sum%10;
            carry = sum/10;
        }

        if(carry>0){
            str +=carry;
        }
        


       

        str = new StringBuffer(str).reverse().toString();

        System.out.println(str);
        
        int it = 0;
        while(it<str.length() && str.charAt(it)=='0'){
            it ++;
        }
        
        str = str.substring(it,str.length());

        System.out.println(str);
        
        if(str==null || str.equals("")){
            return "0";
        }
       

        return str;
    }


    public static void main(String[] args) {

        String a = "00";
        String b =  "000000";

        System.out.println(findSum(a, b));

    }
}
