package junit.tutorial.calendar;

import java.util.Calendar;

public class MonthlyCalendar {

    public Integer getRemainingDays() {
        // TODO Auto-generated method stub
        Calendar cal = newCal();
        return cal.getActualMaximum(Calendar.DATE) - cal.get(Calendar.DATE);
    }

    Calendar newCal() {
        return Calendar.getInstance();
    }
}
