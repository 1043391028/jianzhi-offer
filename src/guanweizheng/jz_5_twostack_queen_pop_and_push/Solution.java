package guanweizheng.jz_5_twostack_queen_pop_and_push;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
        if(stack2.size()<=0){
            while (stack1.size()!=0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}


