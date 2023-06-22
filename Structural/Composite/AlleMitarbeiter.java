package Structural.Composite;

import java.util.ArrayList;

class AlleMitarbeiter implements MitarbeiterInterface {

	public static void main(String[] args) {}
	
	private int mitarbeiterAnzahl=0;
	private String name;
	private String abteilung;
	private ArrayList<MitarbeiterInterface> Abstammen;
	
    //mit dieser methode können sie mitarbeiter anzeigen
    public void mitarbeiterAnzeigen(){

        System.out.println(this.name + " arbeitet in der Abteilung " + this.abteilung);

        for(MitarbeiterInterface i: Abstammen){
            i.mitarbeiterAnzeigen();
          
        }

    }

    //Diese Methode gibt die Mitarbeiter anzahl Zurück
    public int anzahlAnzeigen(){
        mitarbeiterAnzahl=Abstammen.size();
        for(MitarbeiterInterface e: Abstammen){
            mitarbeiterAnzahl+=e.anzahlAnzeigen();
        }
        return mitarbeiterAnzahl;
    }
    //Diese Methode macht was 
    public AlleMitarbeiter(String name, String abteilung){

        this.name = name;
        this.abteilung = abteilung;
        Abstammen = new ArrayList <MitarbeiterInterface>();

    }

    //Mit dieser Methode können sie mitarbeiter hinzufügen
    public void mitarbeiterEinfügen(MitarbeiterInterface i){

        Abstammen.add(i);

    }

    //Mit dieser Methode können sie mitarbeiter entfernen
    public void mitarbeiterEntfernen(MitarbeiterInterface i){

        Abstammen.remove(i);

    }
}