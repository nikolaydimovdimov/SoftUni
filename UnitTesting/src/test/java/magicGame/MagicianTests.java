package magicGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MagicianTests {

    private final static String MAG_NAME1 = "MAG1";
    private final static String MAG_NAME2 = "MAG2";
    private final static String M_N1 = "MN1";
    private final static String M_N2 = "MN2";

    private final static int MAG_HEALTH1 = 100;
    private final static int MAG_HEALTH2 = 200;

    Magician magician;
    List<Magic> magics;
    Magic magic1;
    Magic magic2;

    @Before
    public void prepare_MagicianTest() {
        this.magician = new Magician(MAG_NAME1, MAG_HEALTH1);
        magic1=new Magic(M_N1, 1);
        magic2=new Magic(M_N2, 2);
        this.magician.addMagic (magic1);
        this.magician.addMagic (magic2);

    }

    @Test
    public void test_getUsername() {
        Assert.assertEquals(MAG_NAME1, this.magician.getUsername());
    }

    @Test
    public void test_setUsername() {
        Magician newMagician = new Magician(MAG_NAME2, MAG_HEALTH1);
        Assert.assertEquals(MAG_NAME2, newMagician.getUsername());
    }

    @Test(expected = NullPointerException.class)
    public void test_setUsername_with_NULL() {
        Magician newMagician = new Magician(null, MAG_HEALTH1);

    }

    @Test
    public void test_getHealth() {
        Assert.assertEquals(MAG_HEALTH1, this.magician.getHealth());
    }

    @Test
    public void test_setHealth() {
        Magician newMagician = new Magician(MAG_NAME2, MAG_HEALTH2);
        Assert.assertEquals(MAG_HEALTH2, newMagician.getHealth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_setHealth_with_NEGATIVE() {
        Magician newMagician = new Magician(MAG_NAME2, -1);

    }

    @Test
    public void test_getMagics() {
        List<Magic> expectedList = new ArrayList<>();
        expectedList.add(magic1);
        expectedList.add(magic2);
        Assert.assertEquals(expectedList.size(),this.magician.getMagics().size());
        for (int i = 0; i < expectedList.size(); i++) {
         Assert.assertEquals(expectedList.get(i).getName(),this.magician.getMagics().get(i).getName());
         Assert.assertEquals(expectedList.get(i).getBullets(),this.magician.getMagics().get(i).getBullets());
        }
    }
    @Test
    public void test_takeDamage(){
        this.magician.takeDamage(5);
        Assert.assertEquals(MAG_HEALTH1-5,this.magician.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void test_takeDamage_DEATH(){
        this.magician.takeDamage(MAG_HEALTH1);
        this.magician.takeDamage(5);
    }
    @Test(expected = NullPointerException.class)
    public void test_addMagic_NULL(){
        this.magician.addMagic(null);
    }

    @Test
    public void test_removeMagic(){
        Assert.assertEquals(true,this.magician.removeMagic(magic1));
    }
    @Test
    public void test_getMagic(){
        Assert.assertEquals(magic1,this.magician.getMagic(M_N1));
    }
    @Test
    public void test_getMagic_Wrong_Name(){
        Assert.assertEquals(null,this.magician.getMagic("XXX"));
    }

}
