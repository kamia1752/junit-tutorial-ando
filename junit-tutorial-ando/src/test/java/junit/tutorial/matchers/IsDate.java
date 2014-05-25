// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.matchers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class IsDate extends TypeSafeMatcher<Date> {

    private final int yyyy;

    private final int mm;

    private final int dd;
    Date actual;

    IsDate(int yyyy, int mm, int dd) {
        this.yyyy = yyyy;
        this.mm = mm;
        this.dd = dd;
    }

    @Override
    public void describeTo(Description desc) {
        // TODO Auto-generated method stub
        desc.appendValue(String.format("%d/%02d/%02d", yyyy, mm, dd));
    }
    
    @Override
    protected void describeMismatchSafely(Date actual, Description desc) {
        // TODO Auto-generated method stub
        if (actual != null) {
            desc.appendValue(new SimpleDateFormat("yyyy/MM/dd").format(actual));
        }        
    }
    
    @Override
    protected boolean matchesSafely(Date actual) {
        // TODO Auto-generated method stub
        this.actual = actual;
        Calendar cal = Calendar.getInstance();
        cal.setTime(actual);
        if (yyyy != cal.get(Calendar.YEAR)) return false;
        if (mm != cal.get(Calendar.MONTH) + 1) return false;
        if (dd != cal.get(Calendar.DATE)) return false;
        return true;
    }

    public static Matcher<Date> dateOf(int yyyy, int mm, int dd) {
        return new IsDate(yyyy, mm, dd);
    }

}
