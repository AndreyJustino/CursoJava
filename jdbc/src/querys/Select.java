package querys;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

    public static void selectQuery(Connection conn, String query){
        ResultSet rs = null; // armazena resulta do Statement (st)
        Statement st = null;
        try{

            st = conn.createStatement(); // instacia de objeto statement

            rs = st.executeQuery(query);

            while (rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("nome"));
            }

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }
}
