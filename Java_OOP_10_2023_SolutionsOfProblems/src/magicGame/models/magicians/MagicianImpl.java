package magicGame.models.magicians;

import magicGame.models.magics.Magic;

import static magicGame.common.ExceptionMessages.*;

public abstract class MagicianImpl implements Magician {
    private String userName;
    private int health;
    private int protection;
    private boolean isAlive;
    private Magic magic;

    public MagicianImpl(String userName, int health, int protection, Magic magic) {
        this.setUserName(userName);
        this.setHealth(health);
        this.setProtection(protection);
        if (this.health>0) {
            this.isAlive = true;
        }else {
            this.isAlive=false;
        }
        this.setMagic(magic);
    }

    private void setUserName(String userName) {
        if (userName == null || userName.trim().isEmpty()) {
            throw new NullPointerException(INVALID_MAGICIAN_NAME);
        }
        this.userName = userName;
    }

    private void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException(INVALID_MAGICIAN_HEALTH);
        }
        this.health = health;
    }

    private void setProtection(int protection) {
        if (protection < 0) {
            throw new IllegalArgumentException(INVALID_MAGICIAN_PROTECTION);
        }
        this.protection = protection;
    }

    private void setMagic(Magic magic) {
        if (magic == null) {
            throw new NullPointerException(INVALID_MAGIC);
        }
        this.magic = magic;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getProtection() {
        return this.protection;
    }

    @Override
    public Magic getMagic() {
        return this.magic;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(int points) {
        if (this.protection - points <= 0) {
            this.protection = 0;
            this.health -= points;
            if (this.health < 0) {
                this.health = 0;
            }
        } else {
            this.protection -= points;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %s%nHealth: %s%nProtection: %s%nMagic: %s",
                this.getClass().getSimpleName(),
                this.userName,
                this.health,
                this.protection,
                this.magic.getName());
    }
}
