package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

import java.util.Collection;

public interface LieutenantGeneral {
    Collection<Private> getPrivs();
    void addPrivate(Private priv);
}
