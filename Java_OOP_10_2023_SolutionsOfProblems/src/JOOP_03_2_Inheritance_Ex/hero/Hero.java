package JOOP_03_2_Inheritance_Ex.hero;

public class Hero {
    private String userName;
    private int level;

    public Hero(String userName, int level){
        this.setUsername(userName);
        this.setLevel(level);
    }

    private void setUsername(String userName){
        this.userName = userName;
    }
    private void setLevel(int level){
        this.level=level;
    }

    public String getUsername(){
        return this.userName;
    }

    public int getLevel() {
        return level;
    }

    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }

}
