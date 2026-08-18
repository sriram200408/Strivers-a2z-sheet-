package Queues;

class Node{
    int ele;
    Node next;
    Node(int ele,Node next){
        this.ele = ele;
        this.next = next;
    }
    Node(int ele){
        this.ele = ele;
        this.next = null;
    }
}
class LinkedListQueue {
public int index;
public Node head;
public Node curr;

public boolean isEmpty(){
    return head==null;
}

public void push(int ele){
    if(isEmpty()){
         head = new Node(ele);
         curr = head;
        return;
    }
        Node temp = new Node(ele);
        curr.next = temp;
        curr = temp;
        return;
}

public int peek(){
    if(isEmpty()){
        System.out.println("The queue is empty");
        return -1;
    }
    return head.ele;
}

public int pop(){
    if(isEmpty()){
        System.out.println("The queue is empty");
        return -1;
    }
    int ans = head.ele;
    head = head.next;
    if(head == null) curr = null;
    return ans;
}

}

public class LinkedlistQueueimplementation {
    public static void main(String[] args) {
         LinkedListQueue q = new LinkedListQueue();

       
        String[] commands = {"LinkedListQueue", "push", "push", 
                             "peek", "pop", "isEmpty"};
        
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                q.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(q.pop() + " ");
            } else if (commands[i].equals("peek")) {
                System.out.print(q.peek() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((q.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListQueue")) {
                System.out.print("null ");
            }
        }
    }
}
