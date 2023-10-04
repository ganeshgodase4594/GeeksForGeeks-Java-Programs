package Array.Medium;

public class ncr {
    static int nCr(int n, int r)
    {
        if(r>n){
            // System.out.println("here");
            return 0;
        }
        
        if(n==r){
            return 1;
        }
        
        
        int divided = (factorial(r)*factorial(n-r)) % 1000000007;
        
        return factorial(n)/divided;
        
        
    }
    
    
    static int factorial(int num){
        
        int fact = 1;
        
        for(int i=1;i<=num;i++){
            fact = fact*i;
            fact = fact % 1000000007;
        }
        
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(nCr(69, 43));
    }
}
