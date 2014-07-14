package junit.tutorial.employee;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EmployeeTest {

    @Test
    public void test() {
        Employee actualEmployee = new Employee();
        List<Employee> expectedList = new ArrayList<>();
        //assertThat(actualEmployee.load("test.txt"), is(expectedList));
    }

}
