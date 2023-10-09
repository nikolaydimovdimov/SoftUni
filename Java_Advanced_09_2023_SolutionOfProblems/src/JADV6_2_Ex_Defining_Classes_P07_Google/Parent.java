package JADV6_2_Ex_Defining_Classes_P07_Google;

public class Parent {

    //    •	"{Name} parents {parentName} {parentBirthday}"
    private String nameParent;
    private String birthDayParent;

    public Parent(String nameParent, String birthDayParent) {
        this.setNameParent(nameParent);
        this.setBirthDayParent(birthDayParent);
    }

    public Parent() {
    }


    public void setNameParent(String nameParent) {
        this.nameParent = nameParent;
    }

    public void setBirthDayParent(String birthDayParent) {
        this.birthDayParent = birthDayParent;
    }

    public String getNameParent() {
        return nameParent;
    }

    public String getBirthDayParent() {
        return birthDayParent;
    }

    @Override
    public String toString() {
        if(this.getNameParent()==null) return "";
        return String.format("%s %s%n", this.getNameParent(), this.getBirthDayParent());
    }
}
