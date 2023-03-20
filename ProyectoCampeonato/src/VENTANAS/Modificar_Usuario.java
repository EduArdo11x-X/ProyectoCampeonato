/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VENTANAS;

import java.awt.Color;

/**
 *
 * @author user
 */
public class Modificar_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_Usuario
     */
    public Modificar_Usuario() { 
        initComponents();
        setSize(900, 650);
        btregistrar_usu.setEnabled(false);
    }

    public void validar() {

        //------PRIMERNOM

        if (txtprimernombre_usu.getText().isEmpty()) {
            requerido2.setText("*");
            requerido2.setForeground(Color.RED);

        } else if (!txtprimernombre_usu.getText().matches("[[A-Za-z]\\s]*{3,30}")) {
            requerido2.setText("*");
            requerido2.setForeground(Color.RED);

        } else {
            requerido2.setText("✔");
            requerido2.setForeground(Color.GREEN);

        }

        //-----PRIMERAPELLIDO
        if (txtprimerapellido_usu.getText().isEmpty()) {
            requerido3.setText("*");
            requerido3.setForeground(Color.RED);

        } else if (!txtprimerapellido_usu.getText().matches("[[A-Za-z]\\s]*{3,30}")) {
            requerido3.setText("*");
            requerido3.setForeground(Color.RED);

        } else {
            requerido3.setText("✔");
            requerido3.setForeground(Color.GREEN);

        }

        

        //-------TELEFONO
        if (txttelefono_usu.getText().isEmpty()) {
            requerido7.setText("*");
            requerido7.setForeground(Color.RED);

        } else if (!txttelefono_usu.getText().matches("[0-9]{10}")) {
            requerido7.setText("*");
            requerido7.setForeground(Color.RED);

        } else {
            requerido7.setText("✔");
            requerido7.setForeground(Color.GREEN);

        }

        //-------nacionalidad
        if (txtnacionalidad_usu.getText().isEmpty()) {
            requerido8.setText("*");
            requerido8.setForeground(Color.RED);

        } else {
            requerido8.setText("✔");
            requerido8.setForeground(Color.GREEN);

        }

        //-------EMAIL
        if (txtemail_usu.getText().isEmpty()) {
            requerido9.setText("*");
            requerido9.setForeground(Color.RED);

        } else if (!txtemail_usu.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{1,30})$")) {
            requerido9.setText("*");
            requerido9.setForeground(Color.RED);

        } else {
            requerido9.setText("✔");
            requerido9.setForeground(Color.GREEN);

        }

        //-------IDUSUARIO
        if (txtid_usu.getText().isEmpty()) {
            requerido10.setText("*");
            requerido10.setForeground(Color.RED);

        } else if (!txtid_usu.getText().matches("[[A-Z]{2}]*+\\-[[\\d]{4}]*")) {
            requerido10.setText("*");
            requerido10.setForeground(Color.RED);

        } else {
            requerido10.setText("✔");
            requerido10.setForeground(Color.GREEN);

        }

        //-------PASSWORD
        if (txtpassword_usu.getText().isEmpty()) {
            requerido11.setText("*");
            requerido11.setForeground(Color.RED);

        } else if (!txtpassword_usu.getText().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")) {
            requerido11.setText("*");
            requerido11.setForeground(Color.RED);

        } else {
            requerido11.setText("✔");
            requerido11.setForeground(Color.GREEN);

        }
        //CONFIRMAR PASSWORD

        if (txtcc_usu.getText().isEmpty()) {
            requerido.setText("*");
            requerido.setForeground(Color.RED);

        } else if (!txtcc_usu.getText().equals(txtpassword_usu.getText())) {
            requerido.setText("*");
            requerido.setForeground(Color.RED);

        } else {
            requerido.setText("✔");
            requerido.setForeground(Color.GREEN);

        }

        if (
                txtprimernombre_usu.getText().isEmpty() || requerido2.getText().equals("*")
                || txtprimerapellido_usu.getText().isEmpty() || requerido3.getText().equals("*")
                || txttelefono_usu.getText().isEmpty() || requerido6.getText().equals("*")
                || txtnacionalidad_usu.getText().isEmpty() || requerido7.getText().equals("*")
                || txtemail_usu.getText().isEmpty() || requerido8.getText().equals("*")
                || txtid_usu.getText().isEmpty() || requerido9.getText().equals("*")
                || txtpassword_usu.getText().isEmpty() || requerido10.getText().equals("*")
                || txtcedula_usu.getText().isEmpty() || requerido11.getText().equals("*")) {
            btregistrar_usu.setEnabled(false);
        } else {
            btregistrar_usu.setEnabled(true);
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
        txtcedula_usu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprimernombre_usu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsegundonombre_usu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprimerapellido_usu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtsegundoapellido_usu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genero_usu = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txttelefono_usu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtid_usu = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtemail_usu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtpassword_usu = new javax.swing.JTextField();
        btregistrar_usu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        requerido2 = new javax.swing.JLabel();
        requerido3 = new javax.swing.JLabel();
        txtnacionalidad_usu = new javax.swing.JTextField();
        requerido5 = new javax.swing.JLabel();
        requerido6 = new javax.swing.JLabel();
        requerido7 = new javax.swing.JLabel();
        requerido8 = new javax.swing.JLabel();
        requerido9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtcc_usu = new javax.swing.JPasswordField();
        requerido = new javax.swing.JLabel();
        txtedad_usu = new javax.swing.JSpinner();
        requerido10 = new javax.swing.JLabel();
        requerido11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 6, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/usuario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 54, -1, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel3.setText("Cedula del Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 59, -1, -1));
        jPanel1.add(txtcedula_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 170, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/lupa (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel5.setText("Primer nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 96, -1, -1));

        txtprimernombre_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprimernombre_usuKeyReleased(evt);
            }
        });
        jPanel1.add(txtprimernombre_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 170, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel6.setText("Segundo nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 147, -1, -1));
        jPanel1.add(txtsegundonombre_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 170, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel7.setText("Primer apellido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 189, -1, -1));

        txtprimerapellido_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprimerapellido_usuKeyReleased(evt);
            }
        });
        jPanel1.add(txtprimerapellido_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 170, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel8.setText("Segundo apellido: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 230, -1, -1));
        jPanel1.add(txtsegundoapellido_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 170, -1));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel9.setText("Genero:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 273, -1, -1));

        genero_usu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(genero_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel10.setText("Edad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel11.setText("Nacionalidad:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel12.setText("Telefono:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        txttelefono_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefono_usuKeyReleased(evt);
            }
        });
        jPanel1.add(txttelefono_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 170, -1));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel13.setText("Id Usuario:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        txtid_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtid_usuKeyReleased(evt);
            }
        });
        jPanel1.add(txtid_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 170, -1));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel14.setText("Correo Electronico:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        txtemail_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemail_usuKeyReleased(evt);
            }
        });
        jPanel1.add(txtemail_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 170, -1));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel15.setText("Contraseña:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, -1));

        txtpassword_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassword_usuKeyReleased(evt);
            }
        });
        jPanel1.add(txtpassword_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 170, -1));

        btregistrar_usu.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        btregistrar_usu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/disquete.png"))); // NOI18N
        btregistrar_usu.setText("Guardar");
        btregistrar_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregistrar_usuActionPerformed(evt);
            }
        });
        jPanel1.add(btregistrar_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, -1, -1));

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/izquierda.png"))); // NOI18N
        jButton2.setText("Regresar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, -1, -1));

        requerido2.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 80, 20));

        requerido3.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 80, 20));

        txtnacionalidad_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnacionalidad_usuKeyReleased(evt);
            }
        });
        jPanel1.add(txtnacionalidad_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 170, -1));

        requerido5.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 80, 20));

        requerido6.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido6.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 80, 20));

        requerido7.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido7.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 80, 20));

        requerido8.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido8.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 80, 20));

        requerido9.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido9.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 80, 20));

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel16.setText("CONF CONTRASEÑA :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        txtcc_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcc_usuKeyReleased(evt);
            }
        });
        jPanel1.add(txtcc_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 170, -1));

        requerido.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 80, 20));

        txtedad_usu.setModel(new javax.swing.SpinnerNumberModel(18, 18, 40, 1));
        jPanel1.add(txtedad_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        requerido10.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido10.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 80, 20));

        requerido11.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido11.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btregistrar_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregistrar_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btregistrar_usuActionPerformed

    private void txtcc_usuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcc_usuKeyReleased
        validar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtcc_usuKeyReleased

    private void txtprimernombre_usuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimernombre_usuKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtprimernombre_usuKeyReleased

    private void txtprimerapellido_usuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerapellido_usuKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtprimerapellido_usuKeyReleased

    private void txtnacionalidad_usuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnacionalidad_usuKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnacionalidad_usuKeyReleased

    private void txttelefono_usuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefono_usuKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefono_usuKeyReleased

    private void txtid_usuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtid_usuKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_usuKeyReleased

    private void txtemail_usuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemail_usuKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtemail_usuKeyReleased

    private void txtpassword_usuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassword_usuKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassword_usuKeyReleased

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
            java.util.logging.Logger.getLogger(Modificar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btregistrar_usu;
    private javax.swing.JComboBox<String> genero_usu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel requerido;
    private javax.swing.JLabel requerido10;
    private javax.swing.JLabel requerido11;
    private javax.swing.JLabel requerido2;
    private javax.swing.JLabel requerido3;
    private javax.swing.JLabel requerido5;
    private javax.swing.JLabel requerido6;
    private javax.swing.JLabel requerido7;
    private javax.swing.JLabel requerido8;
    private javax.swing.JLabel requerido9;
    private javax.swing.JPasswordField txtcc_usu;
    private javax.swing.JTextField txtcedula_usu;
    private javax.swing.JSpinner txtedad_usu;
    private javax.swing.JTextField txtemail_usu;
    private javax.swing.JTextField txtid_usu;
    private javax.swing.JTextField txtnacionalidad_usu;
    private javax.swing.JTextField txtpassword_usu;
    private javax.swing.JTextField txtprimerapellido_usu;
    private javax.swing.JTextField txtprimernombre_usu;
    private javax.swing.JTextField txtsegundoapellido_usu;
    private javax.swing.JTextField txtsegundonombre_usu;
    private javax.swing.JTextField txttelefono_usu;
    // End of variables declaration//GEN-END:variables
}
