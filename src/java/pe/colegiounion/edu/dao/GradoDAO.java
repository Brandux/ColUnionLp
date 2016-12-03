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
import pe.colegiounion.edu.model.GradoDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class GradoDAO implements Operaciones<GradoDTO>{

    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM GRADO";
    private final String SQL_GUARDAR = "INSERT INTO GRADO (IDGRADO,IDEDUCACION,IDSECCION,ANOESCOLAR, ESTADO) VALUES (NULL, ?, ?, ?,?)";
    private final String SQL_UPDATE = "UPDATE GRADO SET IDEDUCACION = ?, IDSECCION = ?, ANOESCOLAR =? , ESTADO =? WHERE IDESTADO = ?";
    private final String SQL_BUSCAR = "SELECT *FROM GRADO WHERE IDGRADO=?";
    private final String SQL_ELIMINAR = "DELETE FROM GRADO WHERE IDGRADO = ?";
    
    
    @Override
    public int create(GradoDTO p) {
        int  op =0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setInt(1, p.getIdEducacion());
            ps.setInt(2, p.getIdSeccion());
            ps.setString(3, p.getAnoescolar());
            ps.setString(4, p.getEstado());
            op= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:" +e );
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
            op= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
        return op;
    }

    @Override
    public int update(GradoDTO p) {
        int op =0;
        try {
            cx = Conexion.getConexion();
            ps= cx.prepareStatement(SQL_UPDATE);
            ps.setInt(1, p.getIdEducacion());
            ps.setInt(2, p.getIdSeccion());
            ps.setString(3, p.getAnoescolar());
            ps.setString(4, p.getEstado());
            ps.setInt(5, p.getIdGrado());
            op= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        
            return op;
    }

    @Override
    public GradoDTO buscar(int id) {
        GradoDTO g = new GradoDTO();
        try {
            cx= Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {                
                g.setIdEducacion(rs.getInt("IDEDUCACION"));
                g.setIdSeccion(rs.getInt("IDSECCION"));
                g.setAnoescolar(rs.getString("ANOESCOLAR"));
                g.setEstado(rs.getString("ESTADI"));
                g.setIdGrado(rs.getInt("IDGRADO"));
            }
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }
        return g;
    }

    @Override
    public List<GradoDTO> listar() {
        List<GradoDTO> lista  = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps= cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {                
                GradoDTO g = new GradoDTO();
                g.setIdEducacion(rs.getInt("IDEDUCACION"));
                g.setIdSeccion(rs.getInt("IDSECCION"));
                g.setAnoescolar(rs.getString("ANOESCOLAR"));
                g.setEstado(rs.getString("ESTADI"));
                g.setIdGrado(rs.getInt("IDGRADO"));
                lista.add(g);
            }
        } catch (Exception e) {
            return lista;
        }
        return lista; 
    }
    
}
