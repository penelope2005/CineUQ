/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.reserva;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class panelReserva extends javax.swing.JPanel {

    /**
     * Creates new form panelReserva
     */
    public panelReserva() {
        initComponents();
        initComponents();
        panelAsientos pl = new panelAsientos();
        ShowPanel(pl);
    }
        private void ShowPanel(JPanel p){
        p.setSize(750, 550);
        p.setLocation(0, 0);
        
        enseñarAsientos.removeAll();
        enseñarAsientos.add(p, BorderLayout.CENTER);
        enseñarAsientos.revalidate();
        enseñarAsientos.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enseñarAsientos = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enseñarAsientos.setPreferredSize(new java.awt.Dimension(750, 470));

        javax.swing.GroupLayout enseñarAsientosLayout = new javax.swing.GroupLayout(enseñarAsientos);
        enseñarAsientos.setLayout(enseñarAsientosLayout);
        enseñarAsientosLayout.setHorizontalGroup(
            enseñarAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        enseñarAsientosLayout.setVerticalGroup(
            enseñarAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        add(enseñarAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 440));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Pulse continuar cuando haya seleccionado todos los asientos a reservar.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 530, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        recibo pl = new recibo();
        ShowPanel(pl);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel enseñarAsientos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}