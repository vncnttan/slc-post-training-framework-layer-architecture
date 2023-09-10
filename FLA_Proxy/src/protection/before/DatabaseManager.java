package protection.before;

public class DatabaseManager implements IExecuteable{

	@Override
	public void executeQuery(String query) {
		// TODO Auto-generated method stub
		System.out.println("Executing query: " + query);
	}

}
