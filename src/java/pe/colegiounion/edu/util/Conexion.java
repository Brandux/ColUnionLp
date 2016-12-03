/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.colegiounion.edu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Brandukosky
 */
public class Conexion {
    private static final String url="jdbc:oracle:thin:@localhost:1521:orcl";
    private static  final  String driver ="oracle.jdbc.OracleDriver";
    private static  final String user ="COLEUNION";
    private static  final String pass ="COLE123";
    
    private static Connection cx = null ;
    
    
    public static Connection  getConexion (){
        try {
            Class.forName(driver);
            if(cx==null){
                cx = DriverManager.getConnection(url,user,pass);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en :" + e);
        }
        
        return cx;
    }
}
