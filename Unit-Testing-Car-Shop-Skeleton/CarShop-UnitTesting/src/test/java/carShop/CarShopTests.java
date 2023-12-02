package carShop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CarShopTests {


    Car car;

    CarShop carShop;


    @Before
    public void prepare_CarShopTest() {
        this.car = new Car("Model1", 120, 1000);
        this.carShop = new CarShop();

    }

    @Test
    public void test_getCars() {
        this.carShop.add(car);

        List<Car> expectedList = new ArrayList<>();
        expectedList.add(car);

        Assert.assertEquals(expectedList, this.carShop.getCars());
    }

    @Test
    public void test_getCount() {
        this.carShop.add(car);
        Assert.assertEquals(1, this.carShop.getCount());
        this.carShop.add(car);
        Assert.assertEquals(2, this.carShop.getCount());
    }





    @Test
    public void test_add() {
        this.carShop.add(car);
        Assert.assertEquals(1, this.carShop.getCount());
    }

    @Test(expected = NullPointerException.class)
    public void test_add_with_null_arg() {
        this.carShop.add(null);
    }

    @Test
    public void test_remove() {
        this.carShop.add(car);
        Assert.assertEquals(1, this.carShop.getCount());
        Assert.assertTrue(this.carShop.remove(car));
        Assert.assertEquals(0, this.carShop.getCount());
    }
@Test
    public void test_getTheMostLuxuryCar(){
        this.carShop.add(new Car( "M1",50,500));
        this.carShop.add(new Car( "M2",100,1000));
        this.carShop.add(new Car( "M3",150,1500));
        Car expectedCar=new Car( "M3",150,1500);
        Car actualCar=this.carShop.getTheMostLuxuryCar();
        Assert.assertEquals(expectedCar.getModel(),actualCar.getModel());
        Assert.assertEquals(expectedCar.getHorsePower(),actualCar.getHorsePower());
        Assert.assertEquals(expectedCar.getPrice()+"",actualCar.getPrice()+"");
}
@Test
    public void test_findAllCarsWithMaxHorsePower(){
    this.carShop.add(new Car( "M1",50,500));
    this.carShop.add(new Car( "M2",100,1000));
    this.carShop.add(new Car( "M3",150,1500));
    List<Car> expectedList=new ArrayList<>();
    expectedList.add(new Car( "M2",100,1000));
    expectedList.add(new Car( "M3",150,1500));
    List<Car> actualList=this.carShop.findAllCarsWithMaxHorsePower(90);
    Assert.assertEquals(expectedList.size(),actualList.size());
    for (int i = 0; i < expectedList.size(); i++) {
        Assert.assertEquals(expectedList.get(i).getModel(),actualList.get(i).getModel());
        Assert.assertEquals(expectedList.get(i).getHorsePower(),actualList.get(i).getHorsePower());
        Assert.assertEquals(expectedList.get(i).getPrice()+"",actualList.get(i).getPrice()+"");
    }
}
@Test
    public void test_findAllCarByModel(){
    this.carShop.add(new Car( "M1",50,500));
    this.carShop.add(new Car( "M2",100,1000));
    this.carShop.add(new Car( "M3",150,1500));
    this.carShop.add(new Car( "M1",50,500));
    this.carShop.add(new Car( "M2",100,1000));
    this.carShop.add(new Car( "M3",200,2000));
    List<Car> expectedList=new ArrayList<>();
    expectedList.add(new Car( "M3",150,1500));
    expectedList.add(new Car( "M3",200,2000));
    List<Car> actualList=this.carShop.findAllCarByModel("M3");
    Assert.assertEquals(expectedList.size(),actualList.size());
    for (int i = 0; i < expectedList.size(); i++) {
        Assert.assertEquals(expectedList.get(i).getModel(),actualList.get(i).getModel());
        Assert.assertEquals(expectedList.get(i).getHorsePower(),actualList.get(i).getHorsePower());
        Assert.assertEquals(expectedList.get(i).getPrice()+"",actualList.get(i).getPrice()+"");
    }
}


}

