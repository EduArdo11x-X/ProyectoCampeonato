/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VENTANAS;

/**
 *
 * @author EDU
 */
public class Modificar_equipo extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_equipo
     */
    public Modificar_equipo() {
        initComponents();
        modificar_equipo.setEnabled(false);
        
        String nombre_fundador="";
    }
    
    public void validar(){
        
         
        String resultado;
        if(id_entrenador.getText().isEmpty()){
            requerido.setText("*Campo Obligatorio");
        }else{
            
            requerido.setText("");
       
        }
       
        if(nombre_fundador.getText().isEmpty()){
            requerido2.setText("*Campo Obligatorio");  
        }else if(!nombre_fundador.getText().matches("[[A-Za-z]\\s]*{3,30}")) {
            requerido2.setText("Dato no valido");
        }else{
          requerido2.setText(" ");

        }
        
        
        
        
        if(numero_jugadores.getText().isEmpty()){
            requerido3.setText("*Campo Obligatorio");
            
        }else if(!numero_jugadores.getText().matches("^(6|7|8|9|10|11|12|13|14|15)$")){
            requerido3.setText("Dato no valido");

        }else
        {
            requerido3.setText("");
        }
        
        
        
        if(id_entrenador.getText().isEmpty() || nombre_fundador.getText().isEmpty() || numero_jugadores.getText().isEmpty()|| requerido2.getText().equals("Dato no valido")
                || requerido3.getText().equals("Dato no valido")){
            modificar_equipo.setEnabled(false);
        }else{
            modificar_equipo.setEnabled(true);
        }
        
       
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_equipo = new javax.swing.JTextField();
        id_entrenador = new javax.swing.JTextField();
        numero_jugadores = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        requerido3 = new javax.swing.JLabel();
        requerido = new javax.swing.JLabel();
        requerido2 = new javax.swing.JLabel();
        modificar_equipo = new javax.swing.JButton();
        nombre_fundador = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MODIFICAR EQUIPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate", 1, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Equipo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 62, -1, -1));

        jLabel2.setText("ID Entrenador:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 104, -1, -1));

        jLabel3.setText("Nombre Fundador del equipo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 146, -1, -1));

        jLabel4.setText("Año de creacion de equipo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 179, -1, -1));

        jLabel5.setText("Numero de jugadores del Equipo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 223, -1, -1));
        jPanel1.add(id_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 54, 120, -1));

        id_entrenador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                id_entrenadorKeyReleased(evt);
            }
        });
        jPanel1.add(id_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 96, 120, -1));

        numero_jugadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numero_jugadoresKeyReleased(evt);
            }
        });
        jPanel1.add(numero_jugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 120, -1));

        jLabel6.setText("Ingrese por favor el ID del equipo a modificar:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 34, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/lupa (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 30, 30));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 100, -1));

        requerido3.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 190, 20));

        requerido.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 180, 20));

        requerido2.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 180, 20));

        modificar_equipo.setText("MODIFICAR");
        jPanel1.add(modificar_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        nombre_fundador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_fundadorActionPerformed(evt);
            }
        });
        nombre_fundador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombre_fundadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_fundadorKeyTyped(evt);
            }
        });
        jPanel1.add(nombre_fundador, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 120, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/lupa (1).png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 30, 30));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 130, -1));

        jButton1.setText("Cancelar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 273, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_entrenadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_entrenadorKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_id_entrenadorKeyReleased

    private void numero_jugadoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero_jugadoresKeyReleased
        validar();        // TODO add your handling code here:
    }//GEN-LAST:event_numero_jugadoresKeyReleased

    private void nombre_fundadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_fundadorKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_fundadorKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nombre_fundadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_fundadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_fundadorActionPerformed

    private void nombre_fundadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_fundadorKeyTyped
        
        char aux = evt.getKeyChar();
        boolean ced =aux >=48 && aux <58;
        boolean ret = aux ==8;
        boolean ent =aux == 13;
        
        if(ced == false && ret == false && ent == false){
            System.out.println(evt.getKeyChar());
            evt.consume();
        } else if (nombre_fundador.getText().length()>9){
        evt.consume();;
        
        
        
    }
        
        
        
        
        
        
    }//GEN-LAST:event_nombre_fundadorKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modificar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_equipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_entrenador;
    private javax.swing.JTextField id_equipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar_equipo;
    private javax.swing.JTextField nombre_fundador;
    private javax.swing.JTextField numero_jugadores;
    private javax.swing.JLabel requerido;
    private javax.swing.JLabel requerido2;
    private javax.swing.JLabel requerido3;
    // End of variables declaration//GEN-END:variables
}
