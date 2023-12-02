package magicGame.models.magicians;

import magicGame.models.magics.Magic;

public class Wizard extends MagicianImpl{
    public Wizard(String userName, int health, int protection, Magic magic) {
        super(userName, health, protection, magic);
    }
}
