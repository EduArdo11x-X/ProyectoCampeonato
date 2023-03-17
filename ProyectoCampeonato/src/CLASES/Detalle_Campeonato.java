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
public class Detalle_Campeonato {

    private String Id_detalle_campeonato;
    private String campeonato_id;
    private String Id_categoria;

    public Detalle_Campeonato(String Id_detalle_campeonato, String campeonato_id, String Id_categoria) {
        this.Id_detalle_campeonato = Id_detalle_campeonato;
        this.campeonato_id = campeonato_id;
        this.Id_categoria = Id_categoria;
    }
    
    

    /**
     * @return the Id_detalle_campeonato
     */
    public String getId_detalle_campeonato() {
        return Id_detalle_campeonato;
    }

    /**
     * @param Id_detalle_campeonato the Id_detalle_campeonato to set
     */
    public void setId_detalle_campeonato(String Id_detalle_campeonato) {
        this.Id_detalle_campeonato = Id_detalle_campeonato;
    }

    /**
     * @return the campeonato_id
     */
    public String getCampeonato_id() {
        return campeonato_id;
    }

    /**
     * @param campeonato_id the campeonato_id to set
     */
    public void setCampeonato_id(String campeonato_id) {
        this.campeonato_id = campeonato_id;
    }

    /**
     * @return the Id_categoria
     */
    public String getId_categoria() {
        return Id_categoria;
    }

    /**
     * @param Id_categoria the Id_categoria to set
     */
    public void setId_categoria(String Id_categoria) {
        this.Id_categoria = Id_categoria;
    }

    @Override
    public String toString() {
        return "Detalle_Campeonato{" + "Id_detalle_campeonato=" + Id_detalle_campeonato + ", campeonato_id=" + campeonato_id + ", Id_categoria=" + Id_categoria + '}';
    }
    
    

}
