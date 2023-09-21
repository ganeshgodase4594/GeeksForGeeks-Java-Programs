

/*

Square root of a number
        MediumAccuracy: 54.03%Submissions: 164K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

        

        Example 1:
        Input:
        x = 5
        Output: 2
        Explanation: Since, 5 is not a perfect 
        square, floor of square_root of 5 is 2.

        Example 2:
        Input:
        x = 4
        Output: 2
        Explanation: Since, 4 is a perfect 
        square, so its square root is 2.

 */




package Array.Medium;

public class squareRootNumber {

    static long floorSqrt(long x)
	{
		long num = (long)(x / 2);

        System.out.println(num);
		
		for(long i=num;i>=1;i--){
		    if(i * i <= x){
		        return i;
		    }
		}
		
		return 1;
	 }

    public static void main(String[] args) {
        long x = 6;

        System.out.println(floorSqrt(x));
    }
}
