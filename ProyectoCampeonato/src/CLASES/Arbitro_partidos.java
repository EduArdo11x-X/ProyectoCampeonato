/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author Lenovo
 */
public class Arbitro_partidos {
    
    private String id_arbitro;
    private String id_partido;

    public Arbitro_partidos(String id_arbitro, String id_partido) {
        this.id_arbitro = id_arbitro;
        this.id_partido = id_partido;
    }

    public Arbitro_partidos() {
    }

    public String getId_arbitro() {
        return id_arbitro;
    }

    public void setId_arbitro(String id_arbitro) {
        this.id_arbitro = id_arbitro;
    }

    public String getId_partido() {
        return id_partido;
    }

    public void setId_partido(String id_partido) {
        this.id_partido = id_partido;
    }

    @Override
    public String toString() {
        return "Arbitro_partidos{" + "id_arbitro=" + id_arbitro + ", id_partido=" + id_partido + '}';
    }
    
}
