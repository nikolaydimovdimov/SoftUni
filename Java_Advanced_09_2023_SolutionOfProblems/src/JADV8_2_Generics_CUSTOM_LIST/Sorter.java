package JADV8_2_Generics_CUSTOM_LIST;

public class Sorter {

    public Sorter() {
    }

    public static <T extends Comparable<T>> void sort(CustomList<T> data){
        for (int i = 0; i <data.getSize(); i++) {
            for (int j = i+1; j < data.getSize() ; j++) {
                if(data.get(i).compareTo(data.get(j))>0) data.swap(i,j);
            }
        }
    }


}
