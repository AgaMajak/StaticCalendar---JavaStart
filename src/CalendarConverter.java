public class CalendarConverter {
    private int Monday = 1;
    private int Tuesday = 2;
    private int Wednesday = 3;
    private int Thursday = 4;
    private int Friday = 5;
    private int Saturday = 6;
    private int Sunday = 7;

    public static String convertDayToString(int dayNumber) {
        String day;
        switch (dayNumber) {
            case 1:
                return day ="Monday";
            case 2:
                return day ="Tuesday";
            case 3:
                return day ="Wednesday";
            case 4:
                return day ="Thursday";
            case 5:
                return day = "Friday";
            case 6:
                return day = "Saturday";
            case 7:
                return day ="Sunday";
            default:
                day = "Błędny numer";
        }
        return day;
    }

}
