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
public class Grado_CursoDTO {
    
    int idGradocurso;
    int idProfesor;
    int idHorario;
    int idGrado;
    int idCurso;
    String estado;
    
    
    public Grado_CursoDTO() {
    }

    public Grado_CursoDTO(int idProfesor, int idHorario, int idGrado, int idCurso, String estado) {
        this.idProfesor = idProfesor;
        this.idHorario = idHorario;
        this.idGrado = idGrado;
        this.idCurso = idCurso;
        this.estado = estado;
    }

    public int getIdGradocurso() {
        return idGradocurso;
    }

    public void setIdGradocurso(int idGradocurso) {
        this.idGradocurso = idGradocurso;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
