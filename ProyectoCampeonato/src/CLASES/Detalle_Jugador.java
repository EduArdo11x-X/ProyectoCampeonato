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
public class Detalle_Jugador {
    private String id_detalle_jugador;
    private String id_jugador;
    private String id_equipo;

    public Detalle_Jugador() {
    }

    public Detalle_Jugador(String id_detalle_jugador, String id_jugador, String id_equipo) {
        this.id_detalle_jugador = id_detalle_jugador;
        this.id_jugador = id_jugador;
        this.id_equipo = id_equipo;
    }

    public String getId_detalle_jugador() {
        return id_detalle_jugador;
    }

    public void setId_detalle_jugador(String id_detalle_jugador) {
        this.id_detalle_jugador = id_detalle_jugador;
    }

    public String getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(String id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(String id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String toString() {
        return "Detalle_Jugador{" + "id_detalle_jugador=" + id_detalle_jugador + ", id_jugador=" + id_jugador + ", id_equipo=" + id_equipo + '}';
    }
    
    
}
