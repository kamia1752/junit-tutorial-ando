package junit.tutorial.account;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class AuthenticationTest {

    @Test
    public void test() {
        Authentication sut = new Authentication();
        Account account = new Account();
        account = null;
        assertThat(sut.authenticate("", ""), is(account));
    }

}
