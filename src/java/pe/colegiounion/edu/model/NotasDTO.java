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
public class NotasDTO {
    int idNotas;
    int idGradocurso;
    int idAlumno;
    
    int nota01;
    int nota02;
    int nota03;
    int nota04;
    int promedio;
    String estado;

    public NotasDTO() {
    }

    public NotasDTO(int idGradocurso, int idAlumno, int nota01, int nota02, int nota03, int nota04, int promedio, String estado) {
        this.idGradocurso = idGradocurso;
        this.idAlumno = idAlumno;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
        this.promedio = promedio;
        this.estado = estado;
    }

    public int getIdNotas() {
        return idNotas;
    }

    public void setIdNotas(int idNotas) {
        this.idNotas = idNotas;
    }

    public int getIdGradocurso() {
        return idGradocurso;
    }

    public void setIdGradocurso(int idGradocurso) {
        this.idGradocurso = idGradocurso;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getNota01() {
        return nota01;
    }

    public void setNota01(int nota01) {
        this.nota01 = nota01;
    }

    public int getNota02() {
        return nota02;
    }

    public void setNota02(int nota02) {
        this.nota02 = nota02;
    }

    public int getNota03() {
        return nota03;
    }

    public void setNota03(int nota03) {
        this.nota03 = nota03;
    }

    public int getNota04() {
        return nota04;
    }

    public void setNota04(int nota04) {
        this.nota04 = nota04;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
