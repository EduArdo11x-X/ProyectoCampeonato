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
public class Entrenador {
    private String id_entrenador;
    private String cedula_per;
    private String experiencia_entrenador;

    public Entrenador() {
    }

    public Entrenador(String id_entrenador, String cedula_per, String experiencia_entrenador) {
        this.id_entrenador = id_entrenador;
        this.cedula_per = cedula_per;
        this.experiencia_entrenador = experiencia_entrenador;
    }

    public String getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(String id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public String getCedula_per() {
        return cedula_per;
    }

    public void setCedula_per(String cedula_per) {
        this.cedula_per = cedula_per;
    }

    public String getExperiencia_entrenador() {
        return experiencia_entrenador;
    }

    public void setExperiencia_entrenador(String experiencia_entrenador) {
        this.experiencia_entrenador = experiencia_entrenador;
    }

    public String toString() {
        return "Entrenador{" + "id_entrenador=" + id_entrenador + ", cedula_per=" + cedula_per + ", experiencia_entrenador=" + experiencia_entrenador + '}';
    }
    
}
