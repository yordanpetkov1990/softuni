package SAA_2kurs;

public class LinkedList {
     private static class Node{
        Integer value;
        Node prev;
        Node next;


        public Node(Integer value) {
            this.value = value;

        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int element){
        Node newNode = new Node(element);
        if(this.size ==0){
            this.head = this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        size++;

    }
    public void addLast(int element){
        Node newNode = new Node(element);
        if(this.size ==0){
            this.head = this.tail =newNode;
        }else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        size++;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
//        linkedList.getTail().next = linkedList.getHead();
        System.out.println(isCyclic(linkedList.getHead()));

    }

    private static boolean isCyclic(Node head) {
        if(head == null){
            return false;
        }
        Node currentNode = head;
        while (currentNode != null){
            currentNode = currentNode.next;
            if(currentNode == head){
                return true;
            }
        }



        return false;
    }
}
