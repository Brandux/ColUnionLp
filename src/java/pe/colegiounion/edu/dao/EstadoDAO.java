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
import pe.colegiounion.edu.model.EstadoDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class EstadoDAO implements Operaciones<EstadoDTO>{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM ESTADO";
    private final String SQL_GUARDAR = "INSERT INTO ESTADO (IDESTADO, TIPOESTADO , ESTADO) VALUES (NULL, ?,?)";
    private final String SQL_UPDATE = "UPDATE ESTADO SET TIPOESTADO = ? , ESTADO =? WHERE IDESTADO = ?";
    private final String SQL_BUSCAR = "SELECT *FROM ESTADO WHERE IDESTADO  =?";
    private final String SQL_ELIMINAR = "DELETE FROM ESTADO WHERE IDESTADO = ?";

    
    @Override
    public int create(EstadoDTO p) {
        int op=0 ;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setString(1, p.getTipoestado());
            ps.setString(2, p.getEstado());
            op= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return op;
    }

    @Override
    public int delete(int id) {
        int op=0;
        try {
            cx= Conexion.getConexion();
            ps = cx.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, id);
            op= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    }

    @Override
    public int update(EstadoDTO p) {
        int  op =0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getTipoestado());
            ps.setString(2, p.getEstado());
            ps.setInt(3, p.getIdEstado());
            op= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error :" +e);
        }
        return op;
    }

    @Override
    public EstadoDTO buscar(int id) {
        EstadoDTO es = new EstadoDTO();
        try {
            cx= Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {                
                es.setTipoestado(rs.getString("TIPOESTADO"));
                es.setEstado(rs.getString("ESTADO"));
                es.setIdEstado(rs.getInt("IDESTADO"));
            }
        } catch (Exception e) {
            System.out.println("Error:"+ e);
        }
        return es;
    }

    @Override
    public List<EstadoDTO> listar() {
        List<EstadoDTO> lista  = new ArrayList<>();
        try {
            cx= Conexion.getConexion();
            ps= cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                EstadoDTO es = new EstadoDTO();
                es.setTipoestado(rs.getString("TIPOESTADO"));
                es.setEstado(rs.getString("ESTADO"));
                es.setIdEstado(rs.getInt("IDESTADO"));
                lista.add(es);
            }
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
        return lista;
    }
}