

package Array.Easy;

public class removeDuplicates{

    static int remove_duplicate(int A[],int N){

        for(int i=0;i<A.length-1;i++){
            int j = i+1;
            while(A[j]!=A[i]){
                j++;
            }

            A[i+1]=A[j];
        }

        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] Array = {2, 2, 2, 2, 2};
        System.out.println(remove_duplicate(Array, 0));

        
    }
}