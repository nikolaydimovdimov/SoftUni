package shelter;

public class Animal {

    String name;
    int age;
    String caretaker;


    public Animal(String name, int age, String caretaker) {
        this.name = name;
        this.age = age;
        this.caretaker = caretaker;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCaretaker() {
        return caretaker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCaretaker(String caretaker) {
        this.caretaker = caretaker;
    }

    @Override
    public String toString() {
        return String.format("%s %d (%s)",
                this.name,this.age,this.caretaker).trim();
    }
}
