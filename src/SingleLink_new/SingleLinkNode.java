package SingleLink_new;

public class SingleLinkNode {

    Node node;

    class Node {
        int data;
        Node next;
        public Node(int num) { data = num; }
    }


    // insert
    public void insert( int parameter ) {
        Node newNode = new Node(parameter);

        if( node == null ) {
            node = newNode;
            return;
        }

        newNode.next = node;
        node = newNode;
    }

    // print
    public void print() {
        Node nodePrint = node;
        while ( nodePrint != null ) {
            System.out.println(nodePrint.data);
            nodePrint = nodePrint.next;
        }
    }

}
