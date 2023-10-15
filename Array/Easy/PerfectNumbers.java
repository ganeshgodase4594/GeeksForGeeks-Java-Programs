

/*
 
Perfect Numbers
        EasyAccuracy: 17.21%Submissions: 150K+Points: 2
        We've got offers as great as this problem! Explore Geek Week 2023

        banner
        Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number. Return 1 if the number is Perfect otherwise return 0.

        Example 1:
        Input:
        N = 6
        Output:
        1 
        Explanation:
        Factors of 6 are 1, 2, 3 and 6.
        Excluding 6 their sum is 6 which
        is equal to N itself. So, it's a
        Perfect Number.

        Example 2:
        Input:
        N = 10
        Output:
        0
        Explanation:
        Factors of 10 are 1, 2, 5 and 10.
        Excluding 10 their sum is 8 which
        is not equal to N itself. So, it's
        not a Perfect Number.
        Your Task:
        You don't need to read input or print anything. Your task is to complete the function isPerfectNumber() which takes an Integer N as input and returns 1 if N is a Perfect number else returns 0.

 */





package Array.Easy;

public class PerfectNumbers {

    static int isPerfectNumber(long N) {
        
        if(N==1){
            return 0;
        }
       
       long sum = 0;
       for(long i=2;i*i<=N;i++){
           
           if(N%i==0){
               sum = sum + (long)(N/i) + i;
           }
           
           if(sum>N){
               break;
           }
       }
       
       if(sum+1==N){
           return 1;
       }
       
       return 0;
    }


    public static void main(String[] args) {
        
        System.out.println(isPerfectNumber(28));
    }
}
