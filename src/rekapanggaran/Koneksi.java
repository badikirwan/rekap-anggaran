/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekapanggaran;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BadikIrwan
 */
public class Koneksi {
    
    private static Connection con;
    
    public Koneksi() {
        
    }
    
    public static Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_manpro","root","");  
            return con;
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Tidak bisa terhubung ke Database,turn on XAMPP");
            return null;
        }
    }
    
    public static Connection connect1(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:./db/dbku.db");
            JOptionPane.showMessageDialog(null,"Connection Success!");
            return conn;
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Connection failed ! " + e);
            return null;
        }
    }
}
