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
import pe.colegiounion.edu.model.Roles_permisosDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class Roles_permisosDAO implements Operaciones<Roles_permisosDTO>{
    
    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM ROLES_PERMISOS";
    private final String SQL_GUARDAR = "INSERT INTO ROLES_PERMISOS (IDPERMISOS, IDROLES) VALUES (?, ?)";
    private final String SQL_UPDATE = "UPDATE ROLES_PERMISOS SET IDPERMISOS = ?, IDROLES = ? WHERE IDPERMISOS = ?";
    private final String SQL_BUSCAR = "SELECT *FROM ROLES_PERMISOS WHERE IDPERMISOS=?";
    private final String SQL_ELIMINAR = "DELETE FROM ROLES_PERMISOS WHERE IDPERMISOS = ?";

    @Override
    public int create(Roles_permisosDTO p) {
        
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setInt(1, p.getIdPermisos());
            ps.setInt(2, p.getIdRoles());
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
    public int update(Roles_permisosDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setInt(2, p.getIdRoles());
            ps.setInt(1, p.getIdPermisos());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    }

    @Override
    public Roles_permisosDTO buscar(int id) {
        
        Roles_permisosDTO rp = new Roles_permisosDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                rp.setIdPermisos(rs.getInt("IDPERMISOS"));
                rp.setIdRoles(rs.getInt("IDROLES"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return rp;
    }

    @Override
    public List<Roles_permisosDTO> listar() {
        
        List<Roles_permisosDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                Roles_permisosDTO rp = new Roles_permisosDTO();
                rp.setIdPermisos(rs.getInt("IDPERMISOS"));
                rp.setIdRoles(rs.getInt("IDROLES"));
                lista.add(rp);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
    
}
