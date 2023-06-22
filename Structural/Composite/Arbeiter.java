package Structural.Composite;

class Arbeiter implements MitarbeiterInterface{

	public static void main(String[] args) {}
	
    private String name;
    private String abteilung;
    private int mitarbeiterAnzahl=0;
    public Arbeiter(String name, String abteilung){

        this.name = name;
        this.abteilung = abteilung;

    }
    //mit dieser methode können sie mitarbeiter anzeigen
    public void mitarbeiterAnzeigen(){
        System.out.println(this.name + " arbeitet in der Abteilung " + this.abteilung);
    }
    //mit dieser methode können sie mitarbeiter anzahl anzeigen
    public int anzahlAnzeigen(){
    	// System.out.println(mitarbeiterAnzahl);
        return mitarbeiterAnzahl;

    }
}