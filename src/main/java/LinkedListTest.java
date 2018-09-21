public class LinkedListTest {

    public static void main(String[] args){

        LinkedList list = new LinkedList(12);
        System.out.println(list.toString());
        list.addNodeToFront(9);
        System.out.println(list.toString());
        list.addNodeToEnd(15);
        System.out.println(list.toString());
        list.addNodeToFront(8);
        System.out.println(list.toString());
        list.deleteNodeAtEnd();
        System.out.println(list.toString());
        list.deleteNodeAtFront();
        System.out.println(list);
    }

}
