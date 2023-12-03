class Auto {
    String marke;
    int baujahr;
    int alter;

    public Auto(String marke, int baujahr) {
        int aktuellesJahr = 2023;
        this.marke = marke;
        this.baujahr = baujahr;
        this.alter = aktuellesJahr - baujahr;
    }

    public void zeigeDetails() {
        System.out.println("Marke: " + this.marke);
        System.out.println("Baujahr: " + this.baujahr);
        System.out.println("Alter: " + this.alter);
    }

    public static void main(String[] args) {
        System.out.println("Willommen zum Automanager");

        Auto auto1 = new Auto("Tesla", 2023);
        auto1.zeigeDetails();

        Auto auto2 = new Auto("Mercedes", 2010);
        auto2.zeigeDetails();

    }

}
