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
public class Direccion {

    private String Id_direccion;
    private String Calle_Principal;
    private String Calle_Secundaria;

    public Direccion(String Id_direccion, String Calle_Principal, String Calle_Secundaria) {
        this.Id_direccion = Id_direccion;
        this.Calle_Principal = Calle_Principal;
        this.Calle_Secundaria = Calle_Secundaria;
    }

    /**
     * @return the Id_direccion
     */
    public String getId_direccion() {
        return Id_direccion;
    }

    /**
     * @param Id_direccion the Id_direccion to set
     */
    public void setId_direccion(String Id_direccion) {
        this.Id_direccion = Id_direccion;
    }

    /**
     * @return the Calle_Principal
     */
    public String getCalle_Principal() {
        return Calle_Principal;
    }

    /**
     * @param Calle_Principal the Calle_Principal to set
     */
    public void setCalle_Principal(String Calle_Principal) {
        this.Calle_Principal = Calle_Principal;
    }

    /**
     * @return the Calle_Secundaria
     */
    public String getCalle_Secundaria() {
        return Calle_Secundaria;
    }

    /**
     * @param Calle_Secundaria the Calle_Secundaria to set
     */
    public void setCalle_Secundaria(String Calle_Secundaria) {
        this.Calle_Secundaria = Calle_Secundaria;
    }

    @Override
    public String toString() {
        return "Direccion{" + "Id_direccion=" + Id_direccion + ", Calle_Principal=" + Calle_Principal + ", Calle_Secundaria=" + Calle_Secundaria + '}';
    }

}
