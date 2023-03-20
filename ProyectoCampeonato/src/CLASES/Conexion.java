/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;


    




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    Connection conexion = null;
    String pass = "1234";
    String user = "postgres";
    
    public void Conectarme(){
        try{
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5433/ProyectoCampeonato",user,pass);
            JOptionPane.showMessageDialog(null,"GRABADO");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
            
    }
    }
    public void Ingreso(String script ){
        PreparedStatement p=null;
        Conectarme();
        try{
            p=conexion.prepareStatement(script);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ejecucion completa");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
}
    