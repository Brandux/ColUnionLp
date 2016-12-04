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
import pe.colegiounion.edu.model.AlumnoDTO;
import pe.colegiounion.edu.model.PersonaDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class AlumnoDAO implements Operaciones<AlumnoDTO>{
    private PersonaDTO p = new PersonaDTO();

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private static CallableStatement call;
    
    private final String SQL_LISTAR = "SELECT IDPERSONA,NOMBRE,APELLIDO ,DNI,SEXO,CELULAR ,EDAD, CORREO, DIRECCION , USU,PASS,CODIGO FROM PERSONA WHERE IDROLES =1";
    private final String SQL_GUARDAR = "{call Proc_Insert_Alumno(1,?,?,?,?,?,?,?,?,?,?,?)}";
    private final String SQL_UPDATE = "";
    private final String SQL_BUSCAR = "SELECT * FROM ALUMNO WHERE IDALUMNO=?";
    private final String SQL_ELIMINAR = "DELETE FROM ALUMNO WHERE IDALUMNO = ?";

    
    @Override
    public int create(AlumnoDTO a ) {
        int op =0;
        try {
            cx = Conexion.getConexion();
            call = cx.prepareCall(SQL_GUARDAR);
            call.setString(1, p.getNombre());
            call.setString(2, p.getApellido());
            call.setString(3, p.getDni());
            call.setString(4, p.getSexo());
            call.setString(5, p.getCelular());
            call.setString(6, p.getEdad());
            call.setString(7, p.getCorreo());
            call.setString(8, p.getDireccion());
            call.setString(9, p.getUser());
            call.setString(10, p.getPass());
            call.setString(11, p.getCodigo());
            op= call.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
        return op;
    }

    @Override
    public int delete(int id) {
        int op=0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, id);
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }
        return op;
    }

    @Override
    public int update(AlumnoDTO p) {
        int  op =0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getEstado());
            ps.setInt(2, p.getIdAlumno());
            op= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
        return op ;
    }

    @Override
    public AlumnoDTO buscar(int id) {
        AlumnoDTO al  = new AlumnoDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {                
                al.setEstado(rs.getString("ESTADO"));
                al.setIdAlumno(rs.getInt("IDALUMNO"));
            }
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
        return al;
    }

    @Override
    public List<AlumnoDTO> listar() {
        return null;
    }
    public List<PersonaDTO> listarAl() {
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
