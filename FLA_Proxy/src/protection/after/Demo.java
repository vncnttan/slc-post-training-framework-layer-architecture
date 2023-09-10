package protection.after;

public class Demo {
	public static void main(String[] args) throws Exception {
		User user = new User("Michael", "User");
		
		DatabaseManagerProxy dm = new DatabaseManagerProxy(user);
		
		dm.executeQuery("SELECT * FROM SMTH");
		dm.executeQuery("DELETE * FROM SMTH");
		dm.executeQuery("UPDATE SMTH SET A = B");
	}
}
