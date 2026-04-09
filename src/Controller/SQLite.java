package Controller;

import Model.History;
import Model.Logs;
import Model.Product;
import Model.User;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SQLite {
    
    public Model.User currentUser = null;
    public int DEBUG_MODE = 0;
    String driverURL = "jdbc:sqlite:" + "database.db";

    private void reportDatabaseError(Exception ex) {
        if (DEBUG_MODE == 1) {
            System.err.println("A database operation failed: " + ex.getClass().getSimpleName());
        } else {
            System.err.println("A database operation failed.");
        }
    }
    
    public void createNewDatabase() {
        try (Connection conn = DriverManager.getConnection(driverURL)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Database database.db created.");
            }
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void createHistoryTable() {
        String sql = "CREATE TABLE IF NOT EXISTS history (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " username TEXT NOT NULL,\n"
            + " name TEXT NOT NULL,\n"
            + " stock INTEGER DEFAULT 0,\n"
            + " timestamp TEXT NOT NULL\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table history in database.db created.");
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void createLogsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS logs (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " event TEXT NOT NULL,\n"
            + " username TEXT NOT NULL,\n"
            + " desc TEXT NOT NULL,\n"
            + " timestamp TEXT NOT NULL\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table logs in database.db created.");
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
     
    public void createProductTable() {
        String sql = "CREATE TABLE IF NOT EXISTS product (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " name TEXT NOT NULL UNIQUE,\n"
            + " stock INTEGER DEFAULT 0,\n"
            + " price REAL DEFAULT 0.00\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table product in database.db created.");
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
     
    public void createUserTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " username TEXT NOT NULL UNIQUE,\n"
            + " password TEXT NOT NULL,\n"
            + " role INTEGER DEFAULT 2,\n"
            + " locked INTEGER DEFAULT 0\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table users in database.db created.");
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void dropHistoryTable() {
        String sql = "DROP TABLE IF EXISTS history;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table history in database.db dropped.");
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void dropLogsTable() {
        String sql = "DROP TABLE IF EXISTS logs;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table logs in database.db dropped.");
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void dropProductTable() {
        String sql = "DROP TABLE IF EXISTS product;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table product in database.db dropped.");
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void dropUserTable() {
        String sql = "DROP TABLE IF EXISTS users;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table users in database.db dropped.");
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void clearLogs() {
        String sql = "DELETE FROM logs;";
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void addHistory(String username, String name, int stock, String timestamp) {
        String sql = "INSERT INTO history(username,name,stock,timestamp) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, username);
            pstmt.setString(2, name);
            pstmt.setInt(3, stock);
            pstmt.setString(4, timestamp);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void addLogs(String event, String username, String desc, String timestamp) {
        String sql = "INSERT INTO logs(event,username,desc,timestamp) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, event);
            pstmt.setString(2, username);
            pstmt.setString(3, desc);
            pstmt.setString(4, timestamp);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void addProduct(String name, int stock, double price) {
        String sql = "INSERT INTO product(name,stock,price) VALUES(?,?,?)";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, name);
            pstmt.setInt(2, stock);
            pstmt.setDouble(3, price);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void updateProduct(String targetName, String newName, int stock, double price) {
        String sql = "UPDATE product SET name=?, stock=?, price=? WHERE name=?";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, newName);
            pstmt.setInt(2, stock);
            pstmt.setDouble(3, price);
            pstmt.setString(4, targetName);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void deleteProduct(String name) {
        String sql = "DELETE FROM product WHERE name=?";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public boolean addUser(String username, String password) {
        String sql = "INSERT INTO users(username,password) VALUES(?,?)";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            String hashed = PasswordUtil.hashPassword(password);
            pstmt.setString(1, username);
            pstmt.setString(2, hashed);
            pstmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            reportDatabaseError(ex);
            return false;
        }
    }
    
    
    public ArrayList<History> getHistory(){
        String sql = "SELECT id, username, name, stock, timestamp FROM history";
        ArrayList<History> histories = new ArrayList<History>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                histories.add(new History(rs.getInt("id"),
                                   rs.getString("username"),
                                   rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getString("timestamp")));
            }
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
        return histories;
    }
    
    public ArrayList<History> getUserHistory(String username){
        String sql = "SELECT id, username, name, stock, timestamp FROM history WHERE username=?";
        ArrayList<History> histories = new ArrayList<History>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    histories.add(new History(rs.getInt("id"),
                                       rs.getString("username"),
                                       rs.getString("name"),
                                       rs.getInt("stock"),
                                       rs.getString("timestamp")));
                }
            }
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
        return histories;
    }
    
    public ArrayList<Logs> getLogs(){
        String sql = "SELECT id, event, username, desc, timestamp FROM logs";
        ArrayList<Logs> logs = new ArrayList<Logs>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                logs.add(new Logs(rs.getInt("id"),
                                   rs.getString("event"),
                                   rs.getString("username"),
                                   rs.getString("desc"),
                                   rs.getString("timestamp")));
            }
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
        return logs;
    }
    
    public ArrayList<Product> getProduct(){
        String sql = "SELECT id, name, stock, price FROM product";
        ArrayList<Product> products = new ArrayList<Product>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                products.add(new Product(rs.getInt("id"),
                                   rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getFloat("price")));
            }
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
        return products;
    }
    
    public ArrayList<User> getUsers(){
        String sql = "SELECT id, username, password, role, locked FROM users";
        ArrayList<User> users = new ArrayList<User>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                users.add(new User(rs.getInt("id"),
                                   rs.getString("username"),
                                   rs.getString("password"),
                                   rs.getInt("role"),
                                   rs.getInt("locked")));
            }
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
        return users;
    }
    
    public boolean addUser(String username, String password, int role) {
        String sql = "INSERT INTO users(username,password,role) VALUES(?,?,?)";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            String hashed = PasswordUtil.hashPassword(password);
            pstmt.setString(1, username);
            pstmt.setString(2, hashed);
            pstmt.setInt(3, role);
            pstmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            reportDatabaseError(ex);
            return false;
        }
    }
    
    public void removeUser(String username) {
        String sql = "DELETE FROM users WHERE username=?";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public Product getProduct(String name){
        String sql = "SELECT name, stock, price FROM product WHERE name=?";
        Product product = null;
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, name);
            try (ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()) {
                    product = new Product(rs.getString("name"),
                                           rs.getInt("stock"),
                                           rs.getFloat("price"));
                }
            }
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
        return product;
    }
    
    public User getUser(String username) {
        String sql = "SELECT id, username, password, role, locked FROM users WHERE username=?;";
        User user = null;
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()) {
                    user = new User(rs.getInt("id"),
                                    rs.getString("username"),
                                    rs.getString("password"),
                                    rs.getInt("role"),
                                    rs.getInt("locked"));
                }
            }
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
        return user;
    }
    
    public void updateUserLock(String username, int locked) {
        String sql = "UPDATE users SET locked = ? WHERE username=?;";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, locked);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void updateUserRole(String username, int role) {
        String sql = "UPDATE users SET role = ? WHERE username=?;";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, role);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public void updateUserPassword(String username, String newPassword) {
        String hashed = PasswordUtil.hashPassword(newPassword);
        String sql = "UPDATE users SET password = ? WHERE username=?;";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, hashed);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
    }
    
    public String getLastLogin(String username) {
        // 2.3.4: Use PreparedStatement to prevent SQL Injection.
        String sql = "SELECT timestamp FROM logs WHERE username=? AND event='LOGIN' ORDER BY id DESC LIMIT 1;";
        String lastLogin = "First time login";
        try (Connection conn = DriverManager.getConnection(driverURL);
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    lastLogin = rs.getString("timestamp");
                }
            }
        } catch (Exception ex) {
            reportDatabaseError(ex);
        }
        return lastLogin;
    }
}