package magicGame.models.magics;

public class RedMagic extends MagicImpl {
    private final static int REDUCED_BULLETS = 1;

    public RedMagic(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        int count=super.getBulletsCount()-REDUCED_BULLETS;
        if(count<0){
            count=0;
            this.setBulletsCount(count);
        }else {
            this.setBulletsCount(count);
            count=REDUCED_BULLETS;
        }
        return count;
    }


}
