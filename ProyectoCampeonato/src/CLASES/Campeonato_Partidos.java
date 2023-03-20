/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

import java.util.Date;

/**
 *
 * @author user
 */
public class Campeonato_Partidos {
    
   private String id_detalle_juego;
   private String detalle_id_campeonato;
   private String detalle_id_partido;

    public Campeonato_Partidos(String id_detalle_juego, String detalle_id_campeonato, String detalle_id_partido) {
        this.id_detalle_juego = id_detalle_juego;
        this.detalle_id_campeonato = detalle_id_campeonato;
        this.detalle_id_partido = detalle_id_partido;
    }

    public Campeonato_Partidos() {
    }

    public String getId_detalle_juego() {
        return id_detalle_juego;
    }

    public void setId_detalle_juego(String id_detalle_juego) {
        this.id_detalle_juego = id_detalle_juego;
    }

    public String getDetalle_id_campeonato() {
        return detalle_id_campeonato;
    }

    public void setDetalle_id_campeonato(String detalle_id_campeonato) {
        this.detalle_id_campeonato = detalle_id_campeonato;
    }

    public String getId_partido() {
        return detalle_id_partido;
    }

    public void setId_partido(String detalle_id_partido) {
        this.detalle_id_partido = detalle_id_partido;
    }

    @Override
    public String toString() {
        return "Campeonato_Partidos{" + "id_detalle_juego=" + id_detalle_juego + ", detalle_id_campeonato=" + detalle_id_campeonato + ", Id_partido=" + detalle_id_partido + '}';
    }

   
}
