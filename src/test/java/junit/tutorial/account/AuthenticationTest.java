package junit.tutorial.account;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class AuthenticationTest {

	public static class アカウントが無い場合 {
		Authentication sut;

		@Before
		public void setUp() throws Exception {
			sut = new Authentication();
			sut.dao = mock(AccountDao.class);
			when(sut.dao.findOrNull("user1")).thenReturn(null);
		}

		@Test
		public void nullを返す() throws Exception {
			assertThat(sut.authenticate("user1", "aaa"), is(nullValue()));
		}
	}

	public static class アカウントがありパスワードが一致する場合 {
		Authentication sut;
		Account account;

		@Before
		public void setUp() throws Exception {
			sut = new Authentication();
			account = new Account("user2", "bbb");
			sut.dao = mock(AccountDao.class);
			when(sut.dao.findOrNull("user2")).thenReturn(account);
		}

		@Test
		public void アカウント情報を返す() throws Exception {
			assertThat(sut.authenticate("user2", "bbb"), is(account));
		}
	}

	public static class アカウントがあるがパスワードが一致しない場合 {
		Authentication sut;
		Account account;

		@Before
		public void setUp() throws Exception {
			sut = new Authentication();
			account = new Account("user3", "ddd");
			sut.dao = mock(AccountDao.class);
			when(sut.dao.findOrNull("user3")).thenReturn(account);
		}

		@Test
		public void nullを返す() throws Exception {
			assertThat(sut.authenticate("user3", "ccc"), is(nullValue()));
		}
	}
}
