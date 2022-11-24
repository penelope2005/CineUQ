/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class ArchivoPlano {
    
    File archivo;
    

    public void crearArchivoDeTexto(){
       archivo = new File("archivo.txt");
       try{
           if(archivo.createNewFile()){
               System.out.println("Archivo creado con exito");
           }
           else{
               System.out.println("Error al crear archivo");
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


    public void escribirArchivo(ArrayList<String> variable, ArrayList<Integer> variable2){
        String mensaje1="", mensaje2="";
        if(variable2 == null){
            for(int i=0;i<variable.size();i++){
                mensaje1+=variable.get(i)+" ";
            }
        }
        else if(variable == null){
           for(int i=0;i<variable2.size();i++){
                mensaje2+=variable2.get(i)+" ";
           }
        }
        else{
            for(int i=0;i<variable.size();i++){
                mensaje1+=variable.get(i)+" ";
                mensaje2+=variable2.get(i)+" ";
            }
        }
        try{
            FileWriter escritura = new FileWriter(archivo, true);
            String LineToAppend = mensaje1 + "\n" + mensaje2 + "\n"; //variable a cambiar
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
        //ArchivoPlano archivoTexto = new ArchivoPlano();
        //archivoTexto.crearArchivoDeTexto();
        //archivoTexto.eliminarArchivoDeTexto();
        //archivoTexto.escribirArchivo();
        //archivoTexto.leerArchivoDeTexto();
    }
}
