public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Date otherDate = new Date();

        date.setDate(10, 10, 2023);
        date.printDate();
        date.printFullDate();
        otherDate.setDate(20, 12, 2022);
        System.out.printf("%d dias até a outra data\n",date.howManyDays(otherDate));
        
        
        
    }
}
