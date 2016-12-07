/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.colegiounion.edu.model;


/**
 *
 * @author Brandukosky
 */
public class MatriculaDTO {
    int idMatricula;
    int idGrado;
    int idEstado;
    int idAlumno;
    String fecha;
    
     
    public MatriculaDTO() {
    }

    public MatriculaDTO(int idGrado, int idEstado, int idAlumno, String fecha) {
        this.idGrado = idGrado;
        this.idEstado = idEstado;
        this.idAlumno = idAlumno;
        this.fecha = fecha;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  
    
}
