public class Main {
    public static void main(String[] args) {
        Date date = new Date(14, 11, 2024);
        Date otherDate = new Date(12, 12, 2022);

        Date.printDate(date);
        Date.printFullDate(date);
        System.out.printf("%d dias até a outra data\n",date.howManyDays(otherDate));
        System.out.println(Date.dayOfWeek(date));
        
        
        
        
    }
}
