public class ConverterTest {
    public static void main(String[] args) {

        for(int i = 0;i<=7;i++){
            String weekday = CalendarConverter.convertDayToString(i);
            System.out.printf("%d dzień tygodnia to %s.\n", i, weekday);
        }


    }

}
