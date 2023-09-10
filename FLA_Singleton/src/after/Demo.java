package after;

public class Demo {
	public static void main(String[] args) {
//		DatabaseManager db = DatabaseManager.getInstance();
//		DatabaseManager db1 = DatabaseManager.getInstance();
//
//		System.out.println(System.identityHashCode(db));
//		System.out.println(System.identityHashCode(db1));
//
//		db.setConf(true);
//
//		System.out.println(db.isConf());
//		System.out.println(db1.isConf());

		// If we used multithreading, the singleton become inconsistent if we didn't:
		// 1. Synchronized the getInstance functions
		DBAccessMultiThread dbAcc = new DBAccessMultiThread();
		DBAccessMultiThread dbAcc1 = new DBAccessMultiThread();

		new Thread(dbAcc).start();
		new Thread(dbAcc1).start();
	}
}
