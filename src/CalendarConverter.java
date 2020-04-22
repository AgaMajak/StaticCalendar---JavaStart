public class CalendarConverter {
    private final int Monday = 1;
    private final int Tuesday = 2;
    private final int Wednesday = 3;
    private final int Thursday = 4;
    private final int Friday = 5;
    private final int Saturday = 6;
    private final int Sunday = 7;

    public static String convertDayToString(int dayNumber) {
        String day;
        switch (dayNumber) {
            case 1:
                return day = "Poniedziałek";
            case 2:
                return day = "Wtorek";
            case 3:
                return day = "Środa";
            case 4:
                return day = "Czwartek";
            case 5:
                return day = "Piątek";
            case 6:
                return day = "Sobota";
            case 7:
                return day = "Niedziela";
            default:
                day = "Błędny numer";
        }
        return day;
    }

}
