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
public class Arbitro {

    private String id_arbitro;
    private String cedula_per;
    private String num_campeonato;
    private String experiencia;

    public Arbitro(String id_arbitro, String cedula_per, String num_campeonato, String experiencia) {
        this.id_arbitro = id_arbitro;
        this.cedula_per = cedula_per;
        this.num_campeonato = num_campeonato;
        this.experiencia = experiencia;
    }

    public Arbitro() {
    }

    public String getId_arbitro() {
        return id_arbitro;
    }

    public void setId_arbitro(String id_arbitro) {
        this.id_arbitro = id_arbitro;
    }

    public String getCedula_per() {
        return cedula_per;
    }

    public void setCedula_per(String cedula_per) {
        this.cedula_per = cedula_per;
    }

    public String getNum_campeonato() {
        return num_campeonato;
    }

    public void setNum_campeonato(String num_campeonato) {
        this.num_campeonato = num_campeonato;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Arbitro{" + "id_arbitro=" + id_arbitro + ", cedula_per=" + cedula_per + ", num_campeonato=" + num_campeonato + ", experiencia=" + experiencia + '}';
    }

}
