public class SigLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {data = d;}
    }

    public void insert( int data ) {
        Node newHead = new Node(data);
        if( head == null ) {
            head = newHead;
            return;
        }

        newHead.next = head;
        head = newHead;
    }

    public void print() {
        Node node = head;
        while ( node != null ) {
            System.out.println(node.data);
            node = node.next;
        }
    }

}
