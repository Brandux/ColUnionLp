/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.colegiounion.edu.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.colegiounion.edu.interfaces.Operaciones;
import pe.colegiounion.edu.model.PersonaDTO;
import pe.colegiounion.edu.model.ProfesorDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class ProfesorDAO implements Operaciones<ProfesorDTO>{
   private PersonaDTO pe = new PersonaDTO();
   private static CallableStatement call;
    private ProfesorDTO pf = new ProfesorDTO();
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT IDPERSONA, NOMBRE, APELLIDO,DNI,SEXO,CELULAR ,EDAD,CORREO,DIRECCION,USU,PASS,CODIGO  FROM PERSONA  WHERE IDROLES =2";
    private final String SQL_GUARDAR = "{call Proc_Insert_Profe(?,2,?,?,?,?,?,?,?,?,?,?,?,?)}";
    private final String SQL_UPDATE = "UPDATE PROFESOR SET codigo = ?, especialidad = ?, idPersona = ? WHERE idProfesor = ?";
    private final String SQL_BUSCAR = "SELECT *FROM PROFESOR WHERE IDPROFESOR=?";
    private final String SQL_ELIMINAR = "DELETE FROM PROFESOR WHERE IDPROFESOR = ?";
    
    @Override
    public int create(ProfesorDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            call = cx.prepareCall(SQL_GUARDAR);
            call.setString(1, pe.getNombre());
            call.setString(2, pe.getApellido());
            call.setString(3, pe.getDni());
            call.setString(4, pe.getSexo());
            call.setString(5, pe.getCelular());
            call.setString(6, pe.getCorreo());
            call.setString(7, pe.getDireccion());
            call.setString(8, pe.getUser());
            call.setString(9, pe.getPass());
            call.setString(10, pe.getCodigo());
            call.setString(11, p.getEspecialidad());
            op = call.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    
    }

    @Override
    public int delete(int id) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, id);
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    
    }

    @Override
    public int update(ProfesorDTO p) {
       
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getEstado());
            ps.setString(2, p.getEspecialidad());
             ps.setInt(4, p.getIdProfesor());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    }

    @Override
    public ProfesorDTO buscar(int id) {
        ProfesorDTO pf = new ProfesorDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                pf.setEstado(rs.getString("estado"));
                pf.setEspecialidad(rs.getString("especialidad"));
                pf.setIdProfesor(rs.getInt("idProfesor"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return pf; 
    
    }

    @Override
    public List<ProfesorDTO> listar() {
       return null;
    }
    
    public List<PersonaDTO> listarPf() {
        List<PersonaDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                PersonaDTO p = new PersonaDTO();
                p.setIdPersona(rs.getInt("IDPERSONA"));
                p.setNombre(rs.getString("NOMBRE"));
                p.setApellido(rs.getString("APELLIDO"));
                p.setDni(rs.getString("DNI"));
                p.setSexo(rs.getString("SEXO"));
                p.setCelular(rs.getString("CELULAR"));
                p.setEdad(rs.getString("EDAD"));
                p.setCorreo(rs.getString("CORREO"));
                p.setDireccion(rs.getString("DIRECCION"));
                p.setUser(rs.getString("USU"));
                p.setPass(rs.getString("PASS"));
                p.setCodigo(rs.getString("CODIGO"));

                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return lista;
    }
    
}
