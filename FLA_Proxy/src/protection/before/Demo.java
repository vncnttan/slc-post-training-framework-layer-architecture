package protection.before;

public class Demo {
	public static void main(String[] args) {
		User user = new User("Michael", "Admin");
		
		DatabaseManager dm = new DatabaseManager();
		
		dm.executeQuery("SELECT * FROM SMTH");
		dm.executeQuery("DELETE * FROM SMTH");
		dm.executeQuery("UPDATE SMTH SET A = B");
	}
}
