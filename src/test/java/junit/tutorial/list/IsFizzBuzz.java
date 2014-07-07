package junit.tutorial.list;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class IsFizzBuzz extends BaseMatcher<List> {

    private List<String> strList = new ArrayList<String>();

    int i;

    int expectedLength;

    int actualLength;

    boolean lengthFlag = false;

    String expected;

    String actual;

    public IsFizzBuzz(List<String> strList) {
        // TODO Auto-generated constructor stub
        this.strList = strList;
    }

    @Override
    public boolean matches(Object item) {
        // TODO Auto-generated method stub
        if (!(item instanceof List<?>))
            return false;
        @SuppressWarnings("unused")
        List<String> list = (List<String>) item;
        if (strList.size() != list.size()) {
            lengthFlag = true;
            expectedLength = strList.size();
            actualLength = list.size();
            return false;
        }
        for (i = 0; i < strList.size(); i++) {
            expected = strList.get(i);
            actual = list.get(i);
            if (!expected.equals(actual))
                return false;
        }

        return true;
    }

    @Override
    public void describeTo(Description desc) {
        // TODO Auto-generated method stub
        if (lengthFlag == false) {
            desc.appendValue(i + 1);
            desc.appendText("個目:");
            desc.appendValue(expected);
        } else {
            desc.appendText("期待値のサイズ");
            desc.appendValue(expectedLength);
        }

    }

    @Override
    public void describeMismatch(Object item, Description desc) {
        // TODO Auto-generated method stub
        if (lengthFlag == false) {
            desc.appendValue(actual);
        } else {
            desc.appendText("結果のサイズ");
            desc.appendValue(actualLength);
        }

    }

    public static Matcher<List> fizzbuzzOf(String... strList) {
        return new IsFizzBuzz(Arrays.asList(strList));
    }
}