
/*
 All divisors of a Number
        EasyAccuracy: 32.18%Submissions: 5K+Points: 2
        Apply for Mega Job-A-Thon: Fresher Edition | 30+ Opportunities | Avg CTC: 7 LPA  

        Given an integer N, print all the divisors of N in the ascending order.
        

        Example 1:
        Input : 20
        Output: 1 2 4 5 10 20
        Explanation: 20 is completely 
        divisible by 1, 2, 4, 5, 10 and 20.

        Example 2:
            Input: 21191
            Output: 1 21191
            Explanation: As 21191 is a prime number,
            it has only 2 factors(1 and the number itself).
 */




package Bit_Manipulation.Easy;

public class All_Divisors_Of_Number {

    static void print_divisors(int n) {
        int count=0;
        for(int i=1;i<=n/2;i++){

            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }

        System.out.print(n);
    }
    public static void main(String[] args) {
        int n= 21191;

        print_divisors(n);
    }
}
