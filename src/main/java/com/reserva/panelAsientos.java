/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.reserva;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class panelAsientos extends javax.swing.JPanel {
    
    private int fila = 16;
    private int columnas = 13;
    JButton [][] asientos;
    
    public panelAsientos() {
        initComponents();
        matriz();
    }
    
    public void matriz(){
        asientos = new JButton [fila][columnas];
        int x =10;
        int y =10;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos [i][j] = new JButton();
                asientos [i][j].setBackground(Color.blue);
                asientos [i][j].setBounds(y, x, 30, 27);
                asientos [i][j].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                ButtonControler bt = new ButtonControler();
                asientos [i][j].addActionListener(bt);
                panelBotones.add(asientos [i][j]);
                x+=33;
            }
            x = 10;
            y+=42;
        }
    }
    private class ButtonControler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columnas; j++) {
                    if(e.getSource().equals(asientos [i][j])){
                        asientos [i][j].setBackground(Color.red);
                        asientos [i][j].setName("Reservado");
                        Reserva.cantidadAsientos +=1;
                    }
                }
            }
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotones = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBotones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
}
