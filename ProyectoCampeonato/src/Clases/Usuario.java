/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PC01
 */
public class Usuario {
    
    private String Id_Usuario;
    private String Correo_Usuario;
    private String Contraseña_Usuario;
    private String Cedula_per;
    private String Campeonato_id;

    public Usuario(String Id_Usuario, String Correo_Usuario, String Contraseña_Usuario, String Cedula_per, String Campeonato_id) {
        this.Id_Usuario = Id_Usuario;
        this.Correo_Usuario = Correo_Usuario;
        this.Contraseña_Usuario = Contraseña_Usuario;
        this.Cedula_per = Cedula_per;
        this.Campeonato_id = Campeonato_id;
    }

    public Usuario() {
    }

    public String getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(String Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getCorreo_Usuario() {
        return Correo_Usuario;
    }

    public void setCorreo_Usuario(String Correo_Usuario) {
        this.Correo_Usuario = Correo_Usuario;
    }

    public String getContraseña_Usuario() {
        return Contraseña_Usuario;
    }

    public void setContraseña_Usuario(String Contraseña_Usuario) {
        this.Contraseña_Usuario = Contraseña_Usuario;
    }

    public String getCedula_per() {
        return Cedula_per;
    }

    public void setCedula_per(String Cedula_per) {
        this.Cedula_per = Cedula_per;
    }

    public String getCampeonato_id() {
        return Campeonato_id;
    }

    public void setCampeonato_id(String Campeonato_id) {
        this.Campeonato_id = Campeonato_id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Id_Usuario=" + Id_Usuario + ", Correo_Usuario=" + Correo_Usuario + ", Contrase\u00f1a_Usuario=" + Contraseña_Usuario + ", Cedula_per=" + Cedula_per + ", Campeonato_id=" + Campeonato_id + '}';
    }
    
    
    
}
