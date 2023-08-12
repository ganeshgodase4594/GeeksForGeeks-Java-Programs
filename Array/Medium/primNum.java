package Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class primNum {
    static List<Integer> primeDivision(int N){
        
        List<Integer>ls = new ArrayList<>();
        
        int left = 2;
        int right = N-2;

        // boolean flag = false;
        
        while(left <= right){
            // System.out.println(left);
            // System.out.println(right);
            if(isPrime(left) && isPrime(right)){
                if(left+ right > N){
                    right--;
                }
                else if(left + right < N){
                    left++;
                }
                
                else{
                    // flag = true;
                    ls.add(left);
                    ls.add(right);
                    return ls;
                }
            }
            
            else if(!isPrime(left)){
                left++;
            }
            
            else if(!isPrime(right)){
                right--;
            }
            
            else{
                left++;
                right--;
            }
        }
        
        return ls;
    }
    
    static boolean isPrime(int num){
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num % i ==0){
                count ++;
            }
            if(count > 2){
                break;
            }
        }
        
        if(count==2){
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        List<Integer>ls = primeDivision(74);

        System.out.println(ls);
    }
}
