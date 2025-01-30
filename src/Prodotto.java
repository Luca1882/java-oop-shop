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

    //METODO PREZZO BASE
    public double getPrezzoBase() {
        return prezzo;
    }

    //METODO PREZZO CON IVA
    public double getPrezzoIva(){
        return prezzo + (prezzo * iva/100);
    }

    //METODO NOME/CODICE ESTESO
    public String getNomeEsteso(){
        return codice + "-" + nome;
    }

    //GET & SET
    public int getCodice(){
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescrizione (){
        return descrizione;
    }

    public void setDescrzione(String descrizione){
        this.descrizione = descrizione;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(){
        this.prezzo = prezzo;
    }

    public double getIva(){
        return iva;
    }

    public void setIva(double iva){
        this.iva = iva;
    }
}
