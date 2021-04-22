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
        Stack pila1 = new Stack();
        Stack pila2 = new Stack();
        LinkedList resultado = new LinkedList();
        
        for (int i = 0; i < l1.size(); i++){
        pila1.push(l1.get(i));   
        }
        
        for (int i = 0; i < l2.size(); i++){
        pila2.push(l2.get(i));
        }
        
        while(pila1.size()!=0 && pila2.size()!=0){
            int i=(int)pila1.pop();
            int j=(int)pila2.pop();
            int temp=i+j;
            int carry=0;
            if(temp<10){
                resultado.add(temp+carry);
                carry=0;
            }
            else{
                resultado.add(temp%10);
                carry= temp-10;
                carry=1;
                
            }
        }
        return resultado;
        
    }
    
}
