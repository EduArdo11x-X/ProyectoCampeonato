/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PC01
 */
public class Campeonato_Partido {
    
    private String id_detalle_juego;
    private String Campeonato_id;
    private String Id_partido;

    public Campeonato_Partido(String id_detalle_juego, String Campeonato_id, String Id_partido) {
        this.id_detalle_juego = id_detalle_juego;
        this.Campeonato_id = Campeonato_id;
        this.Id_partido = Id_partido;
    }

    public Campeonato_Partido() {
    }

    public String getId_detalle_juego() {
        return id_detalle_juego;
    }

    public void setId_detalle_juego(String id_detalle_juego) {
        this.id_detalle_juego = id_detalle_juego;
    }

    public String getCampeonato_id() {
        return Campeonato_id;
    }

    public void setCampeonato_id(String Campeonato_id) {
        this.Campeonato_id = Campeonato_id;
    }

    public String getId_partido() {
        return Id_partido;
    }

    public void setId_partido(String Id_partido) {
        this.Id_partido = Id_partido;
    }

    @Override
    public String toString() {
        return "Campeonato_Partido{" + "id_detalle_juego=" + id_detalle_juego + ", Campeonato_id=" + Campeonato_id + ", Id_partido=" + Id_partido + '}';
    }
    
    
    
}
