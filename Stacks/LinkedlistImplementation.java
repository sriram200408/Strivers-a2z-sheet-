package Stacks;

class Node{
    int ele;
    Node next;
Node(int data,Node next){
    this.ele = data;
    this.next = next;
}
Node(int data){
    this.ele = data;
    this.next = null;
}

}

class LinkedListStack{
public Node head;

public boolean isEmpty(){
    return head ==  null;
}

public void push(int ele){
    if(isEmpty()){
        head = new Node(ele);
        return;
    }
    Node temp = new Node(ele);
    temp.next = head;
    head = temp;
    return;
}

public int pop(){
    if(isEmpty()){
        System.out.println("the stack is empty");
        return -1; 
    }
    
    int data = head.ele;
   head = head.next;
    return data;
    }

    public int top(){
        if(isEmpty()){
        System.out.println("the stack is empty");
        return -1; 
    }
    return head.ele;
    }
}

public class LinkedlistImplementation {
    public static void main(String[] args) {
        // Creating a stack
        LinkedListStack st = new LinkedListStack();

        // Array of commands
        String[] commands = {"LinkedListStack", "push", "push", 
                             "pop", "top", "isEmpty"};
        // Array of inputs
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                st.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(st.pop() + " ");
            } else if (commands[i].equals("top")) {
                System.out.print(st.top() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((st.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListStack")) {
                System.out.print("null ");
            }
        }
    }
     
    }

