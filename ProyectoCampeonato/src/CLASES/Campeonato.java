/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author HP
 */
public class Campeonato {
    
    private String Campeonato_Id;
    private String Campeonato_nombre;
    private int campeonato_numeros_Equipo;
    private String Campeonato_fecha_inicio;
    private String Campeonato_fecha_final;

    public Campeonato(String Campeonato_Id, String Campeonato_nombre, int campeonato_numeros_Equipo, String Campeonato_fecha_inicio, String Campeonato_fecha_final) {
        this.Campeonato_Id = Campeonato_Id;
        this.Campeonato_nombre = Campeonato_nombre;
        this.campeonato_numeros_Equipo = campeonato_numeros_Equipo;
        this.Campeonato_fecha_inicio = Campeonato_fecha_inicio;
        this.Campeonato_fecha_final = Campeonato_fecha_final;
    }

    public Campeonato() {
    }

    public String getCampeonato_Id() {
        return Campeonato_Id;
    }

    public void setCampeonato_Id(String Campeonato_Id) {
        this.Campeonato_Id = Campeonato_Id;
    }

    public String getCampeonato_nombre() {
        return Campeonato_nombre;
    }

    public void setCampeonato_nombre(String Campeonato_nombre) {
        this.Campeonato_nombre = Campeonato_nombre;
    }

    public int getCampeonato_numeros_Equipo() {
        return campeonato_numeros_Equipo;
    }

    public void setCampeonato_numeros_Equipo(int campeonato_numeros_Equipo) {
        this.campeonato_numeros_Equipo = campeonato_numeros_Equipo;
    }

    public String getCampeonato_fecha_inicio() {
        return Campeonato_fecha_inicio;
    }

    public void setCampeonato_fecha_inicio(String Campeonato_fecha_inicio) {
        this.Campeonato_fecha_inicio = Campeonato_fecha_inicio;
    }

    public String getCampeonato_fecha_final() {
        return Campeonato_fecha_final;
    }

    public void setCampeonato_fecha_final(String Campeonato_fecha_final) {
        this.Campeonato_fecha_final = Campeonato_fecha_final;
    }
    
    
}
