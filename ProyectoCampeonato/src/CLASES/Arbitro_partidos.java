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
    
    private String info_id_partidos;
    
    private String info_id_arbitro;
    private String info_id_partido;

    public Arbitro_partidos(String info_id_partidos, String info_id_arbitro, String info_id_partido) {
        this.info_id_partidos = info_id_partidos;
        this.info_id_arbitro = info_id_arbitro;
        this.info_id_partido = info_id_partido;
    }

    public Arbitro_partidos() {
    }

    public String getInfo_id_partidos() {
        return info_id_partidos;
    }

    public void setInfo_id_partidos(String info_id_partidos) {
        this.info_id_partidos = info_id_partidos;
    }

    public String getInfo_id_arbitro() {
        return info_id_arbitro;
    }

    public void setInfo_id_arbitro(String info_id_arbitro) {
        this.info_id_arbitro = info_id_arbitro;
    }

    public String getInfo_id_partido() {
        return info_id_partido;
    }

    public void setInfo_id_partido(String info_id_partido) {
        this.info_id_partido = info_id_partido;
    }

    @Override
    public String toString() {
        return "Arbitro_partidos{" + "info_id_partidos=" + info_id_partidos + ", info_id_arbitro=" + info_id_arbitro + ", info_id_partido=" + info_id_partido + '}';
    }

    
    
}
