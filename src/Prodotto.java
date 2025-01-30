import java.util.Random;


public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    //COSTRUTTORE
    public Prodotto(String nome, String descrizione, double prezzo, double iva){
        this.codice = generaCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //GENERO IL CODICE TRAMITE RANDOM (1-100000)
    private int generaCodice(){
        Random codRandom = new Random();
        return codRandom.nextInt(100000);
    }

    //
}
