package after;

public class DatabaseManager {

    private boolean conf = false;
    private static DatabaseManager dbInstance = null;

    public boolean isConf() {
        return conf;
    }

    public static synchronized DatabaseManager getInstance() {
        synchronized (DatabaseManager.class) {
            if (dbInstance == null) {
                dbInstance = new after.DatabaseManager();
            }
        }
        return dbInstance;
    }

    private DatabaseManager() {

    }

    public void setConf(boolean conf) {
        this.conf = conf;
    }

}
