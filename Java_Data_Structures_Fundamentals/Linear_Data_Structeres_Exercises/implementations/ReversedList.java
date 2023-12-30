package implementations;

import java.util.Iterator;

public class ReversedList<E> implements Iterable<E> {
    private final static int INITIAL_CAPACITY = 2;
    private int head;
    private int tail;
    private int size;
    private int capacity;
    private Object[] elements;

    public ReversedList() {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;
        this.head = 0;
        this.tail = this.head;
    }

    public void add(E Element) {
        if (this.size > 0) {
            if (this.size == this.capacity) {
                this.resizeUP();
            }
            this.tail++;
        }
        this.size++;
        this.elements[this.tail] = Element;
    }

    public E get(int index) {
        isIndexVALID(index);
        return (E) this.elements[this.tail - index];
    }
    public E removeAt(int index) {
        isIndexVALID(index);
        index=this.tail-index;
        E newElement = (E) this.elements[this.head + index];
        for (int i = this.head + index; i < this.tail; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        decreaseSizeByOne();
        return newElement;
    }
    public int size() {
        return this.size;
    }


    public int capacity() {
        return this.capacity;
    }

   @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = tail;

            @Override
            public boolean hasNext() {
                return this.index >=0;
            }

            @Override
            public E next() {
                this.index--;
                return (E) elements[this.index + 1];
            }
        };
    }
    private void resizeUP() {
        this.capacity *= 2;
        Object[] newElements = new Object[this.capacity];
        int scrPos = 0;
        int dstPos = 0;
        System.arraycopy(this.elements, scrPos, newElements,
                dstPos, this.size);
        this.head = 0;
        this.tail = this.size-1;
        this.elements = newElements;
    }



    private void decreaseSizeByOne() {
        this.size--;
        this.elements[this.tail] = null;
        this.tail--;
        if (this.tail < this.head) this.tail = this.head;

    }
    private void isIndexVALID(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(String.format("Index %d is INVALID", index));
        }
    }
}
