package Stacks;
import java.util.*;
class ArrayStack{
    public int[] stack;
    public int size;
    public int topindex;

    public ArrayStack(int capacity){
        size = capacity;
        stack = new int[size];
topindex  = -1;
    }

    public ArrayStack(){
        this(1000);
    }

    public boolean isEmpty(){
        if(topindex == -1) return true;
        else return false;
    }

    public void push(int ele){
if(topindex >= size-1){
    System.out.println("Stack Overflow");
    return;
}
stack[++topindex] = ele;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }
        return stack[--topindex];
    }

    public int top(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
        return stack[topindex];
    }


}

public class ArrayImplementation{
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

         List<String> commands = Arrays.asList("ArrayStack", "push", "push", "top", "pop", "isEmpty");
        List<List<Integer>> inputs = Arrays.asList(Arrays.asList(), Arrays.asList(5), Arrays.asList(10), Arrays.asList(), Arrays.asList(), Arrays.asList());
  for (int i = 0; i < commands.size(); ++i) {
            switch (commands.get(i)) {
                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;
                case "top":
                    System.out.print(stack.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print((stack.isEmpty() ? "true" : "false") + " ");
                    break;
                case "ArrayStack":
                    System.out.print("null ");
                    break;
            }
        }
    }
}