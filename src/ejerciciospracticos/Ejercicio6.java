/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author estudiante.fit
 */
public class Ejercicio6 { 
    public LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        LinkedList resultado = new LinkedList();
        int carry=0;
        int index=0;
        int temp1,temp2;
        int temporal;
        while (index<l1.size() && index<l2.size()){
            temp1=(int)l1.get(index);
            temp2=(int)l2.get(index);
            temporal=temp1+temp2;
            
            if(temporal<10){
                resultado.addFirst(temporal+carry);
                carry=0;
            }
            else{
                temporal+=carry;
                resultado.addFirst(temporal-10);
                carry=1;
                
            }

            index++;
        } 
            if(carry!=0){
             resultado.addFirst(carry);  
            }
          
        return resultado;
        
    }
    
}
/*

*/