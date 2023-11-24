package JOOP_04_2_Interfaces_and_Abstraction_Ex.P07_Collection_Hierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable{
    public AddRemoveCollection() {
        super();
    }

    @Override
    public String remove() {
        if(super.getItems().isEmpty()) return null;
        int index=super.getItems().size();
        return super.getItems().remove(index-1);
    }

    @Override
    public int add(String item) {
        if (super.getItems().size()<super.getMaxSize()) {
            super.getItems().add(0, item);
            return super.getItems().indexOf(item);
        }
        return -1;
    }
}
