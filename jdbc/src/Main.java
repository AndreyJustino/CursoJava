import db.DB;
import querys.Delete;
import querys.Update;
import querys.Insert;
import querys.Select;

import java.sql.*;

public class Main {
    public static void executeSelect(){
        Connection conn = DB.getConnection();

        Select.selectQuery(conn, "SELECT * FROM department;");

        DB.closeConnection();
    }

    public static void executeInsert(){
        Connection conn = DB.getConnection();

        Insert.insertQuery(conn);

        DB.closeConnection();
    }

    public static void executeUpdate(){
        Connection conn = DB.getConnection();

        Update.updateQuery(conn);

        DB.closeConnection();
    }

    public static void executeDelete(){
        Connection conn = DB.getConnection();

        Delete.deleteQuery(conn);

        DB.closeConnection();
    }

    public static void main(String[] args) {
        executeDelete();

    }
}