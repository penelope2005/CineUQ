/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.reserva;

import java.awt.Color;
import java.util.ArrayList;


public class PanelStockConfiteria extends javax.swing.JPanel {

    static ArrayList<Integer>stockConfiteria;
    static ArrayList<Float>precioConfiteria;

    
    public PanelStockConfiteria() {
        initComponents();
        stockConfiteria = new ArrayList<>();
        precioConfiteria =new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCombo1 = new javax.swing.JTextField();
        jTextFieldCombo2 = new javax.swing.JTextField();
        jTextFieldCombo3 = new javax.swing.JTextField();
        jTextFieldCombo4 = new javax.swing.JTextField();
        jTextFieldCrispetasP = new javax.swing.JTextField();
        jTextFieldCrispetasM = new javax.swing.JTextField();
        jTextFieldCrispetasG = new javax.swing.JTextField();
        jTextFieldPerro = new javax.swing.JTextField();
        jTextFieldSandwich = new javax.swing.JTextField();
        jTextFieldAgua = new javax.swing.JTextField();
        jTextFieldTé = new javax.swing.JTextField();
        jTextFieldGaseosa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldCombo1P = new javax.swing.JTextField();
        jTextFieldCombo2P = new javax.swing.JTextField();
        jTextFieldCombo3P = new javax.swing.JTextField();
        jTextFieldCombo4P = new javax.swing.JTextField();
        jTextFieldCrispetasPP = new javax.swing.JTextField();
        jTextFieldMedianasP = new javax.swing.JTextField();
        jTextFieldGrandesP = new javax.swing.JTextField();
        jTextFieldPerroP = new javax.swing.JTextField();
        jTextFieldSandwichP = new javax.swing.JTextField();
        jTextFieldAguaP = new javax.swing.JTextField();
        jTextFieldTéP = new javax.swing.JTextField();
        jTextFieldGaseosaP = new javax.swing.JTextField();
        Establecer = new javax.swing.JPanel();
        EstablecerTxt = new javax.swing.JLabel();
        Borrar = new javax.swing.JPanel();
        BorrarTxt = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        titulo.setText("Escribe en los respectivos cuadros el stock disponible para cada producto de la confiteria y su valor unitario");

        descripcion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        descripcion.setText("stock y Precio Confiteria");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setText("Combo 1");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Combo 2");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Crispetas Pequeñas");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Crispetas Medianas");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("Crispetas Grandes");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("Sandwich");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setText("Agua");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("Té");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setText("Perro");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setText("Combo 3");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setText("Combo 4");

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel13.setText("Gaseosa");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Stock");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("Valor Unitario");

        Establecer.setBackground(new java.awt.Color(153, 153, 153));

        EstablecerTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EstablecerTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EstablecerTxt.setText("Establecer");
        EstablecerTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstablecerTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EstablecerTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EstablecerTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EstablecerLayout = new javax.swing.GroupLayout(Establecer);
        Establecer.setLayout(EstablecerLayout);
        EstablecerLayout.setHorizontalGroup(
            EstablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EstablecerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        EstablecerLayout.setVerticalGroup(
            EstablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EstablecerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Borrar.setBackground(new java.awt.Color(153, 153, 153));

        BorrarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        BorrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarTxt.setText("Borrar ");
        BorrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BorrarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BorrarTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorrarTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BorrarLayout = new javax.swing.GroupLayout(Borrar);
        Borrar.setLayout(BorrarLayout);
        BorrarLayout.setHorizontalGroup(
            BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BorrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BorrarLayout.setVerticalGroup(
            BorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BorrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCombo2)
                            .addComponent(jTextFieldCombo3)
                            .addComponent(jTextFieldCombo4)
                            .addComponent(jTextFieldCrispetasP)
                            .addComponent(jTextFieldCrispetasM)
                            .addComponent(jTextFieldCrispetasG)
                            .addComponent(jTextFieldPerro)
                            .addComponent(jTextFieldSandwich)
                            .addComponent(jTextFieldAgua)
                            .addComponent(jTextFieldTé)
                            .addComponent(jTextFieldGaseosa, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCombo1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCombo1P)
                                    .addComponent(jTextFieldCombo2P)
                                    .addComponent(jTextFieldCombo3P)
                                    .addComponent(jTextFieldCombo4P)
                                    .addComponent(jTextFieldCrispetasPP)
                                    .addComponent(jTextFieldMedianasP)
                                    .addComponent(jTextFieldGrandesP)
                                    .addComponent(jTextFieldPerroP)
                                    .addComponent(jTextFieldSandwichP)
                                    .addComponent(jTextFieldAguaP)
                                    .addComponent(jTextFieldTéP)
                                    .addComponent(jTextFieldGaseosaP, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Establecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(descripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCombo1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCombo2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldCombo3P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldCombo4P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldCrispetasPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldCrispetasP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldCrispetasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMedianasP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Establecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldGrandesP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCrispetasG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldPerroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldSandwichP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAguaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTéP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTé, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldGaseosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGaseosaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EstablecerTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstablecerTxtMouseExited
        Establecer.setBackground(new Color (153,153,153));
        EstablecerTxt.setForeground(Color.black);
    }//GEN-LAST:event_EstablecerTxtMouseExited

    private void EstablecerTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstablecerTxtMouseEntered
        Establecer.setBackground(new Color(51,102,255));
        EstablecerTxt.setForeground(Color.white);
    }//GEN-LAST:event_EstablecerTxtMouseEntered

    private void EstablecerTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstablecerTxtMouseClicked
        stockConfiteria.add(0, Integer.valueOf(jTextFieldCombo1.getText()));
        stockConfiteria.add(1, Integer.valueOf(jTextFieldCombo2.getText()));
        stockConfiteria.add(2, Integer.valueOf(jTextFieldCombo3.getText()));
        stockConfiteria.add(3, Integer.valueOf(jTextFieldCombo4.getText()));
        stockConfiteria.add(4, Integer.valueOf(jTextFieldCrispetasP.getText()));
        stockConfiteria.add(5, Integer.valueOf(jTextFieldCrispetasM.getText()));
        stockConfiteria.add(6, Integer.valueOf(jTextFieldCrispetasG.getText()));
        stockConfiteria.add(7, Integer.valueOf(jTextFieldPerro.getText()));
        stockConfiteria.add(8, Integer.valueOf(jTextFieldSandwich.getText()));
        stockConfiteria.add(9, Integer.valueOf(jTextFieldAgua.getText()));
        stockConfiteria.add(10, Integer.valueOf(jTextFieldTé.getText()));
        stockConfiteria.add(11, Integer.valueOf(jTextFieldGaseosa.getText()));

        precioConfiteria.add(0, Float.valueOf(jTextFieldCombo1P.getText()));
        precioConfiteria.add(1, Float.valueOf(jTextFieldCombo2P.getText()));
        precioConfiteria.add(2, Float.valueOf(jTextFieldCombo3P.getText()));
        precioConfiteria.add(3, Float.valueOf(jTextFieldCombo4P.getText()));
        precioConfiteria.add(4, Float.valueOf(jTextFieldCrispetasPP.getText()));
        precioConfiteria.add(5, Float.valueOf(jTextFieldMedianasP.getText()));
        precioConfiteria.add(6, Float.valueOf(jTextFieldGrandesP.getText()));
        precioConfiteria.add(7, Float.valueOf(jTextFieldPerroP.getText()));
        precioConfiteria.add(8, Float.valueOf(jTextFieldSandwichP.getText()));
        precioConfiteria.add(9, Float.valueOf(jTextFieldAguaP.getText()));
        precioConfiteria.add(10, Float.valueOf(jTextFieldTéP.getText()));
        precioConfiteria.add(11, Float.valueOf(jTextFieldGaseosaP.getText()));
        
        
    }//GEN-LAST:event_EstablecerTxtMouseClicked

    private void BorrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarTxtMouseEntered
       Borrar.setBackground(new Color(51,102,255));
       BorrarTxt.setForeground(Color.white);
    }//GEN-LAST:event_BorrarTxtMouseEntered

    private void BorrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarTxtMouseExited
       Borrar.setBackground(new Color (153,153,153));
       BorrarTxt.setForeground(Color.black);
    }//GEN-LAST:event_BorrarTxtMouseExited

    private void BorrarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrarTxtMousePressed

    private void BorrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarTxtMouseClicked
        stockConfiteria.clear();
        precioConfiteria.clear();
    }//GEN-LAST:event_BorrarTxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Borrar;
    private javax.swing.JLabel BorrarTxt;
    private javax.swing.JPanel Establecer;
    private javax.swing.JLabel EstablecerTxt;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldAgua;
    private javax.swing.JTextField jTextFieldAguaP;
    private javax.swing.JTextField jTextFieldCombo1;
    private javax.swing.JTextField jTextFieldCombo1P;
    private javax.swing.JTextField jTextFieldCombo2;
    private javax.swing.JTextField jTextFieldCombo2P;
    private javax.swing.JTextField jTextFieldCombo3;
    private javax.swing.JTextField jTextFieldCombo3P;
    private javax.swing.JTextField jTextFieldCombo4;
    private javax.swing.JTextField jTextFieldCombo4P;
    private javax.swing.JTextField jTextFieldCrispetasG;
    private javax.swing.JTextField jTextFieldCrispetasM;
    private javax.swing.JTextField jTextFieldCrispetasP;
    private javax.swing.JTextField jTextFieldCrispetasPP;
    private javax.swing.JTextField jTextFieldGaseosa;
    private javax.swing.JTextField jTextFieldGaseosaP;
    private javax.swing.JTextField jTextFieldGrandesP;
    private javax.swing.JTextField jTextFieldMedianasP;
    private javax.swing.JTextField jTextFieldPerro;
    private javax.swing.JTextField jTextFieldPerroP;
    private javax.swing.JTextField jTextFieldSandwich;
    private javax.swing.JTextField jTextFieldSandwichP;
    private javax.swing.JTextField jTextFieldTé;
    private javax.swing.JTextField jTextFieldTéP;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
