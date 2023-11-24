package robotService.entities.services;

import robotService.entities.robot.Robot;

public class MainService extends BaseService {
    private final static int MAIN_SERVICE_CAPACITY = 30;

    public MainService(String name) {
        super(name, MAIN_SERVICE_CAPACITY);
    }

    @Override
    public void addRobot(Robot robot) {
        if (robot.getClass().getSimpleName().equals("MaleRobot")) {
            super.addRobot(robot);
        }
    }
}
