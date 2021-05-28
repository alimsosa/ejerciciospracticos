/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author estudiante.fit
 */
public class ReverseArray {
    
    
       public List<Integer> reverseArray(List<Integer> a) {

        int size=a.size()-1;
        List<Integer> res =new ArrayList<Integer>(); 
        
        while(size>=0){
            int l = a.get(size);
            res.add(l);
            a.remove(size);
            size--;
        }
        
        
           return res; 
    }
    
}
