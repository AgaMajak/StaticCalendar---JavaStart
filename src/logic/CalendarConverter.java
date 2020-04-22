package logic;

public class CalendarConverter {
    private final static int MONDAY = 1;
    private final static int TUESDAY = 2;
    private final static int WEDNESDAY = 3;
    private final static int THURSDAY = 4;
    private final static int FRIDAY = 5;
    private final static int SATURDAY = 6;
    private final static int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        String day;
        switch (dayNumber) {
            case MONDAY:
                return day = "Poniedziałek";
            case TUESDAY:
                return day = "Wtorek";
            case WEDNESDAY:
                return day = "Środa";
            case THURSDAY:
                return day = "Czwartek";
            case FRIDAY:
                return day = "Piątek";
            case SATURDAY:
                return day = "Sobota";
            case SUNDAY:
                return day = "Niedziela";
            default:
                day = "Błędny numer";
        }
        return day;
    }

}
