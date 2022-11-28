public class Main {
    public static void main(String[] args) {
        Time horario1 = new Time(22,30,52);
        Time horario2 = new Time(05,15,00);
        horario1.prnTime();
        horario2.prnTime();
        System.err.println("\nquantidade de segundos entre horario1 e horario2\n");
        System.out.println(horario1.cron(horario2));
        horario1.addSeconds(8);
        System.out.println("\nhorario1 + 8 segundos: ");
        horario1.prnTime();

        horario1.addSeconds(2,8);
        System.out.println("\nhorario1 + 2 minutos e 8 segundos: ");
        horario1.prnTime();

        horario1.addSeconds(1,2,8);
        System.out.println("\nhorario1 + 1 hora, 2 minutos e 8 segundos: ");
        horario1.prnTime();

        horario1.addSeconds(horario2);
        System.out.println("\nhorario1 + horario2: ");
        horario1.prnTime();
    }
}
