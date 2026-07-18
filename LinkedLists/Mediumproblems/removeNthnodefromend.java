package LinkedLists.Mediumproblems;

public class removeNthnodefromend {
    static Node removenthnodefromend(Node head , int n){
        Node hare = head;
        Node curr = head;
       if(head == null || head.next == null) return null;

       for(int i=0;i<n;i++){
        hare = hare.next;
       }
       if(hare == null){
        return head.next;
       }
       while(hare.next!=null){
        hare = hare.next;
        curr = curr.next;
       }
       curr.next = curr.next.next;

       return head;

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

        Node head1 = removenthnodefromend(head, 5);
        while(head1!=null){
            System.out.print(" " + head1.data);
            head1 = head1.next;
        }
    }
}
