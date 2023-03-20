/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

import java.util.Date;

/**
 *
 * @author user
 */
public class Fecha_partido {
    
    private String id_fecha;
    private Date fecha;

    public Fecha_partido(String id_fecha, Date fecha) {
        this.id_fecha = id_fecha;
        this.fecha = fecha;
    }

    public Fecha_partido() {
    }

    public String getId_fecha() {
        return id_fecha;
    }

    public void setId_fecha(String id_fecha) {
        this.id_fecha = id_fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Fecha_partido{" + "id_fecha=" + id_fecha + ", fecha=" + fecha + '}';
    }
    
    
}