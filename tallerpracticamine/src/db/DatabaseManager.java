package db;

public class DatabaseManager implements DatabaseGateway {
    
    private DatabaseManager() {}
    private static class Holder { private static final DatabaseManager I = new DatabaseManager(); }
    public static DatabaseManager getInstance() { return Holder.I; }

    @Override public void update(String sql) { System.out.println("[DB] UPDATE: " + sql); }
    @Override public String query(String sql) { System.out.println("[DB] QUERY: " + sql); return "result"; }
}
