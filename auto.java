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

        String auto2Marke;
        int auto2baujahr;
        int alter2;
        auto2Marke = "Mercedes";
        auto2baujahr = 2010;
        alter2 = 2023 - auto2baujahr;
        System.out.println("Marke: " + auto2Marke);
        System.out.println("Baujahr: " + auto2baujahr);
        System.out.println("Alter: " + alter2);

    }

}
