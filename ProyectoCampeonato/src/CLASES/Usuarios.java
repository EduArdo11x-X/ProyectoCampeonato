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
public class Usuarios {
    
    private String Id_Usuario;
    private String usuario_cedula_per;
    private String usuario_campeonato_id;
     String Correo_Usuario;
     String contraseña_usuario;

    public Usuarios(String Id_Usuario, String usuario_cedula_per, String usuario_campeonato_id, String Correo_Usuario, String contraseña_usuario) {
        this.Id_Usuario = Id_Usuario;
        this.usuario_cedula_per = usuario_cedula_per;
        this.usuario_campeonato_id = usuario_campeonato_id;
        this.Correo_Usuario = Correo_Usuario;
        this.contraseña_usuario = contraseña_usuario;
    }

    public Usuarios() {
    }

    public String getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(String Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getCedula_per() {
        return usuario_cedula_per;
    }

    public void setCedula_per(String cedula_per) {
        this.usuario_cedula_per = cedula_per;
    }

    public String getCampeonato_id() {
        return usuario_campeonato_id;
    }

    public void setCampeonato_id(String Campeonato_id) {
        this.usuario_campeonato_id = Campeonato_id;
    }

    public String getCorreo_Usuario() {
        return Correo_Usuario;
    }

    public void setCorreo_Usuario(String Correo_Usuario) {
        this.Correo_Usuario = Correo_Usuario;
    }

    public String getContraseña_usuario() {
        return contraseña_usuario;
    }

    public void setContraseña_usuario(String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Id_Usuario=" + Id_Usuario + ", cedula_per=" + usuario_cedula_per + ", Campeonato_id=" + usuario_campeonato_id + ", Correo_Usuario=" + Correo_Usuario + ", contrase\u00f1a_usuario=" + contraseña_usuario + '}';
    }
    
    
   
    
}
