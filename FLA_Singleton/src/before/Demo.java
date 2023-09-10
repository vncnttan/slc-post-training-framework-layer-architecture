package before;

public class Demo {
	public static void main(String[] args) {
		DatabaseManager db = new DatabaseManager();
		DatabaseManager db1 = new DatabaseManager();
		
		System.out.println(System.identityHashCode(db));
		System.out.println(System.identityHashCode(db1));
		
		db.setConf(true);
		
		System.out.println(db.isConf());
		System.out.println(db1.isConf());
	}
}
