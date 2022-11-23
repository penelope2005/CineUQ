/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva;

import java.io.*;
import javax.swing.JOptionPane;


public class ArchivoPlano {
    
    File archivo;
    

    public void crearArchivoDeTexto(){
       archivo = new File("archivo.txt");
       try{
           if(archivo.createNewFile()){
               JOptionPane.showMessageDialog(null, "Archivo creado con exito");
           }
           else{
               JOptionPane.showMessageDialog(null, "Error al crear archivo");
           }
       }catch(IOException exepcion){
           exepcion.printStackTrace(System.out);
       }
    }
    
    public void eliminarArchivoDeTexto(){
           if(archivo.delete()){
               JOptionPane.showMessageDialog(null, "Archivo eliminado con exito");
           }
           else{
               JOptionPane.showMessageDialog(null, "Error al eliminar el archivo");
           }
    }
    
    // creamos el metodo para escribir en el archivo de texto
    
    public void escribirArchivo(){
        try{
            FileWriter escritura = new FileWriter(archivo, true);
            String LineToAppend = "hola\n"; //variable a cambiar
            escritura.write(LineToAppend);
            escritura.close();
            JOptionPane.showMessageDialog(null, "Texto Añadido con exito");
        }catch(IOException exepcion){
            exepcion.printStackTrace(System.out);
        }
    }
    
    public void leerArchivoDeTexto(){
        String contenido;
        try{
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            contenido = lectura.readLine();
            JOptionPane.showMessageDialog(null, contenido);
        }catch(IOException exepcion){
            exepcion.printStackTrace(System.out);
        }
    }
    public static void main (String[] args ){
        //poner en botones las funciones
        ArchivoPlano archivoTexto = new ArchivoPlano();
        archivoTexto.crearArchivoDeTexto();
        //archivoTexto.eliminarArchivoDeTexto();
        archivoTexto.escribirArchivo();
        archivoTexto.leerArchivoDeTexto();
    }
}
