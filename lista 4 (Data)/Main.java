public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Date otherDate = new Date();

        date.setDate(14, 11, 2024);
        date.printDate();
        date.printFullDate();
        otherDate.setDate(12, 12, 2022);
        System.out.printf("%d dias até a outra data\n",date.howManyDays(otherDate));
        System.out.println(date.dayOfWeek());
        
        
        
    }
}
