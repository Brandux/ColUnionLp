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
import pe.colegiounion.edu.model.MatriculaDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class MatriculaDAO implements Operaciones<MatriculaDTO>{
    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM MATRICULA";
    private final String SQL_GUARDAR = "INSERT INTO MATRICULA (IDMATRICULA, IDGRADO, IDESTADO,IDALUMNO,FECHA) VALUES (0, ?, ?,?, ? )";
    private final String SQL_UPDATE = "UPDATE MATRICULA SET IDMATRICULA =?, IDGRADO = ?, IDESTADO = ? IDALUMNO=? , FECHA=?  WHERE idMatricula =?";
    private final String SQL_BUSCAR = "SELECT *FROM MATRICULA WHERE IDMATRICULA=?";
    private final String SQL_ELIMINAR = "DELETE FROM MATRICULA WHERE IDMATRICULA = ?";


    @Override
    public int create(MatriculaDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setInt(1, p.getIdGrado());
            ps.setInt(2, p.getIdEstado());
            ps.setInt(3, p.getIdAlumno());
            ps.setString(4, p.getFecha());
            op = ps.executeUpdate();
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
    public int update(MatriculaDTO p) {
    
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setInt(1, p.getIdGrado());
            ps.setInt(2, p.getIdEstado());
            ps.setInt(3, p.getIdAlumno());
            ps.setString(4, p.getFecha());
            ps.setInt(5, p.getIdMatricula());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    
    }

    @Override
    public MatriculaDTO buscar(int id) {
        
        MatriculaDTO m = new MatriculaDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                m.setIdGrado(rs.getInt("IDGRADO"));
                m.setIdEstado(rs.getInt("IDESTADO"));
                m.setIdAlumno(rs.getInt("IDALUMNO"));
                m.setFecha(rs.getString("FECHA"));
                m.setIdMatricula(rs.getInt("IDMATRICULA"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return m;
    }

    @Override
    public List<MatriculaDTO> listar() {
        List<MatriculaDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                MatriculaDTO m = new MatriculaDTO();
                m.setIdGrado(rs.getInt("IDGRADO"));
                m.setIdEstado(rs.getInt("IDESTADO"));
                m.setIdAlumno(rs.getInt("IDALUMNO"));
                m.setFecha(rs.getString("FECHA"));
                m.setIdMatricula(rs.getInt("IDMATRICULA"));
                lista.add(m);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
}
