package tutorial.datetime;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

class DateTimeApp {
    public static void main(String[] args) {
        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
    }
}
