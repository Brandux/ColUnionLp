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
import pe.colegiounion.edu.model.NotasDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class NotasDAO implements Operaciones<NotasDTO>{
    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM NOTAS";
    private final String SQL_GUARDAR = "INSERT INTO NOTAS (IDNOTAS,IDGRADOCURSO,IDALUMNO, NOTA1, NOTA2, NOTA3, NOTA4, PROMEDIO, ESTADO) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String SQL_UPDATE = "UPDATE NOTAS SET IDGRADOCURSO = ?, IDALUMNO = ?, NOTA1 = ?, NOTA2 = ?, NOTA3 = ?, NOTA4 = ? PROMEDIO =? ,ESTADO=? WHERE IDNOTAS = ? ";
    private final String SQL_BUSCAR = "SELECT *FROM NOTAS WHERE IDNOTAS=?";
    private final String SQL_ELIMINAR = "DELETE FROM NOTAS WHERE IDNOTAS = ?";

    
    @Override
    public int create(NotasDTO p) {
        
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setInt(1, p.getIdGradocurso());
            ps.setInt(2, p.getIdAlumno());
            ps.setInt(3, p.getNota01());
            ps.setInt(4, p.getNota02());
            ps.setInt(5, p.getNota03());
            ps.setInt(6, p.getNota04());
            ps.setInt(7, p.getPromedio());
            ps.setString(8, p.getEstado());
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
    public int update(NotasDTO p) {
        
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setInt(1, p.getIdGradocurso());
            ps.setInt(2, p.getIdAlumno());
            ps.setInt(3, p.getNota01());
            ps.setInt(4, p.getNota02());
            ps.setInt(5, p.getNota03());
            ps.setInt(6, p.getNota04());
            ps.setInt(7, p.getPromedio());
            ps.setString(8, p.getEstado());
            ps.setInt(9, p.getIdNotas());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    
    }

    @Override
    public NotasDTO buscar(int id) {
        
        NotasDTO n = new NotasDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                n.setIdGradocurso(rs.getInt("IDGRADOCURSO"));
                n.setIdAlumno(rs.getInt("IDALUMNO"));
                n.setNota01(rs.getInt("NOTA1"));
                n.setNota02(rs.getInt("NOTA2"));
                n.setNota03(rs.getInt("NOTA3"));
                n.setNota04(rs.getInt("NOTA4"));
                n.setPromedio(rs.getInt("PROMEDIO"));
                n.setEstado(rs.getString("ESTADO"));
                n.setIdNotas(rs.getInt("IDNOTAS"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return n;
    
    }

    @Override
    public List<NotasDTO> listar() {
        
        List<NotasDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                NotasDTO n = new  NotasDTO();
                n.setIdGradocurso(rs.getInt("IDGRADOCURSO"));
                n.setIdAlumno(rs.getInt("IDALUMNO"));
                n.setNota01(rs.getInt("NOTA1"));
                n.setNota02(rs.getInt("NOTA2"));
                n.setNota03(rs.getInt("NOTA3"));
                n.setNota04(rs.getInt("NOTA4"));
                n.setPromedio(rs.getInt("PROMEDIO"));
                n.setEstado(rs.getString("ESTADO"));
                n.setIdNotas(rs.getInt("IDNOTAS"));
                lista.add(n);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
    
}