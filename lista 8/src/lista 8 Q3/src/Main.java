public class Main {
    public static void main(String[] args) throws Exception {
        Data data = new Data(05,02,2004);
        Governador governador = new Governador("kakau", 52, data, "uwu", 69, "Bahia");
        Prefeito prefeito = new Prefeito("tchonga", 52, data, "sheesh", 69, "Pindamonhangaba");

        System.out.println(governador.toString());
        System.out.println(prefeito.toString());
    }
}
