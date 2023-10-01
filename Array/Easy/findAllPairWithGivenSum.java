
/*
 Find all pairs with a given sum
        EasyAccuracy: 23.94%Submissions: 140K+Points: 2
        DO NOT DOWNLOAD the GfG App if you don't wish to learn on the go, download videos, access offline learning and much more. JUST DON'T!

        banner
        Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.

        Note: All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then
        (u1,v1) should be printed first else second.

        Example 1:
        Input:
        A[] = {1, 2, 4, 5, 7}
        B[] = {5, 6, 3, 4, 8} 
        X = 9 

        Output: 
        1 8
        4 5 
        5 4

        Explanation:
        (1, 8), (4, 5), (5, 4) are the
        pairs which sum to 9.


        Example 2:
        Input:
        A[] = {-1, -2, 4, -6, 5, 7}
        B[] = {6, 3, 4, 0} 
        X = 8 

        Output:
        4 4 
        5 3
 */



package Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

public class findAllPairWithGivenSum {

    static pair[] allPairs( long A[], long B[], long N, long M, long X) {
        
        Set<Long>hs = new HashSet<>();
        ArrayList<pair>ls = new ArrayList<>();
        
        for(int i=0;i<B.length;i++){
            hs.add(B[i]);
        }
        
        
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            
            if(hs.contains(X-A[i])){
                pair obj = new pair(A[i],X-A[i]);
                
                ls.add(obj);
            }
        }
        
        pair ans[] = new pair[ls.size()];
        
        int i=0;
        for(pair data : ls){
            ans[i] = data;
            i++;
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        long  A[] = {1, 2, 4, 5, 7};
        long B[] = {5, 6, 3, 4, 8}; 
        int X = 9 ;

        pair []arr = allPairs(A, B, X, X, X);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
