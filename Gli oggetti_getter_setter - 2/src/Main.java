/*Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.*/

public class Main {
    public static void main(String[] args) {
        Auto n1 = new Auto(2000,"AB123CD","Tesla","Model S");
        n1.setCilindrata(1600);

        n1.targa = "AB345CD";

        System.out.println(n1);
        System.out.println(n1.getMarca());

    }
}