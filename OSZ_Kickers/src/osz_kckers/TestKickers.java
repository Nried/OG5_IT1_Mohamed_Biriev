package osz_kckers;

public class TestKickers {
    
    public static void main(String[] args) {
        
        Spieler spieler = new Spieler();
        spieler.setNamen("Floerian");
        spieler.setTrikotNr(13);
        spieler.setSpielPos("Stürmer");
        
        System.out.println("Spieler: " + spieler.getNamen());
        System.out.println("Trikot: " + spieler.getTrikotNr());
        System.out.println("Position: " + spieler.getSpielPos());
        
        Schiedsrichter schiri = new Schiedsrichter();
        schiri.setNamen("Tom");
        schiri.setAnzGepfiffeneSpiele(25);
        
        System.out.println("\nSchiedsrichter: " + schiri.getNamen());
        System.out.println("Spiele geleitet: " + schiri.getAnzGepfiffeneSpiele());
        
        Trainer trainer = new Trainer();
        trainer.setNamen("Coach Enes Yilmaz");
        trainer.setLizenzklasse('B');
        trainer.setAufwandEnt(500.00);
        
        System.out.println("\nTrainer: " + trainer.getNamen());
        System.out.println("Lizenz: " + trainer.getLizenzklasse());
        System.out.println("Aufwandsentschädigung: €" + trainer.getAufwandEnt());
        
        Mannschaftsleiter leiter = new Mannschaftsleiter();
        leiter.setNamen("Long Phan Hoang");
        leiter.setMannschaftsname("Kickers U17");
        leiter.setKannOrganisieren(true);
        
        System.out.println("\nMannschaftsleiter: " + leiter.getNamen());
        System.out.println("Mannschaft: " + leiter.getMannschaftsname());
        System.out.println("Kann organisieren: " + leiter.isKannOrganisieren());
        
        System.out.println("\nAlle Objekte wurden erstellt!");
    }
}