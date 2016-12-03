/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.colegiounion.edu.test;

import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
conexion();
    
    }
    public static void conexion() {
        if (Conexion.getConexion()!= null) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }
}
