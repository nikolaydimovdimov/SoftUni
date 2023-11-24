package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

import java.util.Collection;
import java.util.Comparator;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral{
    private Collection<Private> privs;

    public LieutenantGeneralImpl(int id, String firstName, String lastName,
                                 double salary,Collection<Private> privs) {
        super(id, firstName, lastName, salary);
        this.setPrivs(privs);
    }


    @Override
    public Collection<Private> getPrivs() {
        return this.privs;
    }

    public void addPrivate(Private priv){
        this.privs.add(priv);
    }

    private void setPrivs(Collection<Private> privs) {
        this.privs = privs;
    }

    @Override
    public String toString() {
        StringBuilder output=new StringBuilder();
        output.append(super.toString())
                .append(System.lineSeparator())
                .append("Privates:")
                .append(System.lineSeparator());
        this.privs.stream().sorted(Comparator.comparing(Private::getId).reversed())
                .forEach(pr->output.append("  ").append(pr.toString()).append(System.lineSeparator()));
        return output.toString().trim();
    }
}
