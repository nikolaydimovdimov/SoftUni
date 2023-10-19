package JADV7_2_Workshop_Custom_Data_Structures_P02_DoublyLinkedList;

public class MyNode {

    private int value;
    private MyNode next;
    private MyNode prev;

    public MyNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public MyNode() {
    }

    public int getValue() {
        return this.value;
    }

    public MyNode getNext() {
        return this.next;
    }

    public MyNode getPrev() {
        return this.prev;
    }


    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public void setPrev(MyNode prev) {
        this.prev = prev;
    }
}

