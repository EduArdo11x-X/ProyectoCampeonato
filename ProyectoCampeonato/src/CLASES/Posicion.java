/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author LENOVO
 */
public class Posicion {
    private String id_posicion;
    private String Nombre_posicion;
    private String Descripcion_posicion;

    public Posicion() {
    }

    public Posicion(String id_posicion, String Nombre_posicion, String Descripcion_posicion) {
        this.id_posicion = id_posicion;
        this.Nombre_posicion = Nombre_posicion;
        this.Descripcion_posicion = Descripcion_posicion;
    }

    public String getId_posicion() {
        return id_posicion;
    }

    public void setId_posicion(String id_posicion) {
        this.id_posicion = id_posicion;
    }

    public String getNombre_posicion() {
        return Nombre_posicion;
    }

    public void setNombre_posicion(String Nombre_posicion) {
        this.Nombre_posicion = Nombre_posicion;
    }

    public String getDescripcion_posicion() {
        return Descripcion_posicion;
    }

    public void setDescripcion_posicion(String Descripcion_posicion) {
        this.Descripcion_posicion = Descripcion_posicion;
    }

    public String toString() {
        return "Posicion{" + "id_posicion=" + id_posicion + ", Nombre_posicion=" + Nombre_posicion + ", Descripcion_posicion=" + Descripcion_posicion + '}';
    }
    
}
