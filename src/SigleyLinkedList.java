public class SigleyLinkedList {
    public static void main(String[] args) {
        SingleLinkedList_R link = new SingleLinkedList_R();
        link.insert("가");
        link.insert("나");
        link.insert("다");
        link.select();
        System.out.println("------------");
        link.delete();
        link.select();
    }
}
