package handball.repositories;


import handball.entities.equipment.Equipment;

import java.util.ArrayList;
import java.util.Collection;

public class EquipmentRepository implements Repository {

    private Collection<Equipment> equipments;

    public EquipmentRepository() {
        this.equipments = new ArrayList<>();
    }

    public void add(Equipment equipment){
        equipments.add(equipment);
    }

    public boolean remove(Equipment equipment){
        return  equipments.remove(equipment);
    }

    public Equipment findByType(String type){
        return equipments.stream()
                .filter(el->el.getClass().getSimpleName().equals(type))
                .findFirst().orElse(null);
    }
}
