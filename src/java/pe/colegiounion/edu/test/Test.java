/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.colegiounion.edu.test;

import java.util.ArrayList;
import java.util.List;
import pe.colegiounion.edu.dao.AlumnoDAO;
import pe.colegiounion.edu.dao.PersonaDAO;
import pe.colegiounion.edu.dao.PersonadosDAO;
import pe.colegiounion.edu.model.PersonaDTO;
import pe.colegiounion.edu.model.PersonadosDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class Test {
   static  PersonaDAO ao = new PersonaDAO();
   static AlumnoDAO al = new AlumnoDAO();
    static List<PersonaDTO> lista = new ArrayList<>();
    static List<PersonadosDTO> listas = new ArrayList<>();
    static PersonadosDAO po = new PersonadosDAO();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
conexion();
    validar();
    listar();
    crear();
    }
    public static void conexion() {
        if (Conexion.getConexion()!= null) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }
    public static void validar (){
        String user ="BRAND";
        String pass ="123";
        if (ao.validar(user, pass)>0) {
            System.out.println("si");
        }else{
            System.out.println("no");
        }
        
    }
    public static void listar() {
        listas = po.listar();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getIdPersona());
        }
    }
    
    public static void crear(){
        PersonadosDTO a = new PersonadosDTO(2, "q", "q", "q", "q", "q", "q", "q", "q", "q", "q", "q", "q", 1);
        if(po.create(a)>0){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }
}
