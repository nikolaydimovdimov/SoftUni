package JOOP_03_1_Inheritance_Lab.P03_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList{

    public Object getRandomElement(){
        int index= new Random().nextInt(super.size());
        Object element=super.get(index);
        super.remove(index);
        return element;
    }
}
