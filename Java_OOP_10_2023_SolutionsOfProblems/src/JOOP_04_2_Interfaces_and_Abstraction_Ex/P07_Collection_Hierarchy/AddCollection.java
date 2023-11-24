package JOOP_04_2_Interfaces_and_Abstraction_Ex.P07_Collection_Hierarchy;

public class AddCollection extends Collection implements Addable{


    public AddCollection() {
        super();
    }

    @Override
    public int add(String item) {
        if (super.getItems().size()<super.getMaxSize()) {
            super.getItems().add(item);
            return super.getItems().indexOf(item);
        }
        return -1;
    }

    @Override
    public String remove() {
        return null;
    }


}
