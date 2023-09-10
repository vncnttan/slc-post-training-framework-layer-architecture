package after;

public class DBAccessMultiThread implements Runnable{

    @Override
    public void run() {
		DatabaseManager db = DatabaseManager.getInstance();
        System.out.println(System.identityHashCode(db));
    }
}
