package robotService.entities.services;

import robotService.entities.robot.Robot;

public class SecondaryService extends BaseService{
    private final static int SECONDARY_SERVICE_CAPACITY=15;

    public SecondaryService(String name) {
        super(name, SECONDARY_SERVICE_CAPACITY);
    }
    @Override
    public void addRobot(Robot robot) {
        if (robot.getClass().getSimpleName().equals("FemaleRobot")) {
            super.addRobot(robot);
        }
    }
}
