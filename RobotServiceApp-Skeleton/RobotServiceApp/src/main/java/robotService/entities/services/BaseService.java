package robotService.entities.services;

import robotService.entities.robot.Robot;
import robotService.entities.supplements.Supplement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseService implements Service {
    private String name;
    private int capacity;
    private Collection<Supplement> supplements;
    private Collection<Robot> robots;


    public BaseService(String name, int capacity) {
        this.setName(name);
        this.setCapacity(capacity);
        this.supplements = new ArrayList<>();
        this.robots = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return supplements;
    }

    @Override
    public void addRobot(Robot robot) {
        if (this.robots.size() < this.capacity) {
            this.robots.add(robot);
        } else {
            throw new IllegalStateException("Not enough capacity for this robot.");
        }
    }

    @Override
    public void removeRobot(Robot robot) {
        if (this.robots.contains(robot)) this.robots.remove(robot);
    }

    @Override
    public void addSupplement(Supplement supplement) {
        this.supplements.add(supplement);
    }

    @Override
    public void feeding() {
        this.robots.forEach(Robot::eating);
    }

    @Override
    public int sumHardness() {
        return this.supplements.stream().mapToInt(Supplement::getHardness).sum();
    }

    @Override
    public String getStatistics() {
        StringBuilder output = new StringBuilder();
        output.append(this.name).append(" ").append(this.getClass().getSimpleName()).append(":").append(System.lineSeparator());
        output.append("Robots: ");
        if (this.robots.isEmpty()) {
            output.append("none").append(System.lineSeparator());
        } else {
            String strRobots = robots.stream()
                    .map(Robot::getName)
                    .collect(Collectors.joining(" "));
            output.append(strRobots).append(System.lineSeparator());
        }
        output.append(String.format("Supplements: %d Hardness: %d",
                this.supplements.size(), this.sumHardness()));
        return output.toString();
    }

    protected void setSupplements(Collection<Supplement> supplements) {
        this.supplements = supplements;
    }

    @Override
    public Collection<Robot> getRobots() {
        return robots;
    }

    protected void setRobots(Collection<Robot> robots) {
        this.robots = robots;
    }
}
