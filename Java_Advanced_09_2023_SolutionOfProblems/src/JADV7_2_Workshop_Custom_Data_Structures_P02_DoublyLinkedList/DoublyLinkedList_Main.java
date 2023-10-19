package JADV7_2_Workshop_Custom_Data_Structures_P02_DoublyLinkedList;

import java.util.Arrays;

public class DoublyLinkedList_Main {
    public static void main(String[] args) {
        MyDoublyLinkedList newList = new MyDoublyLinkedList();

        System.out.println();

        newList.addFirst(1);
        newList.addFirst(2);
        newList.addLast(3);

        System.out.println(newList.removeLast());
        System.out.println(newList.removeLast());
        System.out.println(newList.removeLast());

        newList.addFirst(1);
        newList.addFirst(2);
        newList.addLast(3);
        newList.addFirst(4);
        newList.addFirst(5);
        newList.addLast(6);

        System.out.println(newList.get(4));

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
