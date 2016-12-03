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
public class Roles_permisosDTO {
    
    int idPermisos;
    int idRoles;
    

    public Roles_permisosDTO() {
    }

    public Roles_permisosDTO(int idPermisos, int idRoles) {
        this.idPermisos = idPermisos;
        this.idRoles = idRoles;
    }

    public int getIdPermisos() {
        return idPermisos;
    }

    public void setIdPermisos(int idPermisos) {
        this.idPermisos = idPermisos;
    }

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    
    
}
