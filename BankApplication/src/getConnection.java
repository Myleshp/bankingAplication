import java.sql.Connection;
import java.sql.DriverManager;

public class getConnection {
    public static Connection getconnection() {
        Connection c;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bank", "root", "Mylesh#9808");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return c;
    }
}
