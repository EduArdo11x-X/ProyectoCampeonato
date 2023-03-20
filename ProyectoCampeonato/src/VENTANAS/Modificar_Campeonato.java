/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VENTANAS;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author user
 */
public class Modificar_Campeonato extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_Campeonato
     */
    public Modificar_Campeonato() {
        initComponents();
        btguardar_camp.setEnabled(false);

    }
    
    public void validar() {

        //NOMBRE
        if (txtnombre_camp.getText().isEmpty()) {
            requerido2.setText("*");
            requerido2.setForeground(Color.RED);
        } else if (!txtnombre_camp.getText().matches("[[A-Za-z]\\s]*{3,30}")) {
            requerido2.setText("*");
            requerido2.setForeground(Color.RED);
        } else {
            requerido2.setText("✔");
            requerido2.setForeground(Color.GREEN);
        }

        //FECHAINICIO
        Date selecionfechainicio=fechainicio_camp.getDate();
        if (selecionfechainicio== null) {
            requerido3.setText("*");
            requerido3.setForeground(Color.RED);
        } else {
            requerido3.setText("✔");
            requerido3.setForeground(Color.GREEN);
        }
        //FECHAFINAL
        Date selecionfechafinal=fechafinal_camp.getDate();
        if (selecionfechafinal == null) {
            requerido4.setText("*");
            requerido4.setForeground(Color.RED);
        } else {
            requerido4.setText("✔");
            requerido4.setForeground(Color.GREEN);
        }

        //GUARDARBUTON
        if (txtnombre_camp.getText().isEmpty()
                || requerido2.getText().equals("*")
                || selecionfechainicio == null
                || requerido3.getText().equals("*")
                || selecionfechafinal == null
                || requerido4.getText().equals("*")) {
            btguardar_camp.setEnabled(false);
        } else {
            btguardar_camp.setEnabled(true);
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
        txtid_camp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre_camp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btguardar_camp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fechainicio_camp = new com.toedter.calendar.JDateChooser();
        fechafinal_camp = new com.toedter.calendar.JDateChooser();
        numero_equi = new javax.swing.JSpinner();
        requerido2 = new javax.swing.JLabel();
        requerido3 = new javax.swing.JLabel();
        requerido4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ftbol.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, -1, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel2.setText("ID CAMPEONATO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 372, -1, -1));

        txtid_camp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_campActionPerformed(evt);
            }
        });
        jPanel1.add(txtid_camp, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 399, 233, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/lupa (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 399, -1, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel4.setText("Nombre del Campeonato:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 441, -1, -1));

        txtnombre_camp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_campActionPerformed(evt);
            }
        });
        txtnombre_camp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombre_campKeyReleased(evt);
            }
        });
        jPanel1.add(txtnombre_camp, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 468, 233, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel5.setText("Numero de Equipos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de inicio campeonato:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel7.setText("Fecha Final del campeonato:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel8.setText("Modificar Campeonato");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 24, -1, -1));

        btguardar_camp.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        btguardar_camp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/disquete.png"))); // NOI18N
        btguardar_camp.setText("MODIFICAR");
        jPanel1.add(btguardar_camp, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 452, -1, -1));

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/izquierda.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 452, -1, -1));

        fechainicio_camp.setDateFormatString("dd/MM/yyyy");
        fechainicio_camp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechainicio_campKeyReleased(evt);
            }
        });
        jPanel1.add(fechainicio_camp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 200, -1));

        fechafinal_camp.setDateFormatString("dd/MM/yyyy");
        fechafinal_camp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechafinal_campKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechafinal_campKeyTyped(evt);
            }
        });
        jPanel1.add(fechafinal_camp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 200, -1));

        numero_equi.setModel(new javax.swing.SpinnerNumberModel(4, 4, 20, 1));
        jPanel1.add(numero_equi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        requerido2.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 80, 20));

        requerido3.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 80, 20));

        requerido4.setFont(new java.awt.Font("Copperplate", 1, 13)); // NOI18N
        requerido4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(requerido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtid_campActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_campActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_campActionPerformed

    private void txtnombre_campActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_campActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_campActionPerformed

    private void fechainicio_campKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechainicio_campKeyReleased
        validar();        // TODO add your handling code here:
    }//GEN-LAST:event_fechainicio_campKeyReleased

    private void fechafinal_campKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechafinal_campKeyReleased
        validar();        // TODO add your handling code here:
    }//GEN-LAST:event_fechafinal_campKeyReleased

    private void fechafinal_campKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechafinal_campKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fechafinal_campKeyTyped

    private void txtnombre_campKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre_campKeyReleased
validar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_campKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
        MenuPrincipal vsar100= new MenuPrincipal();
            vsar100.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btguardar_camp;
    private com.toedter.calendar.JDateChooser fechafinal_camp;
    private com.toedter.calendar.JDateChooser fechainicio_camp;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner numero_equi;
    private javax.swing.JLabel requerido2;
    private javax.swing.JLabel requerido3;
    private javax.swing.JLabel requerido4;
    private javax.swing.JTextField txtid_camp;
    private javax.swing.JTextField txtnombre_camp;
    // End of variables declaration//GEN-END:variables
}
