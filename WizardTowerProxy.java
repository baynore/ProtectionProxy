import java.util.ArrayList;

public class WizardTowerProxy implements WizardTower {

    public ArrayList<Wizard> wizardList = new ArrayList<Wizard>();

    private static final int MAX_WIZARDS = 4;
    private static final int MIN_CREDITS = 100;

    int numWizards = 0;
    WizardTower tower;

    public WizardTowerProxy(WizardTower tower) {
    
        this.tower = tower;
    
    }

    public void enter(Wizard wizard) {
    
        int wizardCredits = wizard.credits;

        if (numWizards < MAX_WIZARDS && wizardCredits >= MIN_CREDITS) {
        
            tower.enter(wizard);
            wizardList.add(wizard);
            numWizards++;
        
        }
        else if (numWizards >= MAX_WIZARDS) {
        
            System.out.println("Don't you know the rules? Only " + MAX_WIZARDS + " wizards allowed in the tower!");
        
        }
        else if (wizardCredits < MIN_CREDITS) {
        
            System.out.println("Nice try! You need at least " + MIN_CREDITS + " credits to enter!");
        
        }
    
    }

    public void exit(Wizard wizard) {
    
        if (wizardList.contains(wizard)) {
            
            tower.exit(wizard);
            wizardList.remove(wizard);
            numWizards--;
        
        }
        else
            System.out.println("Seriously? I'm an archwizard. I know you are not in the tower.");
    
    }

}
