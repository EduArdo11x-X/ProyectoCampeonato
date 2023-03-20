/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocampeonato;
import CLASES.Conexion;
import VENTANAS.LoginUsuario;
import VENTANAS.MenuPrincipal;
/**
 *
 * @author PC01
 */
public class ProyectoCampeonato {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         LoginUsuario mostrarInicio = new LoginUsuario();
   mostrarInicio.setVisible(true);
    
        
     Conexion bd = new Conexion();
     bd.Conectarme();

    }
    
}
