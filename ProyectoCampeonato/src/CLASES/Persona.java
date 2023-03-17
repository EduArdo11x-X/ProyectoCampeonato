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
public class Persona {
    private String cedula_per;
    private String Primer_nombre;
    private String Segundo_nombre;
    private String Primer_apellido;
    private String Segunda_Apellido;
    private String edad;
    private String telefono;

    public Persona(String cedula_per, String Primer_nombre, String Segundo_nombre, String Primer_apellido, String Segunda_Apellido, String edad, String telefono) {
        this.cedula_per = cedula_per;
        this.Primer_nombre = Primer_nombre;
        this.Segundo_nombre = Segundo_nombre;
        this.Primer_apellido = Primer_apellido;
        this.Segunda_Apellido = Segunda_Apellido;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Persona() {
    }

    public String getCedula_per() {
        return cedula_per;
    }

    public void setCedula_per(String cedula_per) {
        this.cedula_per = cedula_per;
    }

    public String getPrimer_nombre() {
        return Primer_nombre;
    }

    public void setPrimer_nombre(String Primer_nombre) {
        this.Primer_nombre = Primer_nombre;
    }

    public String getSegundo_nombre() {
        return Segundo_nombre;
    }

    public void setSegundo_nombre(String Segundo_nombre) {
        this.Segundo_nombre = Segundo_nombre;
    }

    public String getPrimer_apellido() {
        return Primer_apellido;
    }

    public void setPrimer_apellido(String Primer_apellido) {
        this.Primer_apellido = Primer_apellido;
    }

    public String getSegunda_Apellido() {
        return Segunda_Apellido;
    }

    public void setSegunda_Apellido(String Segunda_Apellido) {
        this.Segunda_Apellido = Segunda_Apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula_per=" + cedula_per + ", Primer_nombre=" + Primer_nombre + ", Segundo_nombre=" + Segundo_nombre + ", Primer_apellido=" + Primer_apellido + ", Segunda_Apellido=" + Segunda_Apellido + ", edad=" + edad + ", telefono=" + telefono + '}';
    }
    
    

    
}
