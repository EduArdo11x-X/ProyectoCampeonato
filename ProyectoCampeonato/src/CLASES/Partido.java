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
    private String Id_arbitro;
    private String Id_Cancha;
    private String id_categoria;
    private String id_fecha;
    private String Horario_partido;

    public Partido(String Id_Partido, String Id_arbitro, String Id_Cancha, String id_categoria, String id_fecha, String Horario_partido) {
        this.Id_Partido = Id_Partido;
        this.Id_arbitro = Id_arbitro;
        this.Id_Cancha = Id_Cancha;
        this.id_categoria = id_categoria;
        this.id_fecha = id_fecha;
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

    public String getId_arbitro() {
        return Id_arbitro;
    }

    public void setId_arbitro(String Id_arbitro) {
        this.Id_arbitro = Id_arbitro;
    }

    public String getId_Cancha() {
        return Id_Cancha;
    }

    public void setId_Cancha(String Id_Cancha) {
        this.Id_Cancha = Id_Cancha;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getId_fecha() {
        return id_fecha;
    }

    public void setId_fecha(String id_fecha) {
        this.id_fecha = id_fecha;
    }

    public String getHorario_partido() {
        return Horario_partido;
    }

    public void setHorario_partido(String Horario_partido) {
        this.Horario_partido = Horario_partido;
    }

    @Override
    public String toString() {
        return "Partido{" + "Id_Partido=" + Id_Partido + ", Id_arbitro=" + Id_arbitro + ", Id_Cancha=" + Id_Cancha + ", id_categoria=" + id_categoria + ", id_fecha=" + id_fecha + ", Horario_partido=" + Horario_partido + '}';
    }
    
    
    
}
