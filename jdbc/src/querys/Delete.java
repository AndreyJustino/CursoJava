package querys;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void deleteQuery(Connection conn){
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(
                    "DELETE FROM department WHERE id = ?",
                    Statement.RETURN_GENERATED_KEYS
            );

            ps.setInt(1, 5);

            int rowsAffects = ps.executeUpdate();
            System.out.println("Updated! Rows affects: " + rowsAffects);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }finally {
            DB.closePrepareStatement(ps);
        }
    }
}
