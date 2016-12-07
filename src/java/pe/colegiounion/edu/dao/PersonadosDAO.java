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
import javax.swing.JOptionPane;
import pe.colegiounion.edu.interfaces.Operaciones;
import pe.colegiounion.edu.model.PersonadosDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class PersonadosDAO implements Operaciones<PersonadosDTO>{
    Connection cx;
    PreparedStatement ps;
    ResultSet rs;
    private final static String SQL_CREATE="INSERT INTO PERSONA (IDPERSONA, IDROLES, NOMBRE, APELLIDO, DNI, SEXO, CELULAR, EDAD, CORREO, DIRECCION, USU, PASS, CODIGO, ESTADO) VALUES ('12', '6', 'dvsv', 'sad', '12345678', 'M', '987654321', '14', 'abc@hotmail.com', 'ahi', 'po', '123', '123456', '1')";
    private final static String SQL_LISTAR= "SELECT IDPERSONA, NOMBRE,APELLIDO ,DNI,SEXO,CELULAR ,EDAD, CORREO, DIRECCION , USU,PASS,CODIGO,IDALUMNO FROM PERSONA , ALUMNO WHERE IDROLES =1";
    @Override
    public int create(PersonadosDTO p) {
        int op=0;
        try {
            cx= Conexion.getConexion();
            ps = cx. prepareStatement(SQL_CREATE);
            ps.setInt(1, p.getIdRoles());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setString(4,p.getDni());
            ps.setString(5, p.getSexo());
            ps.setString(6, p.getCelular());
            ps.setString(7, p.getEdad());
            ps.setString(8, p.getCorreo());
            ps.setString(9, p.getDireccion());
            ps.setString(10, p.getUser());
            ps.setString(11, p.getPass());
            ps.setString(12, p.getCodigo());
            ps.setInt(13, p.getIdAlumno());
            op = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " +e);
        }
        return op;
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(PersonadosDTO p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonadosDTO buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonadosDTO> listar() {
        List<PersonadosDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while(rs.next()){
                PersonadosDTO pst = new PersonadosDTO();
                pst.setIdPersona(rs.getInt("IDPERSONA"));
                pst.setNombre(rs.getString("NOMBRE"));
                pst.setApellido(rs.getString("APELLIDO"));
                pst.setDni(rs.getString("DNI"));
                pst.setSexo(rs.getString("SEXO"));
                pst.setCelular(rs.getString("CELULAR"));
                pst.setEdad(rs.getString("EDAD"));
                pst.setCorreo(rs.getString("CORREO"));
                pst.setDireccion(rs.getString("DIRECCION"));
                pst.setUser(rs.getString("USU"));
                pst.setPass(rs.getString("PASS"));
                pst.setCodigo(rs.getString("CODIGO"));
                pst.setIdAlumno(rs.getInt("IDALUMNO"));
                lista.add(pst);
            }
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }
        return lista;
        }
    
}
