package Queues;

class Node{
    int ele;
    Node next;
    Node(int ele){
        this.ele = ele;
        this.next = null;
    }
}

class LinkedListStack{
public Node head;
public Node curr;
public boolean isEmpty(){
    return head == null;
}
public void push(int ele){
    if(isEmpty()){
head = new Node(ele);
return;
    }
    Node temp = new Node(ele);
    temp.next= head;
    head = temp;
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
        System.out.println("the queue is empty");
        return -1;
    }
int ans = head.ele;
head = head.next;
return ans;
}
}

class StackQueue{
    LinkedListStack input = new LinkedListStack(); 
LinkedListStack output = new LinkedListStack();

boolean isEmpty(){
    return(input.isEmpty() && output.isEmpty());
}

void push(int x){
    input.push(x);
}

int pop(){
    if(output.isEmpty()){
        while(!input.isEmpty()){
            output.push(input.pop());
        }
    }
    return output.pop();
}

int peek(){
    if(output.isEmpty()){
        while(!input.isEmpty()){
            output.push(input.pop());
        }
    }
    return output.peek();
}
}

public class implementqueueusingstack {
    public static void main(String[] args) {
        StackQueue q = new StackQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element popped is " + q.pop());
        q.push(5);
        System.out.println("The front of the queue is " + q.peek());
        System.out.println("Is the queue empty? " + (q.isEmpty() ? "Yes" : "No"));
        System.out.println("The element popped is " + q.pop());
        System.out.println("The element popped is " + q.pop());
        System.out.println("Is the queue empty? " + (q.isEmpty() ? "Yes" : "No"));
    }
}
