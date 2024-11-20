package esercizio2;

import java.util.Arrays;

public class Sim {
    int numeroDiTelefono;
    int creditoDisponibile;
    int[] registroChiamate;

    public Sim(int numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.creditoDisponibile = 0;
        this.registroChiamate = new int[5];
    }

    public void infoSim() {
        System.out.println("numero di Telefono" + " " +
                numeroDiTelefono +" "+ "credito" + " " + creditoDisponibile +" "+ "chiamate effettuate" + " " + Arrays.toString(registroChiamate));

    }

    public static void main(String[] args) {
        Sim sim1 = new Sim(333505568);
        sim1.infoSim();
    }
}
