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
public class Equipo {
    private String id_equipo;
    private String equipo_id_entrenador;
    private String nombre_fundador;
    private int anio_creacion_equipo;
    private int numero_jugadores;

    public Equipo(String id_equipo, String equipo_id_entrenador, String nombre_fundador, int anio_creacion_equipo, int numero_jugadores) {
        this.id_equipo = id_equipo;
        this.equipo_id_entrenador = equipo_id_entrenador;
        this.nombre_fundador = nombre_fundador;
        this.anio_creacion_equipo = anio_creacion_equipo;
        this.numero_jugadores = numero_jugadores;
    }

    public Equipo() {
    }

    public String getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(String id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getId_entrenador() {
        return equipo_id_entrenador;
    }

    public void setId_entrenador(String id_entrenador) {
        this.equipo_id_entrenador = id_entrenador;
    }

    public String getNombre_fundador() {
        return nombre_fundador;
    }

    public void setNombre_fundador(String nombre_fundador) {
        this.nombre_fundador = nombre_fundador;
    }

    public int getAnio_creacion_equipo() {
        return anio_creacion_equipo;
    }

    public void setAnio_creacion_equipo(int anio_creacion_equipo) {
        this.anio_creacion_equipo = anio_creacion_equipo;
    }

    public int getNumero_jugadores() {
        return numero_jugadores;
    }

    public void setNumero_jugadores(int numero_jugadores) {
        this.numero_jugadores = numero_jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id_equipo=" + id_equipo + ", id_entrenador=" + equipo_id_entrenador + ", nombre_fundador=" + nombre_fundador + ", anio_creacion_equipo=" + anio_creacion_equipo + ", numero_jugadores=" + numero_jugadores + '}';
    }

    

    
}
