

package Array.Easy;

public class removeDuplicates{

    static int remove_duplicate(int A[],int N){

        if(A.length<2){
            return A.length;
        }
        
        int i=0;
        int j=1;
        
        while(j<A.length){
            
            if(A[i] == A[j]){
                
                j++;
            }
            
            else{
                
                i++;
                A[i] = A[j];
                j++;
            }
            
        }
        
        return i+1;
    }

    public static void main(String[] args) {
        int[] Array = {2, 2, 2, 2, 2};
        System.out.println(remove_duplicate(Array, 0));

        
    }
}