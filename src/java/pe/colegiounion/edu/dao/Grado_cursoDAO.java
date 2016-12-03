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
import pe.colegiounion.edu.model.Grado_CursoDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class Grado_cursoDAO implements Operaciones<Grado_CursoDTO>{
    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM GRADO_CURSO";
    private final String SQL_GUARDAR = "INSERT INTO GRADO_CURSO (IDGRADOCURSO,IDPROFESOR, IDHORARIO, IDGRADO, IDCURSO, ESTADO) VALUES (NULL, ?, ?, ?, ?,?)";
    private final String SQL_UPDATE = "UPDATE GRADO_CURSO SET IDPROFESOR = ?, IDHORARIO = ?, IDGRADO = ?, IDCURSO = ? ESTADO =? WHERE idGrado_curso = ?";
    private final String SQL_BUSCAR = "SELECT *FROM GRADO_CURSO WHERE IDGRADOCURSO=?";
    private final String SQL_ELIMINAR = "DELETE FROM GRADO_CURSO WHERE IDGRADOCURSO = ?";

    @Override
    public int create(Grado_CursoDTO p) {

        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setInt(1, p.getIdProfesor());
            ps.setInt(2, p.getIdHorario());
            ps.setInt(3, p.getIdGrado());
            ps.setInt(4, p.getIdCurso());
            ps.setString(5, p.getEstado());
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
    public int update(Grado_CursoDTO p) {
        
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setInt(1, p.getIdProfesor());
            ps.setInt(2, p.getIdHorario());
            ps.setInt(3, p.getIdGrado());
            ps.setInt(4, p.getIdCurso());
            ps.setString(5, p.getEstado());
            ps.setInt(6, p.getIdGradocurso());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    
    }

    @Override
    public Grado_CursoDTO buscar(int id) {
        Grado_CursoDTO gc = new Grado_CursoDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                gc.setIdProfesor(rs.getInt("IDPROFESOR"));
                gc.setIdHorario(rs.getInt("IDHORARIO"));
                gc.setIdGrado(rs.getInt("IDGRADO"));
                gc.setIdCurso(rs.getInt("IDCURSO"));
                gc.setEstado(rs.getString("ESTADO"));
                gc.setIdGradocurso(rs.getInt("IDGRADOCURSO"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return gc;}

    @Override
    public List<Grado_CursoDTO> listar() {
        
        List<Grado_CursoDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                Grado_CursoDTO gc = new Grado_CursoDTO();
                gc.setIdProfesor(rs.getInt("IDPROFESOR"));
                gc.setIdHorario(rs.getInt("IDHORARIO"));
                gc.setIdGrado(rs.getInt("IDGRADO"));
                gc.setIdCurso(rs.getInt("IDCURSO"));
                gc.setEstado(rs.getString("ESTADO"));
                gc.setIdGradocurso(rs.getInt("IDGRADOCURSO"));
                lista.add(gc);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    
    
    }

}

