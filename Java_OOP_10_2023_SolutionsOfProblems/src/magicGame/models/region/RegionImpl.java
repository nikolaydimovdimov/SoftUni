package magicGame.models.region;

import magicGame.models.magicians.BlackWidow;
import magicGame.models.magicians.Magician;
import magicGame.models.magicians.Wizard;

import java.util.ArrayList;
import java.util.Collection;

public class RegionImpl implements Region {


    public String start(Collection<Magician> magicians) {
        Collection<Magician> wizards = new ArrayList<>();
        Collection<Magician> blackWidows = new ArrayList<>();
        for (Magician magician : magicians) {
            if (magician.getClass().getSimpleName().equals("Wizard")) {
                wizards.add(magician);
            } else if (magician.getClass().getSimpleName().equals("BlackWidow")) {
                blackWidows.add(magician);
            }
        }
        Wizard currentWizardAttack = getWizardAttack(wizards);
        BlackWidow currentBlackWidowAttack = getBlackWidowAttack(blackWidows);
        Wizard currentWizardDefend = getWizardDefend(wizards);
        BlackWidow currentBlackWidowDefend = getBlackWidowDefend(blackWidows);
        while (currentWizardDefend != null && currentBlackWidowDefend != null) {
            if(currentWizardAttack!=null) {
                currentBlackWidowDefend.takeDamage(currentWizardAttack.getMagic().fire());
            }
            if (currentBlackWidowAttack!=null) {
                currentWizardDefend.takeDamage(currentBlackWidowAttack.getMagic().fire());
            }

            currentWizardAttack = getWizardAttack(wizards);
            currentBlackWidowAttack = getBlackWidowAttack(blackWidows);
            currentWizardDefend = getWizardDefend(wizards);
            currentBlackWidowDefend = getBlackWidowDefend(blackWidows);
        }
        String output;
        if (currentBlackWidowDefend == null) {
            output = "Wizards win!";
        } else {
            output = "Black widows win!";
        }

        return output;

    }

    private Wizard getWizardAttack(Collection<Magician> wizards) {
        return (Wizard) wizards
                .stream()
                .filter(wizard -> wizard.isAlive() && wizard.getMagic().getBulletsCount() > 0)
                .findFirst()
                .orElse(null);
    }

    private Wizard getWizardDefend(Collection<Magician> wizards) {
        return (Wizard) wizards
                .stream()
                .filter(wizard -> wizard.isAlive())
                .findFirst()
                .orElse(null);
    }

    private BlackWidow getBlackWidowAttack(Collection<Magician> blackWidows) {
        return (BlackWidow) blackWidows
                .stream()
                .filter(blackWidow -> blackWidow.isAlive() && blackWidow.getMagic().getBulletsCount() > 0)
                .findFirst()
                .orElse(null);
    }

    private BlackWidow getBlackWidowDefend(Collection<Magician> blackWidows) {
        return (BlackWidow) blackWidows
                .stream()
                .filter(blackWidow -> blackWidow.isAlive())
                .findFirst()
                .orElse(null);
    }
}
