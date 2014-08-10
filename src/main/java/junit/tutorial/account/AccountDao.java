package junit.tutorial.account;

public interface AccountDao {
    Account findOrNull(String userId);
}
