import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        Studente std1 = new Studente("Pippo", "Pippa", r.nextInt(50));

        Studente std2 = new Studente("Pluto", "Paper", r.nextInt(50));

        std1.nome = "Ciao"; // essendo public si può modificare senza utilizzare setNome

        //std1.setNome("Bruno");

        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std2.id);
        

    }
}