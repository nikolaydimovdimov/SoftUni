package JADV7_2_Workshop_Custom_Data_Structures_P02_DoublyLinkedList;

import java.util.function.Consumer;

public class MyDoublyLinkedList {

    private int size;
    private MyNode head;
    private MyNode tail;

    public MyDoublyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int value) {
        MyNode newNode = new MyNode(value);
        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
            newNode.getNext().setPrev(newNode);
        }
        this.size++;
    }

    public void addLast(int value) {
        MyNode newNode = new MyNode(value);
        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setPrev(this.tail);
            this.tail = newNode;
            newNode.getPrev().setNext(newNode);
        }
        this.size++;
    }

    public int removeFirst() {
        int value = this.head.getValue();
        this.head = this.head.getNext();
        if (this.head == null) {
            this.tail = null;
        } else {
            this.head.setPrev(null);
        }
        size--;
        return value;
    }

    public int removeLast() {
        int value = this.tail.getValue();
        this.tail = this.tail.getPrev();
        if (this.tail == null) {
            this.head = null;
        } else {
            this.tail.setNext(null);
        }
        size--;
        return value;
    }

    public int get(int index) {
        this.checkIndex(index);
        MyNode element = head;
        for (int i = 0; i < index; i++) {
            element = element.getNext();
        }
        return element.getValue();
    }

    public void forEach(Consumer<MyNode> consumer){
        MyNode element = head;
        for (int i = 0; i < this.size; i++) {
            consumer.accept(element);
            element = element.getNext();
        }
    }

    public int[] toArray(){
        int[] intArray=new int[this. size];
        MyNode element = head;
        for (int i = 0; i < this.size; i++) {
            intArray[i]=element.getValue();
            element = element.getNext();
        }
        return intArray;
    }


    private void checkIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("ERROR - wrong INDEX!");
            throw new IndexOutOfBoundsException("ERROR - wrong INDEX!");
        }
    }
}

