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
public class Cancha extends Direccion {

    String Id_Cancha;
    String Nom_Cancha;
    String Cap_Cancha;

    public Cancha(String Id_Cancha, String Nom_Cancha, String Cap_Cancha, String Id_direccion, String Calle_Principal, String Calle_Secundaria) {
        super(Id_direccion, Calle_Principal, Calle_Secundaria);
        this.Id_Cancha = Id_Cancha;
        this.Nom_Cancha = Nom_Cancha;
        this.Cap_Cancha = Cap_Cancha;
    }

    public String getId_Cancha() {
        return Id_Cancha;
    }

    public void setId_Cancha(String Id_Cancha) {
        this.Id_Cancha = Id_Cancha;
    }

    public String getNom_Cancha() {
        return Nom_Cancha;
    }

    public void setNom_Cancha(String Nom_Cancha) {
        this.Nom_Cancha = Nom_Cancha;
    }

    public String getCap_Cancha() {
        return Cap_Cancha;
    }

    public void setCap_Cancha(String Cap_Cancha) {
        this.Cap_Cancha = Cap_Cancha;
    }

    @Override
    public String toString() {
        return "Cancha{" + "Id_Cancha=" + Id_Cancha + ", Nom_Cancha=" + Nom_Cancha + ", Cap_Cancha=" + Cap_Cancha + '}';
    }

}
