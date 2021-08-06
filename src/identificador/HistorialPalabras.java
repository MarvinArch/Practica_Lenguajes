/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author alpha
 */
public class HistorialPalabras {
    
    String Archivo ="Aiourssu.txt";
    String [] arreglo;
    ArrayList<String> lista = new ArrayList<String>();
    int conta=0;
    
    public void Tamaño(){
        try{
            String linea = null;
            BufferedReader leerFichero = new BufferedReader (new FileReader(Archivo));    
            while( (linea = leerFichero.readLine()) != null){
        //este bucle es para meter todos los datos leidos de archivo de texto separlo en atributos y convertirlos a objeto para poder trabajar con el 
                lista.add(linea);
                conta++;
            }
            leerFichero.close();
       
        }catch (Exception ex){  
        //Captura un posible error le imprime en pantalla   
            System.out.println(ex.getMessage());  
        }

    }
    
    
    public int arreglotamaño(){
        return conta;
    }
    
    public String Linea(int pos){
        String a1=lista.get(pos);
        return a1;
        
    }
}
