package Creational.builder;

//normale Klasse
public class Kunde
{
    private String name;
    private double tariffPrice;
    private double powerConsumption;

    //privater Konstruktor verhindert dass klasse direkt instanziiert wird
    private Kunde()
    {

    }   

    public String getName()
    {
        return name;
    }

    public double getTariffPrice()
    {
        return tariffPrice;
    }

    public double getPowerConsumption()
    {
        return powerConsumption;
    }

    /**
     * Builder Klasse 
     * -> Innerhalb von normaler Klasse; enthält Methoden zum Festlegen von verschiedenen Eigenschaften
     * von Produkt
     * 
     * Jede Methode gibt Builder selbst zurück -> Verkettung der Methodenaufrufe
    **/
    public static class Builder
    {
        private String name;
        private double tariffPrice;
        private double powerConsumption;  
    
        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder setTariffPrice(double tariffPrice)
        {
            this.tariffPrice = tariffPrice;
            return this;
        }

        public Builder setPowerConsumption(double powerConsumption)
        {
            this.powerConsumption = powerConsumption;
            return this;
        }

        //Erstellt Objekt unter Verwendung von gesetzten Eigenschaften -> gibt es zurück
        public Kunde build()
        {
            Kunde kunde = new Kunde();
            kunde.name = this.name;
            kunde.tariffPrice = this.tariffPrice;
            kunde.powerConsumption = this.powerConsumption;
            return kunde;
        }
    }
}