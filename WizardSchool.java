
public class WizardSchool {

    public static void main(String[] args) {
    
        WizardTowerProxy wtp = new WizardTowerProxy(new IvoryTower());

        Wizard ezekiel = new Wizard("Ezekiel", 110);
        Wizard jon = new Wizard("Jon", 100);
        Wizard becca = new Wizard("Becca", 120);
        Wizard edward = new Wizard("Edward", 105);
        Wizard ren = new Wizard("Ren", 110);
        Wizard emily = new Wizard("Emily", 90);

        wtp.enter(jon);
        wtp.enter(edward);
        wtp.enter(emily);
        wtp.enter(ezekiel);
        wtp.enter(becca);
        wtp.exit(ren);
        wtp.enter(ren);
        wtp.exit(edward);
    
    }

}
