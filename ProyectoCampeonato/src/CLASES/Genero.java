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
public class Genero {
    private String id_genero;
    private String nombre_genero;

    public Genero(String id_genero, String nombre_genero) {
        this.id_genero = id_genero;
        this.nombre_genero = nombre_genero;
    }

    public Genero() {
    }

    public String getId_genero() {
        return id_genero;
    }

    public void setId_genero(String id_genero) {
        this.id_genero = id_genero;
    }

    public String getNombre_genero() {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }

    @Override
    public String toString() {
        return "Genero{" + "id_genero=" + id_genero + ", nombre_genero=" + nombre_genero + '}';
    }
    
    

    
}
