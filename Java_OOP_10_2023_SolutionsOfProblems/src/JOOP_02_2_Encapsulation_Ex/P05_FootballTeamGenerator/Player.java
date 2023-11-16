package JOOP_02_2_Encapsulation_Ex.P05_FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }


    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        statsValidate(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        statsValidate(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        statsValidate(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        statsValidate(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        statsValidate(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void statsValidate(int stat, String statType) {
        if (stat < 0 || stat > 100) {
            throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", statType));
        }
    }

    public String getName() {
        return this.name;
    }

    public double overallSkillLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;
    }
}
