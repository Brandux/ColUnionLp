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
import pe.colegiounion.edu.model.RolesDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class RolesDAO implements Operaciones<RolesDTO>{
    
    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM ROLES";
    private final String SQL_GUARDAR = "INSERT INTO ROLES (IDROLES,DESCRIPCION, ESTADO) VALUES (NULL, ?, ? ,?)";
    private final String SQL_UPDATE = "UPDATE ROLES SET  DESCRIPCION = ?, ESTADO=? WHERE IDROLES = ?";
    private final String SQL_BUSCAR = "SELECT *FROM ROLES WHERE IDROLES=?";
    private final String SQL_ELIMINAR = "DELETE FROM ROLES WHERE IDROLES = ?";

    @Override
    public int create(RolesDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setString(1, p.getDescripcion());
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
    public int update(RolesDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getDescripcion());
            ps.setString(2, p.getEstado());
            ps.setInt(3, p.getIdRoles());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;}

    @Override
    public RolesDTO buscar(int id) {
       
        RolesDTO r = new RolesDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                r.setDescripcion(rs.getString("DESCRIPCION"));
                r.setEstado(rs.getString("ESTADO"));
                r.setIdRoles(rs.getInt("IDROLES"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return r;
    
    }

    @Override
    public List<RolesDTO> listar() {
        List<RolesDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                RolesDTO r = new RolesDTO();
                r.setDescripcion(rs.getString("DESCRIPCION"));
                r.setEstado(rs.getString("ESTADO"));
                r.setIdRoles(rs.getInt("IDROLES"));
                lista.add(r);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;}
    
}
