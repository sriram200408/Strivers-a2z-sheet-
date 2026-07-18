package LinkedLists.Mediumproblems;

public class lengthofloop {
    static int lengthOfLoop(Node head){
Node hare = head;
Node tortoise = head;
int count = 1;
while(hare!=null && hare.next!= null){
    hare = hare.next.next;
    tortoise = tortoise.next;
    if(hare == tortoise){
        tortoise = tortoise.next;
        break;
    }
}
while(hare != tortoise){
    tortoise = tortoise.next;
    count++;
}
return count;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);
        Node n7 = new Node(8);
        Node n8 = new Node(9);
        Node n9 = new Node(10);
        Node n10 = new Node(11);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n4;
        System.out.println("The length of loop is " + lengthOfLoop(head));


    }
}
