public class Main{
    public static void main(String[] args){
        
        Date data1 = new Date(26, 11, 2022);
        Time hora1 = new Time(8, 20, 54);
        DataHora d1 = new DataHora(data1, hora1);
        Date data2 = new Date(10, 3, 2000);
        Time hora2 = new Time(13, 45, 43);
        DataHora d2 = new DataHora(data2, hora2);

        System.out.printf("%s %s\n",data1.printFullDate(),hora1.getTime());
        System.out.printf("%s %s\n",data2.printFullDate(),hora2.getTime());

        System.out.println(d1.isEqual(d2));
        System.out.println(d1.isGreater(d2));
        System.out.println(d1.isLower(d2));
    }
}