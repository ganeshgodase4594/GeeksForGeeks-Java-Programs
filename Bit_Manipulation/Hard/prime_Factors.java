

/*
 
Prime Factors
        EasyAccuracy: 30.47%Submissions: 18K+Points: 2
        Apply for Mega Job-A-Thon: Fresher Edition | 30+ Opportunities | Avg CTC: 7 LPA  

        Given a number N. Find its unique prime factors in increasing order.
        

        Example 1:
        Input: N = 100
        Output: 2 5
        Explanation: 2 and 5 are the unique prime
        factors of 100.


        Example 2:
        Input: N = 35
        Output: 5 7
        Explanation: 5 and 7 are the unique prime
        factors of 35.


 */







package Bit_Manipulation.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prime_Factors {
    static int[] AllPrimeFactors(int N)
    {
       List<Integer> al = new ArrayList<Integer>();


        for(int i=2;i<=N;i++){
            if(N%i==0){

                if(isPrime(i)){
                    al.add(i);
                }

            }
        }
        int[] arr = al.stream().mapToInt(i -> i).toArray();

        return arr;

    }

    static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }

            if(count>2){
                break;
            }

            if(i==n/2 && count==1){
                count+=1;
                break;
            }
        }

        if(count==2){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int N= 100;

       int[] arr=(AllPrimeFactors(N));

       for(int x:arr){
        System.out.println(x);
       }
    }
}
