public class Main {
    public static void main(String[] args) {
        //Creazione del prodotto
        Prodotto prodotto = new Prodotto("Laptop", "Asus-Rog", 1450.00, 22.0);

        //TEST
        System.out.println("Codice prodotto: " + prodotto.getCodice());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo Base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con Iva: " + prodotto.getPrezzoIva());
    }
}
