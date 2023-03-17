/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author user
 */
public class Campeonato_Partidos extends Campeonato {
    
   private String id_detalle_juego;
   private String Id_partido;

    public Campeonato_Partidos(String id_detalle_juego, String Id_partido, String Campeonato_Id, String Campeonato_nombre, int campeonato_numeros_Equipo, String Campeonato_fecha_inicio, String Campeonato_fecha_final) {
        super(Campeonato_Id, Campeonato_nombre, campeonato_numeros_Equipo, Campeonato_fecha_inicio, Campeonato_fecha_final);
        this.id_detalle_juego = id_detalle_juego;
        this.Id_partido = Id_partido;
    }

    public Campeonato_Partidos(String id_detalle_juego, String Id_partido) {
        this.id_detalle_juego = id_detalle_juego;
        this.Id_partido = Id_partido;
    }

    public String getId_detalle_juego() {
        return id_detalle_juego;
    }

    public void setId_detalle_juego(String id_detalle_juego) {
        this.id_detalle_juego = id_detalle_juego;
    }

    public String getId_partido() {
        return Id_partido;
    }

    public void setId_partido(String Id_partido) {
        this.Id_partido = Id_partido;
    }

    @Override
    public String toString() {
        return "Campeonato_Partidos{" + "id_detalle_juego=" + id_detalle_juego + ", Id_partido=" + Id_partido + '}';
    }

}
