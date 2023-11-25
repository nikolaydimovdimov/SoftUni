package robots;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTests {

    private final static String SERVICE_NAME = "Service_NAME";
    private final static String ROBOT_NAME = "ROBOT_NAME";
    private final static int CAPACITY = 10;

    Service service;
    Robot robot;

    @Before
    public void arrange_Service() {
        this.service = new Service(SERVICE_NAME, CAPACITY);
        this.robot = new Robot(ROBOT_NAME);
    }



    @Test(expected = NullPointerException.class)
    public void test_Constructor_with_NAME_null() {
        Service serviceNull=new Service(null,CAPACITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Constructor_with_Negative_Capacity() {
        Service serviceNull=new Service(SERVICE_NAME,-1);
    }

    @Test
    public void test_Constructor_Capacity() {
        Assert.assertEquals(CAPACITY, this.service.getCapacity());
    }

    @Test
    public void test_getName() {
        Assert.assertEquals(SERVICE_NAME, this.service.getName());
    }

    @Test(expected = NullPointerException.class)
    public void test_setName_with_NULL(){
        Service serviceNull=new Service(null,CAPACITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_setCapacity_with_Negative(){
        Service serviceNull=new Service(SERVICE_NAME,-1);
    }

    @Test
    public void test_getCapacity() {
        Assert.assertEquals(CAPACITY, this.service.getCapacity());

    }


    @Test
    public void test_getCount() {
        this.service.add(robot);
        Assert.assertEquals(1, this.service.getCount());
    }

    @Test
    public void test_Add_when_Service_NOT_FULL() {
        this.service.add(robot);
        Assert.assertEquals(1, this.service.getCount());
        this.service.add(robot);
        Assert.assertEquals(2, this.service.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Add_when_Service_FULL() {
        while (this.service.getCount() < this.service.getCapacity()) {
            this.service.add(this.robot);
        }

        this.service.add(this.robot);
    }

    @Test
    public void test_Remove_when_Robot_Exist_in_Service() {
        this.service.add(this.robot);
        Assert.assertEquals(1,this.service.getCount());
        this.service.remove(ROBOT_NAME);
        Assert.assertEquals(0,this.service.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Remove_when_Robot_NOTExist_in_Service() {
        this.service.add(this.robot);
        this.service.remove(ROBOT_NAME+"x");
    }

    @Test
    public void test_forSale_when_Robot_Exist_in_Service() {
        this.service.add(this.robot);
        Assert.assertEquals(this.robot, this.service.forSale(ROBOT_NAME));
        Assert.assertFalse(this.robot.isReadyForSale());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_forSale_when_Robot_NOT_Exist_in_Service() {
        this.service.add(this.robot);
        Assert.assertEquals(this.robot, this.service.forSale(ROBOT_NAME+"x"));
    }
    @Test
    public void test_Report(){
        this.service.add(robot);
        String report=ROBOT_NAME;
        String.format("The robot %s is in the service %s!",report, this.service.getName());
        Assert.assertEquals(String.format("The robot %s is in the service %s!",report, this.service.getName())
                ,this.service.report());
        Robot robotSecond=new Robot(ROBOT_NAME+"x");
        this.service.add(robotSecond);
        report+=", "+ROBOT_NAME+"x";
        report= String.format("The robot %s is in the service %s!",report, this.service.getName());
        Assert.assertEquals(report,this.service.report());
    }
}
