/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificador;

/**
 *
 * @author alpha
 */
public enum Tipo {
    ID("ID"), Entero("ENTERO"), Decimal("DECIMAL"), SYMBOLO("SYMBOLO"), ERROR("ERROR");
    private String clasificacion; 
    
    //Constructor
    Tipo(String s){
        clasificacion=s;
    }
    //Método
    String getClasificacion(){
        return clasificacion;
    }
    
    String gettipo(String tipo){
        for(Tipo tip : values())
        {
            if(tip.getClasificacion().equals(tipo))
                return getClasificacion();
        }
        return null;
    }
    
}
