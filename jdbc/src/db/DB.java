package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    private static Connection conn = null;

    // carregar as propriedades que tenho no .properties
    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);

            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    // conectar com banco de dados
    public static Connection getConnection() {
        if (conn == null){
            Properties props = loadProperties();

            String url = props.getProperty("dburl"); // dburl pq no .properties esta "dburl"

            try {
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

        return conn;
    }

    //fechar conexão com banco de dados
    public static void closeConnection(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

    }

    public static void closeStatement(Statement st){
        if (st != null){
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

    }

    public static void closePrepareStatement(PreparedStatement ps){
        if (ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

}
