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
import pe.colegiounion.edu.model.PermisosDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class PermisosDAO implements Operaciones<PermisosDTO>{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM PERMISOS";
    private final String SQL_GUARDAR = "INSERT INTO PERMISOS (IDPERMISOS, DESCRIPCION) VALUES (NULL, ?)";
    private final String SQL_UPDATE = "UPDATE PERMISOS SET DESCRIPCION = ? WHERE IDPERMISOS = ?";
    private final String SQL_BUSCAR = "SELECT *FROM PERMISOS WHERE IDPERMISOS=?";
    private final String SQL_ELIMINAR = "DELETE FROM PERMISOS WHERE IDPERMISOS = ?";
    
    @Override
    public int create(PermisosDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setString(1, p.getDescripcion());
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
    public int update(PermisosDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getDescripcion());
            ps.setInt(2, p.getIdPermisos());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;    
    
    }

    @Override
    public PermisosDTO buscar(int id) {
        
        PermisosDTO p = new PermisosDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setDescripcion(rs.getString("IDPERMISOS"));
                p.setIdPermisos(rs.getInt("DESCRIPCION"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return p;
    }

    @Override
    public List<PermisosDTO> listar() {
        List<PermisosDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                PermisosDTO p = new PermisosDTO();
                p.setDescripcion(rs.getString("IDPERMISOS"));
                p.setIdPermisos(rs.getInt("DESCRIPCION"));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    
    
    }
    
}
