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
public class Categoria {

    private String Id_Categoria;
    private String Id_equipo;
    private String Nombre_Categoria;
    private String Descripcion_categoria;

    public Categoria(String Id_Categoria, String Id_equipo, String Nombre_Categoria, String Descripcion_categoria) {
        this.Id_Categoria = Id_Categoria;
        this.Id_equipo = Id_equipo;
        this.Nombre_Categoria = Nombre_Categoria;
        this.Descripcion_categoria = Descripcion_categoria;
    }

    public Categoria() {
    }

    public String getId_Categoria() {
        return Id_Categoria;
    }

    public void setId_Categoria(String Id_Categoria) {
        this.Id_Categoria = Id_Categoria;
    }

    public String getId_equipo() {
        return Id_equipo;
    }

    public void setId_equipo(String Id_equipo) {
        this.Id_equipo = Id_equipo;
    }

    public String getNombre_Categoria() {
        return Nombre_Categoria;
    }

    public void setNombre_Categoria(String Nombre_Categoria) {
        this.Nombre_Categoria = Nombre_Categoria;
    }

    public String getDescripcion_categoria() {
        return Descripcion_categoria;
    }

    public void setDescripcion_categoria(String Descripcion_categoria) {
        this.Descripcion_categoria = Descripcion_categoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "Id_Categoria=" + Id_Categoria + ", Id_equipo=" + Id_equipo + ", Nombre_Categoria=" + Nombre_Categoria + ", Descripcion_categoria=" + Descripcion_categoria + '}';
    }


    

}
