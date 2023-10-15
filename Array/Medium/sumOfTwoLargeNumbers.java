
/*
 
 */



package Array.Medium;

public class sumOfTwoLargeNumbers {

    static String findSum(String X, String Y) {
        
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

        return str;
    }

    public static void main(String[] args) {

        String X = "25", Y = "23";

        System.out.println(findSum(X, Y));
    }
}
