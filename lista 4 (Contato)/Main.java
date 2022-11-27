public class Main {
    public static void main(String[] args) {
        
        Date dateNascimento = new Date();
        contato contato = new contato("kakau", "kakau@gmail.com", 991446395, dateNascimento);
        Date dateAtual = new Date();

        dateNascimento.setDate(05, 02, 2004);
        dateAtual.setDate(30, 10, 2022);

        contato.printContato();
        System.out.println("\n"+contato.ageCalculator (dateNascimento,dateAtual));
    }
}
