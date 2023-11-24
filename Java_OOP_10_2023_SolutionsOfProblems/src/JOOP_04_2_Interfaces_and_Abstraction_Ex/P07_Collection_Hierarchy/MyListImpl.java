package JOOP_04_2_Interfaces_and_Abstraction_Ex.P07_Collection_Hierarchy;

public class MyListImpl extends Collection implements MyList{
    public MyListImpl() {
        super();
    }

    @Override
    public String remove() {
        if(super.getItems().isEmpty()) return null;
        return super.getItems().remove(0);
    }

    @Override
    public int add(String item) {
        if (super.getItems().size()<super.getMaxSize()) {
            super.getItems().add(0, item);
            return super.getItems().indexOf(item);
        }
        return -1;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
