public class LinkedList {
    private Node head;
    private Node tail;

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addNodeToEnd(int a) {
        Node tail = new Node(a,null);
        Node startNode = this.getHead();
        while (startNode.nextNode != null ) {
            if (startNode.nextNode.getValue()==-1111) {
                break;
            }
            startNode = startNode.getNextNode();
        }
        Node lastNode = startNode.nextNode;
        tail.nextNode = lastNode;
        startNode.nextNode = tail;
    }

    public void addNodeToFront(int a) {
        Node node = new Node(a,this.getHead());
        this.head = node;
    }

    public LinkedList(int a) {
        int i = -1111;
        this.tail = new Node(i,null);
        this.head = new Node(a,this.tail);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node head = this.getHead();
        sb.append(head.getValue());
        while (!(head.nextNode.getValue()==-1111)){
            head = head.getNextNode();
            sb.append(",");
            sb.append(head.getValue());
        }
        return sb.toString();
    }

    public void deleteNodeAtFront(){
       this.head = this.getHead().getNextNode();
    }

    public void deleteNodeAtEnd() {

        Node previousNode = this.getHead();
        Node currentNode = this.getHead();

        while (!(currentNode.nextNode.getValue()==-1111)) {
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        previousNode.nextNode = this.getTail();
    }
}
