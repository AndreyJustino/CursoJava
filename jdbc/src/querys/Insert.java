package querys;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Insert {
    public static void insertQuery(Connection conn){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            ps = conn.prepareStatement(
                    "INSERT INTO seller (nome, email, birthDate, baseSalary, departmentId) VALUES " +
                            "(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS //passar o id gerado para o ps
            );

            ps.setString(1, "Andrey");
            ps.setString(2, "andrey@mail.com");
            ps.setDate(3, new java.sql.Date(sdf.parse("07/05/2005").getTime()));
            ps.setDouble(4, 3000.0);
            ps.setInt(5, 1);

            int rowsAffects = ps.executeUpdate(); //alterar dados

            System.out.println("Done! Rows affects: " + rowsAffects);

            rs = ps.getGeneratedKeys(); //pegando o id gerado

            while (rs.next()){
                System.out.println("id: " + rs.getInt(1)); // vendo o(s) id(s) gerados
            }

            Select.selectQuery(conn, "SELECT * FROM seller");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }finally {
            DB.closePrepareStatement(ps);
            DB.closeResultSet(rs);
        }
    }
}
