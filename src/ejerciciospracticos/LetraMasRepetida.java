/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


/**
 *
 * @author estudiante.fit
 */
public class LetraMasRepetida {
    
    
    public String contarLetra (String cadena){
        
        int maxValue=0;
        String maxChar = null;
        String sinEspacios = "";
        sinEspacios=cadena.replace(" ", "");
        
        String[] chars=sinEspacios.split("");
        HashMap<String,Integer> hash = new HashMap<>();
        
        for (String s : chars){
            
            if(hash.containsKey(s)){
                int nuevoValor=hash.get(s) + 1;
                hash.put(s,nuevoValor);
                if (nuevoValor >maxValue){
                    maxValue=nuevoValor;
                    maxChar=s;
                }
            }
            else{
                hash.put(s, 1);
            }
            
        }
        
        return ("The maximum value is: " + maxChar +"with: "+ maxValue+" repetitions");
    }
    
}
