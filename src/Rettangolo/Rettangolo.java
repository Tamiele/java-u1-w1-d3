package Rettangolo;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public void stamparettangolo() {
        int area = altezza * larghezza;
        int perimetro = 2 * (altezza + larghezza);

        System.out.println("area rettangolo" + " " + area);
        System.out.println("perimetro rettangolo" + " " + perimetro);
    }

    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
        int areaPrimoRettangolo = ret1.altezza * ret1.larghezza;
        int perimetroPrimoRettangolo = 2 * (ret1.altezza + ret1.larghezza);

        int areaSecondoRettangolo = ret2.altezza * ret2.larghezza;
        int perimetroSecondoRettangolo = 2 * (ret2.altezza + ret2.larghezza);

        int sommaArea = areaPrimoRettangolo + areaSecondoRettangolo;
        int sommaPerimetro = perimetroPrimoRettangolo + perimetroSecondoRettangolo;

        System.out.println("area primo rettangolo" + " " + areaPrimoRettangolo);
        System.out.println("perimetro primo rettangolo" + " " + perimetroPrimoRettangolo);

        System.out.println("area secondo rettangolo" + " " + areaSecondoRettangolo);
        System.out.println("perimetro secondo rettangolo" + " " + perimetroSecondoRettangolo);

        System.out.println("somma area rettangoli" + " " + sommaArea);
        System.out.println("somma perimetro rettangoli" + " " + sommaPerimetro);


    }

    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        rettangolo.stamparettangolo();
        Rettangolo rettangolo1 = new Rettangolo(10, 10);
        Rettangolo rettangolo2 = new Rettangolo(5, 15);
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);

    }
}
