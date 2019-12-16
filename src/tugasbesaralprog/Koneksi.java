package tugasbesaralprog;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class Koneksi {
    public Connection koneksi;
    public Statement stat;
    public Connection getKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/tubes_warehouse","root","");
        } catch(SQLException e) {
            System.out.println("Gagal Koneksi");
        }
        return koneksi;
    }
}
