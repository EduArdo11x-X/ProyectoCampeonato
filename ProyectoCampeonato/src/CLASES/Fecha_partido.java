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
public class Fecha_partido {
    
    private String id_fecha;
    private int dia;
    private String mes;
    private int año;

    public Fecha_partido(String id_fecha, int dia, String mes, int año) {
        this.id_fecha = id_fecha;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha_partido() {
    }

    public String getId_fecha() {
        return id_fecha;
    }

    public void setId_fecha(String id_fecha) {
        this.id_fecha = id_fecha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Fecha_partido{" + "id_fecha=" + id_fecha + ", dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
    
    
    
}
