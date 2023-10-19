package JADV8_2_Generics_CUSTOM_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {

    private List<T> dataList;


    public CustomList() {
        this.dataList = new ArrayList<>();
    }

    public void add(T element) {
        this.dataList.add(element);
    }

    public T remove(int index) {
        this.isListEmpty();
        this.checkIndex(index);
        return this.dataList.remove(index);
    }

    public boolean contains(T element) {
        return this.dataList.contains(element);
    }

    public T get(int index) {
        this.isListEmpty();
        this.checkIndex(index);
        return this.dataList.get(index);
    }

    public void swap(int indexFirst, int indexSecond) {
        this.checkIndex(indexFirst);
        this.checkIndex(indexSecond);
        T sever = this.dataList.get(indexFirst);
        this.dataList.set(indexFirst, this.dataList.get(indexSecond));
        this.dataList.set(indexSecond, sever);
    }

    public int countGreater(T base) {
        int count = 0;
        for (T d : this.dataList) {
            if (d.compareTo(base) > 0) count++;
        }
        return count;
    }

    public T getMax() {
        return Collections.max(this.dataList);
    }

    public T getMin() {
        return Collections.min(this.dataList);
    }

    public int getSize() {
        return this.dataList.size();
    }


    private void isListEmpty() {
        if (this.dataList.isEmpty()) {
            throw new IllegalStateException("Error - LIST is Empty!!!");
        }
    }


    private void checkIndex(int index) {
        if (index < 0 || index >= this.dataList.size()) {
            throw new IndexOutOfBoundsException("Error - wrong INDEX!!!");
        }
    }


    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < dataList.size();
            }

            @Override
            public T next() {
                return dataList.get(index++);
            }
        };
    }
}
