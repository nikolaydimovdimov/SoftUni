package JADV6_2_Ex_Defining_Classes_P07_Google;

public class Child {
//    •	"{Name} children {childName} {childBirthday}"

    private String childName;
    private String childBirthday;

    public Child(String childName, String childBirthday) {
        this.setChildName(childName);
        this.setChildBirthday(childBirthday);
    }

    public Child() {
    }


    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void setChildBirthday(String childBirthday) {
        this.childBirthday = childBirthday;
    }

    public String getChildName() {
        return childName;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    @Override
    public String toString() {
        if(this.getChildName()==null) return "";
        return String.format("%s %s%n", this.childName, this.childBirthday);
    }
}
