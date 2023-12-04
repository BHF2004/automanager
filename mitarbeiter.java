import java.time.LocalDate;

class Mitarbeiter {
    String Vorname;
    String Nachname;
    int Alter;

    public Mitarbeiter(String Vorname, String Nachname, int alter) {
        int aktuellesJahr = LocalDate.now().getYear();
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Alter = aktuellesJahr - alter;
    }

    public void infos() {
        System.out.println("Vorname: " + this.Vorname);
        System.out.println("Nachname: " + this.Nachname);
        System.out.println("Alter: " + this.Alter);

    }

    public static void main(String[] args) {

        Mitarbeiter Arbeit1 = new Mitarbeiter("Eren", "Cetinbas", 19);
        Arbeit1.infos();
    }
}
