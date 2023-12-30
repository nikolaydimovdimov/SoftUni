package implementations;

import interfaces.Deque;

import java.util.Iterator;

public class ArrayDeque<E> implements Deque<E> {
    private final static int INITIAL_CAPACITY = 7;
    private int head;
    private int tail;
    private int size;
    private int capacity;
    private Object[] elements;

    public ArrayDeque() {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;
        this.head = INITIAL_CAPACITY / 2;
        this.tail = this.head;
    }


    @Override
    public void add(E Element) {
        if (this.size > 0) {
            if (this.size == this.capacity) {
                this.resizeUP();
            }
            if (this.tail == this.capacity-1) {
                recenter(0);
            }
            this.tail++;
        }
        this.size++;
        this.elements[this.tail] = Element;
    }


    @Override
    public void offer(E element) {
        add(element);
    }

    @Override
    public void addFirst(E element) {
        if (this.size > 0) {
            if (this.size == this.capacity) {
                resizeUP();
            }
            if (this.head == 0) {
                recenter(1);
            }
            this.head--;
        }
        this.size++;
        this.elements[this.head] = element;

    }

    @Override
    public void addLast(E element) {
        add(element);
    }

    @Override
    public void push(E element) {
        this.addFirst(element);
    }

    @Override
    public void insert(int index, E element) {
        isIndexVALID(index);
        Object[] newElements;

            if (this.size == this.capacity) {
                this.resizeUP();
            }
            if (this.tail == this.capacity-1) {
                recenter(0);
            }

        this.tail++;
        if (this.tail >= this.capacity) {
            this.capacity *= 2;
        }
        newElements = new Object[this.capacity];
        System.arraycopy(this.elements, 0, newElements, 0, this.head + index);
        newElements[this.head + index] = element;
        System.arraycopy(this.elements, this.head + index, newElements, this.head + index + 1, this.size - index);
        this.size++;
        this.elements = newElements;
    }

    @Override
    public void set(int index, E element) {
        isIndexVALID(index);
        this.elements[this.head + index] = element;
    }

    @Override
    public E peek() {
        return (E) this.elements[this.head];
    }

    @Override
    public E poll() {
        return pop();
    }

    @Override
    public E pop() {
        if (this.size > 0) {
            return remove(0);
        }
        return null;
    }

    @Override
    public E get(int index) {
        isIndexVALID(index);
        return (E) this.elements[this.head + index];
    }

    @Override
    public E get(Object object) {
        for (int i = this.head; i <= this.tail; i++) {
            if (object.equals(this.elements[i])) return (E) this.elements[i];
        }
        return null;
    }

    @Override
    public E remove(int index) {
        isIndexVALID(index);
        E newElement = (E) this.elements[this.head + index];
        for (int i = this.head + index; i < this.tail; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        decreaseSizeByOne();
        return newElement;
    }

    @Override
    public E remove(Object object) {
        E tmpElement = null;
        int index = 0;
        for (int i = this.head; i <= this.tail; i++) {
            if (object.equals(this.elements[i])) {
                tmpElement = (E) this.elements[i];
                index = i - this.head;
                break;
            }
        }
        if (tmpElement != null) {
            remove(index);
        }
        return tmpElement;
    }

    @Override
    public E removeFirst() {
        return remove(0);
    }

    @Override
    public E removeLast() {
        return remove(this.size-1);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int capacity() {
        return this.capacity;
    }

    @Override
    public void trimToSize() {
        Object[] tmpElements = new Object[this.size];
        System.arraycopy(this.elements, this.head, tmpElements, 0, this.size);
        this.elements = tmpElements;
        this.head = 0;
        this.tail = this.size - 1;
        this.capacity = this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = head;

            @Override
            public boolean hasNext() {
                return this.index <= tail;
            }

            @Override
            public E next() {
                this.index++;
                return (E) elements[this.index - 1];
            }
        };
    }
    private void resizeUP() {
        this.capacity *= 2;
        recenter(0);
    }


    private void recenter(int offset) {

        Object[] newElements = new Object[this.capacity];
        int scrPos = this.head;
        int dstPos = (this.capacity - this.size) / 2+ offset * (this.capacity - this.size) % 2;
        System.arraycopy(this.elements, scrPos, newElements,
                dstPos, this.size);
        this.head = dstPos;
        this.tail = this.head + this.size-1;
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
