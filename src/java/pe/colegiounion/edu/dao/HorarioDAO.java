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
import pe.colegiounion.edu.model.HorarioDTO;
import pe.colegiounion.edu.util.Conexion;

/**
 *
 * @author Brandukosky
 */
public class HorarioDAO implements Operaciones<HorarioDTO>{

    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private final String SQL_LISTAR = "SELECT * FROM HORARIO";
    private final String SQL_GUARDAR = "INSERT INTO HORARIO (IDHORARIO, HORAINICIO, HORAFIN, ESTADO) VALUES (NULL, ?, ? ,?)";
    private final String SQL_UPDATE = "UPDATE HORARIO SET HORAINICIO = ?, HORAFIN = ? ,ESTADO =? WHERE IDHORARIO =?";
    private final String SQL_BUSCAR = "SELECT *FROM HORARIO WHERE IDHORARIO=?";
    private final String SQL_ELIMINAR = "DELETE FROM HORARIO WHERE IDHORARIO = ?";

    
    @Override
    public int create(HorarioDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_GUARDAR);
            ps.setString (1, p.getHora_inicio());
            ps.setString(2, p.getHora_fin());
            ps.setString(3, p.getEstado());
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
    public int update(HorarioDTO p) {
        int op = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, p.getHora_inicio());
            ps.setString(2, p.getHora_fin());
            ps.setString(3, p.getEstado());
            ps.setInt(4, p.getIdHorario());
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;
    
    
    }

    @Override
    public HorarioDTO buscar(int id) {
        HorarioDTO h = new HorarioDTO();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                h.setHora_inicio(rs.getString("HORAINICIO"));
                h.setHora_fin(rs.getString("HORAFIN"));
                h.setEstado(rs.getString("ESTADO"));
                h.setIdHorario(rs.getInt("IDHORARIO"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return h;
    }
    @Override
    public List<HorarioDTO> listar() {
        List<HorarioDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                HorarioDTO h = new HorarioDTO();
                h.setHora_inicio(rs.getString("HORAINICIO"));
                h.setHora_fin(rs.getString("HORAFIN"));
                h.setEstado(rs.getString("ESTADO"));
                h.setIdHorario(rs.getInt("IDHORARIO"));
                lista.add(h);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
}