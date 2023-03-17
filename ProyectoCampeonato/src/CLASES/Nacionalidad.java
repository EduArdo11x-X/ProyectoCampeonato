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
public class Nacionalidad {
    private String id_nacionalidad;
    private String Nombre_nacionalidad;

    public Nacionalidad() {
    }

    public Nacionalidad(String id_nacionalidad, String Nombre_nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
        this.Nombre_nacionalidad = Nombre_nacionalidad;
    }

    public String getId_nacionalidad() {
        return id_nacionalidad;
    }

    public void setId_nacionalidad(String id_nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
    }

    public String getNombre_nacionalidad() {
        return Nombre_nacionalidad;
    }

    public void setNombre_nacionalidad(String Nombre_nacionalidad) {
        this.Nombre_nacionalidad = Nombre_nacionalidad;
    }

    public String toString() {
        return "Nacionalidad{" + "id_nacionalidad=" + id_nacionalidad + ", Nombre_nacionalidad=" + Nombre_nacionalidad + '}';
    }
    
    
    
}
