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
import pe.colegiounion.edu.model.CursoDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class CursoDAO implements  Operaciones<CursoDTO>{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM CURSO";
    private final String SQL_GUARDAR = "INSERT INTO CURSO (IDCURSO,DESCRIPCION , ESTADO) VALUES (NULL,?,?)";
    private final String SQL_UPDATE = "UPDATE CURSO SET DESCRIPCION = ?, ESTADO =? WHERE IDCURSO = ?";
    private final String SQL_BUSCAR = "SELECT *FROM CURSO WHERE IDCURSO=?";
    private final String SQL_ELIMINAR = "DELETE FROM CURSO WHERE IDCURSO = ?";

    
    @Override
    public int create(CursoDTO p) {
        int op=0;
    
            try {
            cx= Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setString(1, p.getDescripcion());
            ps.setString(2, p.getEstado());
            op= ps.executeUpdate();
            } catch (Exception e) {
                System.out.println("Error:" +e);
        }
        return op;
    }

    @Override
    public int delete(int id) {

        int op=0;
        try {
            cx = Conexion.getConexion();
            ps= cx.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, id);
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
        return op;
    }

    @Override
    public int update(CursoDTO p) {

        int op =0;
        try {
            cx= Conexion.getConexion();
            ps =  cx. prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getDescripcion());
            ps.setString(2, p.getEstado());
            ps.setInt(3, p.getIdCurso());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
        return op;
    }

    @Override
    public CursoDTO buscar(int id) {
        CursoDTO c = new CursoDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {                
                c.setDescripcion(rs.getString("DESCRIPCION"));
                c.setEstado(rs.getString("ESTADO"));
                c.setIdCurso(rs.getInt("IDCURSO"));
            }
        } catch (Exception e) {
            System.out.println("Error : " +e);
        }
        return c;
    }

    @Override
    public List<CursoDTO> listar() {

        List<CursoDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps =  cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                CursoDTO c = new CursoDTO();
                c.setDescripcion(rs.getString("DESCRIPCION"));
                c.setEstado(rs.getString("ESTADO"));
                c.setIdCurso(rs.getInt("IDCURSO"));
                lista.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error :"+ e);
        }
        return lista;
    }
    
}
