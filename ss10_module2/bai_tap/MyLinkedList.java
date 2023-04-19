package ss10_module2.bai_tap;

public class MyLinkedList<E>{
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        Node next = null;
        head = new Node(next);
    }
    class Node{
        private Node next;
        private Object data;
        public Node(Node next){
            this.next = next;
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    
}
