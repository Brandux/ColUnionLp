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
import pe.colegiounion.edu.model.SeccionDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class SeccionDAO implements Operaciones<SeccionDTO>{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM SECCION";
    private final String SQL_GUARDAR = "INSERT INTO SECCION (IDSECCION, TIPOSECCION, ESTADO) VALUES (NULL, ?, ?)";
    private final String SQL_UPDATE = "UPDATE SECCION SET TIPOSECCION = ? ,ESTADO=? WHERE IDSECCION =?";
    private final String SQL_BUSCAR = "SELECT *FROM SECCION WHERE IDSECCION =?";
    private final String SQL_ELIMINAR = "DELETE FROM SECCION WHERE IDSECCION = ?";
    
    
    @Override
    public int create(SeccionDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setString(1, p.getTiposeccion());
            ps.setString(2, p.getEstado());
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
    public int update(SeccionDTO p) {
    
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
           
            ps.setString(1, p.getTiposeccion());
            ps.setString(2, p.getEstado());
            ps.setInt(3, p.getIdSeccion());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    
    }

    @Override
    public SeccionDTO buscar(int id) {
        SeccionDTO s = new SeccionDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                s.setTiposeccion(rs.getString("TIPOSECCION"));
                s.setEstado(rs.getString("ESTADO"));
                s.setIdSeccion(rs.getInt("IDSECCION"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return s;
    }

    @Override
    public List<SeccionDTO> listar() {
        
        List<SeccionDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                SeccionDTO s = new SeccionDTO();
                s.setTiposeccion(rs.getString("TIPOSECCION"));
                s.setEstado(rs.getString("ESTADO"));
                s.setIdSeccion(rs.getInt("IDSECCION"));
                lista.add(s);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
    
}
