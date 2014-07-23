package junit.tutorial.calendar;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class MonthlyCalendarTest {

    @Test
    public void 現在時刻が2012年1月31日の場合() {
        final Calendar cal = Calendar.getInstance();
        cal.set(2012, 0, 31);
        MonthlyCalendar sut = new MonthlyCalendar() {
            @Override
            Calendar newCal() {
                return cal;
            }
        };
        assertThat(sut.getRemainingDays(), is(0));
    }

    @Test
    public void 現在時刻が2012年1月30日の場合() {
        final Calendar cal = Calendar.getInstance();
        cal.set(2012, 0, 30);
        MonthlyCalendar sut = new MonthlyCalendar() {
            @Override
            Calendar newCal() {
                return cal;
            }
        };
        assertThat(sut.getRemainingDays(), is(1));
    }
    
    @Test
    public void 現在時刻が2012年2月1日の場合() {
        final Calendar cal = Calendar.getInstance();
        cal.set(2012, Calendar.FEBRUARY, 1);
        MonthlyCalendar sut = new MonthlyCalendar() {
            @Override
            Calendar newCal() {
                return cal;
            }
        };
        assertThat(sut.getRemainingDays(), is(28));
    }
}
