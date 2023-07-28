

/*


 Get minimum element from stack
        MediumAccuracy: 22.59%Submissions: 220K+Points: 4
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        You are given N elements and your task is to Implement a Stack in which you can get a minimum element in O(1) time.

        Example 1:
        Input:
        push(2)
        push(3)
        pop()
        getMin()
        push(1)
        getMin()
        Output: 2 1
        Explanation: In the first test case for
        query 
        push(2)  Insert 2 into the stack.
                The stack will be {2}
        push(3)  Insert 3 into the stack.
                The stack will be {2 3}
        pop()    Remove top element from stack 
                Poped element will be 3 the
                stack will be {2}
        getMin() Return the minimum element
                min element will be 2 
        push(1)  Insert 1 into the stack.
                The stack will be {2 1}
        getMin() Return the minimum element
                min element will be 1


 */


package Stack.Medium;

import java.util.Stack;

public class getMinimumElement {

    static int minEle = Integer.MAX_VALUE;
    static Stack<Integer> s = new Stack<>();
	
    /*returns min element from stack*/
    static int getMin()
    {
        if(s.isEmpty()){
            return -1;
        }
        
        return minEle;

    }
    
    /*returns poped element from stack*/
    static int pop()
    {
        if(s.isEmpty()){
            return -1;
        }

        return s.pop();
    }

    /*push element x into the stack*/
    static void push(int x){
        minEle = Math.min(minEle, x);
        s.push(x);
    }
	
    public static void main(String[] args) {
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(getMin());
        push(1);
        System.out.println(getMin());

    }
}
