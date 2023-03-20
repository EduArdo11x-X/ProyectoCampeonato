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
    private String detalle_id_jugador;
    private String detalle_id_equipo;

    public Detalle_Jugador(String id_detalle_jugador, String detalle_id_jugador, String detalle_id_equipo) {
        this.id_detalle_jugador = id_detalle_jugador;
        this.detalle_id_jugador = detalle_id_jugador;
        this.detalle_id_equipo = detalle_id_equipo;
    }

    public Detalle_Jugador() {
    }

    public String getId_detalle_jugador() {
        return id_detalle_jugador;
    }

    public void setId_detalle_jugador(String id_detalle_jugador) {
        this.id_detalle_jugador = id_detalle_jugador;
    }

    public String getDetalle_id_jugador() {
        return detalle_id_jugador;
    }

    public void setDetalle_id_jugador(String detalle_id_jugador) {
        this.detalle_id_jugador = detalle_id_jugador;
    }

    public String getDetalle_id_equipo() {
        return detalle_id_equipo;
    }

    public void setDetalle_id_equipo(String detalle_id_equipo) {
        this.detalle_id_equipo = detalle_id_equipo;
    }

    @Override
    public String toString() {
        return "Detalle_Jugador{" + "id_detalle_jugador=" + id_detalle_jugador + ", detalle_id_jugador=" + detalle_id_jugador + ", detalle_id_equipo=" + detalle_id_equipo + '}';
    }

  
}
