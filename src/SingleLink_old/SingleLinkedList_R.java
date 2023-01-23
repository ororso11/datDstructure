package SingleLink_old;

public class SingleLinkedList_R {

    private Node head;

    private class Node {
        String numValData;
        //
        Node next;
        // 생성자
        Node(String str) {
            numValData = str;
        }
    }

    // insert, print, delete
    public void insert(String parameter) {
        // 생성자를 이용한 새로운 노드객체 생성
        Node newHead = new Node(parameter);

        if( head == null ) {
            head = newHead;
            return;
        }

        newHead.next = head;
        head = newHead;
    }

    public void select() {
        Node nodes = head;
        while ( nodes != null ) {
            System.out.println( nodes.numValData );
            nodes = nodes.next;
        }
    }
    // 첫번째 node 삭제
    public void delete() {
        Node node = head;
        node.numValData = null;
    }
}
