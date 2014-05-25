// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.database;

import static org.junit.Assert.*;

import org.dbunit.DatabaseUnitException;
import org.dbunit.DatabaseUnitRuntimeException;
import org.dbunit.dataset.ITable;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

public class ITableMatcher extends TypeSafeMatcher<ITable>{

    private final ITable expected;
    String assertionMsg = null;
    
    public ITableMatcher(ITable expected) {
        // TODO Auto-generated constructor stub
        this.expected = expected;
    }

    public static Matcher<ITable> tableOf(ITable expected) {
        return new ITableMatcher(expected);
    }


    @Override
    public void describeTo(Description desc) {
        // TODO Auto-generated method stub
        desc.appendValue(expected);
        if (assertionMsg == null) return;
        desc.appendText("\n >>>").appendText(assertionMsg);
    }

    @Override
    protected boolean matchesSafely(ITable actual) {
        // TODO Auto-generated method stub
        try{
            org.dbunit.Assertion.assertEquals(expected, actual);
        } catch (DatabaseUnitException e) {
            throw new DatabaseUnitRuntimeException(e);
        } catch (AssertionError e) {
            assertionMsg = e.getMessage();
            return false;
        }
        return true;
    }

}
