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
public class Jugador {
    private String id_jugador;
    private String cedula_per;
    private String id_posicion;
    private String Dorsal_jugador;
    private String Peso_Jugador;
    private String altura_jugador;

    public Jugador() {
    }

    public Jugador(String id_jugador, String cedula_per, String id_posicion, String Dorsal_jugador, String Peso_Jugador, String altura_jugador) {
        this.id_jugador = id_jugador;
        this.cedula_per = cedula_per;
        this.id_posicion = id_posicion;
        this.Dorsal_jugador = Dorsal_jugador;
        this.Peso_Jugador = Peso_Jugador;
        this.altura_jugador = altura_jugador;
    }

    public String getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(String id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getCedula_per() {
        return cedula_per;
    }

    public void setCedula_per(String cedula_per) {
        this.cedula_per = cedula_per;
    }

    public String getId_posicion() {
        return id_posicion;
    }

    public void setId_posicion(String id_posicion) {
        this.id_posicion = id_posicion;
    }

    public String getDorsal_jugador() {
        return Dorsal_jugador;
    }

    public void setDorsal_jugador(String Dorsal_jugador) {
        this.Dorsal_jugador = Dorsal_jugador;
    }

    public String getPeso_Jugador() {
        return Peso_Jugador;
    }

    public void setPeso_Jugador(String Peso_Jugador) {
        this.Peso_Jugador = Peso_Jugador;
    }

    public String getAltura_jugador() {
        return altura_jugador;
    }

    public void setAltura_jugador(String altura_jugador) {
        this.altura_jugador = altura_jugador;
    }

    public String toString() {
        return "Jugador{" + "id_jugador=" + id_jugador + ", cedula_per=" + cedula_per + ", id_posicion=" + id_posicion + ", Dorsal_jugador=" + Dorsal_jugador + ", Peso_Jugador=" + Peso_Jugador + ", altura_jugador=" + altura_jugador + '}';
    }
    
}
