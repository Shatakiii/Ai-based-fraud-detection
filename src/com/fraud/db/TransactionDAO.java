package fraud.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionDAO {

    public boolean saveTransaction(int userId, double amount, boolean isFraud) {
        String query = "INSERT INTO transactions(user_id, amount, is_fraud) VALUES(?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, userId);
            ps.setDouble(2, amount);
            ps.setBoolean(3, isFraud);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ResultSet getUserTransactions(int userId) {
        String query = "SELECT * FROM transactions WHERE user_id=?";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, userId);
            return ps.executeQuery();  // Caller will read the ResultSet

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
