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
    private String detalle_campeonato_id;
    private String detalle_id_categoria;

    public Detalle_Campeonato(String Id_detalle_campeonato, String detalle_campeonato_id, String detalle_id_categoria) {
        this.Id_detalle_campeonato = Id_detalle_campeonato;
        this.detalle_campeonato_id = detalle_campeonato_id;
        this.detalle_id_categoria = detalle_id_categoria;
    }

    public Detalle_Campeonato() {
    }

    public String getId_detalle_campeonato() {
        return Id_detalle_campeonato;
    }

    public void setId_detalle_campeonato(String Id_detalle_campeonato) {
        this.Id_detalle_campeonato = Id_detalle_campeonato;
    }

    public String getDetalle_campeonato_id() {
        return detalle_campeonato_id;
    }

    public void setDetalle_campeonato_id(String detalle_campeonato_id) {
        this.detalle_campeonato_id = detalle_campeonato_id;
    }

    public String getDetalle_id_categoria() {
        return detalle_id_categoria;
    }

    public void setDetalle_id_categoria(String detalle_id_categoria) {
        this.detalle_id_categoria = detalle_id_categoria;
    }

    @Override
    public String toString() {
        return "Detalle_Campeonato{" + "Id_detalle_campeonato=" + Id_detalle_campeonato + ", detalle_campeonato_id=" + detalle_campeonato_id + ", detalle_id_categoria=" + detalle_id_categoria + '}';
    }

   
    

}
