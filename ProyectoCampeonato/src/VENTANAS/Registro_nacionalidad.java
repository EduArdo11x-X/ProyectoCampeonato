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
public class Registro_nacionalidad extends javax.swing.JFrame {

    /**
     * Creates new form Registro_nacionalidad
     */
    public Registro_nacionalidad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        id_nacionalidad5 = new javax.swing.JTextField();
        nombre_nacionalidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registrar_nacionalidad = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        requerido1 = new javax.swing.JLabel();
        requerido2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO NACIONALIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 1, 24))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_nacionalidad5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                id_nacionalidad5KeyReleased(evt);
            }
        });
        jPanel6.add(id_nacionalidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 156, -1));

        nombre_nacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombre_nacionalidadKeyReleased(evt);
            }
        });
        jPanel6.add(nombre_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 156, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel2.setText("ID NACIONALIDAD : ");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE NACIONALIDAD : ");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        registrar_nacionalidad.setBackground(new java.awt.Color(255, 255, 255));
        registrar_nacionalidad.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        registrar_nacionalidad.setText("REGISTRAR");
        jPanel6.add(registrar_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jButton2.setText("REGRESAR ");
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        requerido1.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel6.add(requerido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 80, 20));

        requerido2.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel6.add(requerido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 80, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ciudadania1.png"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_nacionalidad5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_nacionalidad5KeyReleased
       
        // TODO add your handling code here:
    }//GEN-LAST:event_id_nacionalidad5KeyReleased

    private void nombre_nacionalidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_nacionalidadKeyReleased
           // TODO add your handling code here:
    }//GEN-LAST:event_nombre_nacionalidadKeyReleased

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
            java.util.logging.Logger.getLogger(Registro_nacionalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_nacionalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_nacionalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_nacionalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_nacionalidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_nacionalidad;
    private javax.swing.JTextField id_nacionalidad1;
    private javax.swing.JTextField id_nacionalidad2;
    private javax.swing.JTextField id_nacionalidad3;
    private javax.swing.JTextField id_nacionalidad4;
    private javax.swing.JTextField id_nacionalidad5;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField nombre_nacionalidad;
    private javax.swing.JButton registrar_nacionalidad;
    private javax.swing.JLabel requerido1;
    private javax.swing.JLabel requerido2;
    // End of variables declaration//GEN-END:variables
}
