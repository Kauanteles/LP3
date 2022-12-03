public class Main {
    public static void main(String[] args){
        Agendamento[] agendado = new Agendamento[3];
        agendado[0] = new Agendamento(30, 11, 2022, 21, 53, 52, "Kauan", "kakau@gmail.com", 991446395, 5, 2, 2004);
        agendado[1] = new Agendamento(12, 3,2024, 16, 7, 23, "Otto Von Chesterfield Squire", "chester@gmail.com", 111111111, 13, 12, 2022);
        agendado[2] = new Agendamento(7, 9, 2011, 12, 12, 12, "fuleco", "fuleco@gmail.com", 222222222, 4, 2, 2011);
        System.out.println(agendado[0].toString());
        System.out.println(agendado[1].toString());
        System.out.println(agendado[2].toString());
    }
}
