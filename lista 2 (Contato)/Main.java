public class Main {
    public static void main(String[] args) {
        contato contato = new contato();
        Date dateNascimento = new Date();
        Date dateAtual = new Date();

        dateNascimento.setDate(05, 02, 2004);
        dateAtual.setDate(30, 10, 2022);

        contato.setContato("kakau", "kakau@gmail.com", 991446395, dateNascimento);
        contato.printContato();
        System.out.println("\n"+contato.ageCalculator (dateNascimento,dateAtual));
    }
}
