public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(2000, "AB123CD", "Tesla", "Model S");

        //auto1.cilindrata = 2000;
        auto1.setCilindrata(3000); // essendo che è cilindrata è stata impostata private
                                  // bisogna usare setCilindrata per modificare il valore
                                  // se si vuole solo richiamare basta usare getCilindrata

        System.out.println(auto1);
        System.out.println(auto1.getTarga());
    }
}