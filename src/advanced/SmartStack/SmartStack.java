package advanced.SmartStack;

import java.util.function.Consumer;

public class SmartStack {
    private int size;
    private Node top;

    private static class Node{
        int value;
        Node prev;

        public Node(int value, Node prev) {
            this.value = value;
            this.prev = prev;
        }
    }
    public void push(int element){
        top = new Node(element,top);
        size++;
    }
    public int pop(){
        if(size > 0){
            int value = top.value;
            top = top.prev;
            size--;
            return value;
        }else{
            throw new RuntimeException();
        }
    }
    public int peak(){
        return top.value;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void forEach(Consumer<Integer> consumer){
        Node current = top;
        while (current != null){
            consumer.accept(current.value);
            current = current.prev;
        }
    }

}
