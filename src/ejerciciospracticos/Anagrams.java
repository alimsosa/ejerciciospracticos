/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author estudiante.fit
 */
public class Anagrams {
    
    
    public List<String> funWithAnagrams(String[] words){
        
        int n=words.length;
        List<String> resultado=new ArrayList();
        HashSet<String> found = new HashSet<> ();
        
        for (int i=0;i<n;i++){
            
            String word=words[i];
            char tempArray[] = word.toCharArray();
            Arrays.sort(tempArray);
            String orderedWord=new String(tempArray);
            
            if (!found.contains(orderedWord)) {
                resultado.add(words[i]);
                found.add(orderedWord);
            }

            
        }
        
                  System.out.println(resultado.toString());  
        
        Collections.sort(resultado);
                  
        return resultado;
    }
    
}
