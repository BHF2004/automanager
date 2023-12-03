class Auto {
    String marke;
    int baujahr;

    public void zeigeDetails() {
        System.out.println("Marke: " + this.marke);
        System.out.println("Baujahr: " + this.baujahr);
    }

    public static void main(String[] args) {
        System.out.println("Willommen zum Automanager");
        Auto auto1 = new Auto();
        auto1.marke = "Tesla";
        auto1.baujahr = 2023;
        System.out.println("Marke: " + auto1.marke);
        System.out.println("Baujahr: " + auto1.baujahr);

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
