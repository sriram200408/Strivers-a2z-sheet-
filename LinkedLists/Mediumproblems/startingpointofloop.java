package LinkedLists.Mediumproblems;
class Node{
    int data;
    Node next;
    Node(int ele){
        this.data = ele;
        this.next = null;
    }
    Node(int ele,Node next){
        this.data = ele;
        this.next = next;
    }
}

public class startingpointofloop {
    static Node findstartofloop(Node head){
        if(head == null || head.next == null) return null;
        Node hare = head;
        Node tortoise = head;
        while(hare!=null && hare.next!=null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            if(hare == tortoise) {
                tortoise = head;
                while(hare != tortoise){
            hare = hare.next;
            tortoise = tortoise.next;
        }
        return tortoise;
            }
        }
        
        return null;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        Node ans = findstartofloop(head);
        if(ans == null) System.out.println("There is no loop");
        else{
            System.out.println("The loop exists ans starts at node " + ans.data);
        }
    }
}
