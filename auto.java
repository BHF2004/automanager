class Auto {
    String marke;

    public static void main(String[] args) {
        System.out.println("Willommen zum Automanager");
        String auto1Marke;
        int auto1baujahr;
        int alter1;
        auto1Marke = "Tesla";
        auto1baujahr = 2018;
        alter1 = 2023 - auto1baujahr;
        System.out.println("Marke: " + auto1Marke);
        System.out.println("Baujahr: " + auto1baujahr);
        System.out.println("Alter: " + alter1);

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
