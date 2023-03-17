/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author EDU
 */
public class Parroquia {
    
    private String id_parroquia;
    private String nombre_parroquia;
    private String codigo_costal;

    public Parroquia(String id_parroquia, String nombre_parroquia, String codigo_costal) {
        this.id_parroquia = id_parroquia;
        this.nombre_parroquia = nombre_parroquia;
        this.codigo_costal = codigo_costal;
    }

    public Parroquia() {
    }

    public String getId_parroquia() {
        return id_parroquia;
    }

    public void setId_parroquia(String id_parroquia) {
        this.id_parroquia = id_parroquia;
    }

    public String getNombre_parroquia() {
        return nombre_parroquia;
    }

    public void setNombre_parroquia(String nombre_parroquia) {
        this.nombre_parroquia = nombre_parroquia;
    }

    public String getCodigo_costal() {
        return codigo_costal;
    }

    public void setCodigo_costal(String codigo_costal) {
        this.codigo_costal = codigo_costal;
    }

    @Override
    public String toString() {
        return "Parroquia{" + "id_parroquia=" + id_parroquia + ", nombre_parroquia=" + nombre_parroquia + ", codigo_costal=" + codigo_costal + '}';
    }
    
    
}
