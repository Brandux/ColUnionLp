/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.colegiounion.edu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.colegiounion.edu.interfaces.Operaciones;
import pe.colegiounion.edu.model.PersonaDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class PersonaDAO implements Operaciones<PersonaDTO>{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    
    private  final String SQL_Validar="SELECT * FROM PERSONA WHERE USER=? AND PASS=?";
    private final String SQL_LISTAR = "SELECT * FROM PERSONA";
    private final String SQL_GUARDAR = "INSERT INTO PERSONA (IDPERSONA,IDROLES, NOMBRE, APELLIDO, DNI,SEXO, CELULAR, EDAD, CORREO, DIRECCION, USU, PASS, CODIGO, ESTADO) VALUES (NULL, ?,?,?,?, ?, ?, ?, ?, ?,?, ?, ?, ?)";
    private final String SQL_UPDATE = "UPDATE PERSONA SET IDROLES =?, NOMBRE = ?, APELLIDO = ?, DNI = ?, SEXO = ?, CELULAR = ?, EDAD = ?, CORREO = ?, DIRECCION = ?, USU =?,  PASS = ? WHERE IDPERSONA = ?";
    private final String SQL_BUSCAR = "SELECT *FROM PERSONA WHERE IDPERSONA=?";
    private final String SQL_ELIMINAR ="DELETE FROM PERSONA WHERE IDPERSONA = ?";

    
    public int validar(String user, String pass) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_Validar);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                op = 1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    }
    
    @Override
    public int create(PersonaDTO p) {
        
        int op=0;
        
        try {
            cx= Conexion.getConexion();
            ps = cx. prepareStatement(SQL_GUARDAR);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setString(3,p.getDni());
            ps.setString(4, p.getSexo());
            ps.setString(5, p.getCelular());
            ps.setString(6, p.getEdad());
            ps.setString(7, p.getCorreo());
            ps.setString(8, p.getDireccion());
            ps.setString(9, p.getUser());
            ps.setString(10, p.getPass());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }
        return op;
    }

    @Override
    public int delete(int id) {
        int op =0;
        
        try {
            cx = Conexion.getConexion();
            ps= cx.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, id);
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return op;
    }

    @Override
    public int update(PersonaDTO p) {

        int op=0;
    
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setString(3, p.getDni());
            ps.setString(4, p.getSexo());
            ps.setString(5, p.getCelular());
            ps.setString(6, p.getEdad());
            ps.setString(7, p.getCorreo());
            ps.setString(8, p.getDireccion());
            ps.setString(9, p.getUser());
            ps.setInt(10, p.getIdPersona());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }
        return op;
    }

    @Override
    public PersonaDTO buscar(int id) {

       PersonaDTO p = new PersonaDTO();
        
        try {
            cx=Conexion.getConexion();
            ps = cx.prepareCall(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setDni(rs.getString("dni"));
                p.setSexo(rs.getString("sexo"));
                p.setCelular(rs.getString("celular"));
                p.setEdad(rs.getString("edad"));
                p.setCorreo(rs.getString("correo"));
                p.setDireccion(rs.getString("direccion"));
                p.setUser(rs.getString("user"));
                p.setPass(rs.getString("pass"));
                p.setIdPersona(rs.getInt("idPersona"));
            }
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
        return p;
    }

    @Override
    public List<PersonaDTO> listar() {
        List <PersonaDTO> lista = new ArrayList<>();
        try {
            cx= Conexion.getConexion();
            ps= cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            
            while(rs.next()){
                PersonaDTO p= new PersonaDTO();
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setDni(rs.getString("dni"));
                p.setSexo(rs.getString("sexo"));
                p.setCelular(rs.getString("celular"));
                p.setEdad(rs.getString("edad"));
                p.setCorreo(rs.getString("correo"));
                p.setDireccion(rs.getString("direccion"));
                p.setUser(rs.getString("user"));
                p.setPass(rs.getString("pass"));
                p.setIdPersona(rs.getInt("idPersona"));
                lista.add(p);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }
        return lista;
    }
    
    
}