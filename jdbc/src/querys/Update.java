package querys;

import db.DB;
import db.DbException;

import java.sql.*;

public class Update {
    public static void updateQuery(Connection conn){
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(
                    "UPDATE seller SET baseSalary = baseSalary + ? WHERE departmentId = ?",
                    Statement.RETURN_GENERATED_KEYS
            );

            ps.setDouble(1, 200.0);
            ps.setInt(2, 1);

            int rowsAffects = ps.executeUpdate();
            System.out.println("Updated! Rows affects: " + rowsAffects);

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }finally {
            DB.closePrepareStatement(ps);
        }
    }
}
