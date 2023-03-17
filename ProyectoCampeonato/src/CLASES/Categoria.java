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
    private String Nombre_Categoria;
    private String Descripcion_categoria;

    public Categoria(String Id_Categoria, String Nombre_Categoria, String Descripcion_categoria) {
        this.Id_Categoria = Id_Categoria;
        this.Nombre_Categoria = Nombre_Categoria;
        this.Descripcion_categoria = Descripcion_categoria;
    }
   
    /**
     * @return the Id_Categoria
     */
    public String getId_Categoria() {
        return Id_Categoria;
    }

    /**
     * @param Id_Categoria the Id_Categoria to set
     */
    public void setId_Categoria(String Id_Categoria) {
        this.Id_Categoria = Id_Categoria;
    }

    /**
     * @return the Nombre_Categoria
     */
    public String getNombre_Categoria() {
        return Nombre_Categoria;
    }

    /**
     * @param Nombre_Categoria the Nombre_Categoria to set
     */
    public void setNombre_Categoria(String Nombre_Categoria) {
        this.Nombre_Categoria = Nombre_Categoria;
    }

    /**
     * @return the Descripcion_categoria
     */
    public String getDescripcion_categoria() {
        return Descripcion_categoria;
    }

    /**
     * @param Descripcion_categoria the Descripcion_categoria to set
     */
    public void setDescripcion_categoria(String Descripcion_categoria) {
        this.Descripcion_categoria = Descripcion_categoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "Id_Categoria=" + Id_Categoria + ", Nombre_Categoria=" + Nombre_Categoria + ", Descripcion_categoria=" + Descripcion_categoria + '}';
    }
    
    

}
