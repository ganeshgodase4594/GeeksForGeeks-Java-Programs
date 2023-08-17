package Array.Medium;

public class ncr {
    static int nCr(int n, int r){

        int fact1 = 1;

        if(r>n-r){

            int x = n-r;
            System.out.println(x);
            for(int i=n;i>r;i--){

                fact1 = (fact1 * i);
                System.out.println(i);
    
                if(x>=1){
                    fact1 /= x;
                    x--;
                }
            }
            
        }
        else{

            for(int i=n;i>(n-r);i--){

                fact1 = fact1 * i;
                fact1 /= r;
                r--;
            }
        }


        return fact1;
    }

    public static void main(String[] args) {
        System.out.println(nCr(69, 43));
    }
}
