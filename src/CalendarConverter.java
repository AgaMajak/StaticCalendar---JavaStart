public class CalendarConverter {
    int Monday = 1;
    int Tuesday = 2;
    int Wednesday = 3;
    int Thursday = 4;
    int Friday = 5;
    int Saturday = 6;
    int Sunday = 7;

    String convertDayToString(int dayNumber) {
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
