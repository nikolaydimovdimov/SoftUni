package JOOP_04_1_Interfaces_and_Abstraction_Lab.P01_CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    Integer TIRES=4;
    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
