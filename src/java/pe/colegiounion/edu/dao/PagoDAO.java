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
import pe.colegiounion.edu.model.PagoDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class PagoDAO implements Operaciones<PagoDTO>{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM PAGO";
    private final String SQL_GUARDAR = "INSERT INTO PAGO (IDPAGO, IDMATRICULA, IDESTADO, PRECIO, FECHA) VALUES (NULL, ?, ?, ?, ? )";
    private final String SQL_UPDATE = "UPDATE PAGO SET IDMATRICULA = ?, IDESTADO = ?, PRECIO = ?, FECHA =?   WHERE IDPAGO = ?";
    private final String SQL_BUSCAR = "SELECT *FROM PAGO WHERE IDPAGO=?";
    private final String SQL_ELIMINAR = "DELETE FROM PAGO WHERE IDPAGO = ?";

    @Override
    public int create(PagoDTO p) {
        
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setInt(1, p.getIdMatricula());
            ps.setInt(2, p.getIdEstado());
            ps.setDouble(3, p.getPrecio());
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
    public int update(PagoDTO p) {
    
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setInt(1, p.getIdMatricula());
            ps.setInt(2, p.getIdEstado());
            ps.setDouble(3, p.getPrecio());
            ps.setString(4, p.getFecha());
            ps.setInt(5, p.getIdPago());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    
    }

    @Override
    public PagoDTO buscar(int id) {
        
        PagoDTO p = new PagoDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setIdMatricula(rs.getInt("IDMATRICULA"));
                p.setIdEstado(rs.getInt("IDESTADO"));
                p.setPrecio(rs.getDouble("PRECIO"));
                p.setFecha(rs.getString("FECHA"));
                p.setIdPago(rs.getInt("IDPAGO"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return p;
    
    }

    @Override
    public List<PagoDTO> listar() {
        List<PagoDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                PagoDTO p = new PagoDTO();
                p.setIdMatricula(rs.getInt("IDMATRICULA"));
                p.setIdEstado(rs.getInt("IDESTADO"));
                p.setPrecio(rs.getDouble("PRECIO"));
                p.setFecha(rs.getString("FECHA"));
                p.setIdPago(rs.getInt("IDPAGO"));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;    
    
    }
    
}
