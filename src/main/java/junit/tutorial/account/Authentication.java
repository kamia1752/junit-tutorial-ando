package junit.tutorial.account;

public class Authentication{

    AccountDao dao = null;
    
    public Account authenticate(String name, String password) {
    	assert dao != null;
    	Account account = dao.findOrNull(name);
    	if(account == null) return null;
    	//if(account.getPassword() != password) return null;
        //return account;
    	return account.getPassword().equals(password) ? account : null;
    }

}
