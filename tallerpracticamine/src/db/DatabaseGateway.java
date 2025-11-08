package db;

public interface DatabaseGateway {
    void update(String sql);
    String query(String sql);
}
