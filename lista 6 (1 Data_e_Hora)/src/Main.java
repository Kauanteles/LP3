public class Main{
    public static void main(String[] args){
        DataHora d1 = new DataHora(26, 11, 2022, 8, 10, 45);
        DataHora d2 = new DataHora(10, 3, 2000, 13, 46, 52);

        System.out.println(d1.toString());
        System.out.println(d2.toString());

        System.out.println(d1.isEqual(d2));
        System.out.println(d1.isGreater(d2));
        System.out.println(d1.isLower(d2));
    }
}