/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.reserva;

import java.awt.Color;
import javax.swing.JOptionPane;


public class PanelIngresoAdmin extends javax.swing.JPanel {

  
    public PanelIngresoAdmin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIngresoAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        IngresoAdmin = new javax.swing.JPanel();
        IngresoAdminTxt = new javax.swing.JLabel();

        jPanelIngresoAdmin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre de Usuario");

        jTextFieldNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo de Seguridad");

        IngresoAdmin.setBackground(new java.awt.Color(153, 153, 153));

        IngresoAdminTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        IngresoAdminTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IngresoAdminTxt.setText("Ingresar");
        IngresoAdminTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresoAdminTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresoAdminTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresoAdminTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout IngresoAdminLayout = new javax.swing.GroupLayout(IngresoAdmin);
        IngresoAdmin.setLayout(IngresoAdminLayout);
        IngresoAdminLayout.setHorizontalGroup(
            IngresoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngresoAdminTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );
        IngresoAdminLayout.setVerticalGroup(
            IngresoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngresoAdminTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelIngresoAdminLayout = new javax.swing.GroupLayout(jPanelIngresoAdmin);
        jPanelIngresoAdmin.setLayout(jPanelIngresoAdminLayout);
        jPanelIngresoAdminLayout.setHorizontalGroup(
            jPanelIngresoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresoAdminLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(jPanelIngresoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombreUsuario)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngresoAdminLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addGroup(jPanelIngresoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngresoAdminLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngresoAdminLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngresoAdminLayout.createSequentialGroup()
                        .addComponent(IngresoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273))))
        );
        jPanelIngresoAdminLayout.setVerticalGroup(
            jPanelIngresoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresoAdminLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(IngresoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIngresoAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIngresoAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IngresoAdminTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoAdminTxtMouseEntered
        IngresoAdmin.setBackground(new Color(51,102,255));
        IngresoAdminTxt.setForeground(Color.white);

    }//GEN-LAST:event_IngresoAdminTxtMouseEntered

    private void IngresoAdminTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoAdminTxtMouseExited
        IngresoAdmin.setBackground(new Color (153,153,153));
        IngresoAdminTxt.setForeground(Color.black);
    }//GEN-LAST:event_IngresoAdminTxtMouseExited

    private void IngresoAdminTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoAdminTxtMouseClicked
       if (jTextFieldNombreUsuario.getText().isEmpty()||jPasswordField.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null, "complete los espacios en blanco");
           jTextFieldNombreUsuario.setText("");
           jPasswordField.setText("");
       }
       if (jTextFieldNombreUsuario.getText().equals("almamarcelasilvadealegria")&& jPasswordField.getText().equals("contraseña")){
            this.setVisible(false);
            PanelAdministrador pa = new PanelAdministrador();
            pa.setVisible(true);
           
       }
       else{
           JOptionPane.showMessageDialog(null, "datos incorrectos");
           jTextFieldNombreUsuario.setText("");
           jPasswordField.setText("");
       }
    }//GEN-LAST:event_IngresoAdminTxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IngresoAdmin;
    private javax.swing.JLabel IngresoAdminTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelIngresoAdmin;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
