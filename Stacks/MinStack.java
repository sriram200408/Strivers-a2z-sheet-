package Stacks;
import java.util.Stack;

public class MinStack {
    public int currmin;
    Stack<Integer> s = new Stack<>();
    public boolean isEmpty(){
        return s.isEmpty();
    }
    public void push(int x){
        if(isEmpty()){
            currmin = x;
            s.push(x);
            return;
        }
        if(x<currmin){
            int temp = 2*x-currmin;
            currmin = x;
            s.push(temp);
            return;
        }
        s.push(x);
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int elem = s.pop();
       
        if(elem<currmin){
            int act = currmin;
            currmin = 2*currmin - elem;
            return act;
            
        }
        return elem;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int ans = s.peek();
        if(ans<currmin){
            return currmin;
        }
        return ans;
    }

    public int getMin(){
        if(isEmpty()){
            return -1;
        }
        return currmin;
    }


}

class Main{
    public static void main(String[] args) {
         MinStack st = new MinStack();

        // Array of commands
        String[] commands = {"MinStack", "push", "push", 
                             "pop", "peek","push", "getmin","pop","getMin"};
        // Array of inputs
        int[][] inputs = {{}, {3}, {-2}, {} ,{} ,{7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                st.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(st.pop() + " ");
            } else if (commands[i].equals("peek")) {
                System.out.print(st.peek() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((st.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListStack")) {
                System.out.print("null ");
            }
            else if(commands[i].equals("getmin")){
                System.out.print(st.getMin() + " ");
            }
        }
    }
}
