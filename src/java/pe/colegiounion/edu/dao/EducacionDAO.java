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
import pe.colegiounion.edu.model.EducacionDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class EducacionDAO implements Operaciones<EducacionDTO>{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM EDUCACION";
    private final String SQL_GUARDAR = "INSERT INTO EDUCACION (IDEDUCACION, GRADO, COSTO, ESTADO) VALUES (NULL, ?, ?,?)";
    private final String SQL_UPDATE = "UPDATE EDUCACION SET GRADO = ?, COSTO = ? , ESTADO =? WHERE IDEDUCACION =?";
    private final String SQL_BUSCAR = "SELECT *FROM EDUCACION WHERE IDEDUCACION=?";
    private final String SQL_ELIMINAR = "DELETE FROM EDUCACION WHERE IDEDUCACION = ?";

    
    @Override
    public int create(EducacionDTO p) {
        int op =0 ;
    
        try {
            cx = Conexion.getConexion();
            ps=  cx.prepareStatement(SQL_GUARDAR);
            ps.setString(1, p.getGrado());
            ps.setDouble(2, p.getCosto());
            ps.setString(3, p.getEstado());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
        return op ;
    }

    @Override
    public int delete(int id) {
        int op =0 ;
            try {
            cx= Conexion.getConexion();
            ps = cx.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, id);
            op = ps.executeUpdate();
        } catch (Exception e) {
                System.out.println("Error:" +e);
        }
        return  op;
    }

    @Override
    public int update(EducacionDTO p) {

        int op =0;
        try {
            cx = Conexion.getConexion();
            ps= cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getGrado());
            ps.setDouble(2, p.getCosto());
            ps.setString(3, p.getEstado());
            ps.setInt(4, p.getIdEducacion());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error :" +e);
        }
        return op;
    }

    @Override
    public EducacionDTO buscar(int id) {
        EducacionDTO e = new EducacionDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {                
                e.setGrado(rs.getString("GRADO"));
                e.setCosto(rs.getDouble("COSTO"));
                e.setEstado(rs.getString("ESTADO"));
                e.setIdEducacion(rs.getInt("IDEDUCACION"));
            }
        } catch (Exception x) {
            System.out.println("Error:  " + e);
        }
        return e;
    }

    @Override
    public List<EducacionDTO> listar() {
   
        List<EducacionDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {        
                EducacionDTO e = new EducacionDTO();
                e.setGrado(rs.getString("GRADO"));
                e.setCosto(rs.getDouble("COSTO"));
                e.setEstado(rs.getString("ESTADO"));
                e.setIdEducacion(rs.getInt("IDEDUCACION"));
                lista.add(e);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return lista;
    }
}