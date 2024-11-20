package esercizio3;

public class Cliente {
    String codiceCliente;
    String nome;
    String cognome;
    String email;
    String dataIscrizione;

    public Cliente(String codiceCliente, String nome, String cognome, String email, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }
}
