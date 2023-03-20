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
public class Partido {
    
    private String Id_Partido;
    private String partido_id_arbitro;
    private String partido_id_cancha;
    private String partido_id_categoria;
    private String partido_id_fecha;
    private String Horario_partido;

    public Partido(String Id_Partido, String partido_id_arbitro, String partido_id_cancha, String partido_id_categoria, String partido_id_fecha, String Horario_partido) {
        this.Id_Partido = Id_Partido;
        this.partido_id_arbitro = partido_id_arbitro;
        this.partido_id_cancha = partido_id_cancha;
        this.partido_id_categoria = partido_id_categoria;
        this.partido_id_fecha = partido_id_fecha;
        this.Horario_partido = Horario_partido;
    }

    public Partido() {
    }

    public String getId_Partido() {
        return Id_Partido;
    }

    public void setId_Partido(String Id_Partido) {
        this.Id_Partido = Id_Partido;
    }

    public String getPartido_id_arbitro() {
        return partido_id_arbitro;
    }

    public void setPartido_id_arbitro(String partido_id_arbitro) {
        this.partido_id_arbitro = partido_id_arbitro;
    }

    public String getPartido_id_cancha() {
        return partido_id_cancha;
    }

    public void setPartido_id_cancha(String partido_id_cancha) {
        this.partido_id_cancha = partido_id_cancha;
    }

    public String getPartido_id_categoria() {
        return partido_id_categoria;
    }

    public void setPartido_id_categoria(String partido_id_categoria) {
        this.partido_id_categoria = partido_id_categoria;
    }

    public String getPartido_id_fecha() {
        return partido_id_fecha;
    }

    public void setPartido_id_fecha(String partido_id_fecha) {
        this.partido_id_fecha = partido_id_fecha;
    }

    public String getHorario_partido() {
        return Horario_partido;
    }

    public void setHorario_partido(String Horario_partido) {
        this.Horario_partido = Horario_partido;
    }

    @Override
    public String toString() {
        return "Partido{" + "Id_Partido=" + Id_Partido + ", partido_id_arbitro=" + partido_id_arbitro + ", partido_id_cancha=" + partido_id_cancha + ", partido_id_categoria=" + partido_id_categoria + ", partido_id_fecha=" + partido_id_fecha + ", Horario_partido=" + Horario_partido + '}';
    }
    
    
}