/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MSQL;

import java.sql.*;






/**
 *
 * @author Kisuke Urahara
 */
public class ConexionBD {
    public static String url = "jdbc:mysql://localhost/usuarios";
    public static String usuario = "root";
    public static String contraseña = "+Deadthekid01";
    public static String clase = "com.mysql.cj.jdbc.Driver";
    
    public static Connection conectar(){
        Connection conexion = null;
        
        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("conexion exitosa");
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return conexion;
    }
}
