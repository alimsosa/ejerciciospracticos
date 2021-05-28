/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

/**
 *
 * @author estudiante.fit
 */
public class SortA {
    
    
    
        public int sortA(int[] a){
        int p=0;
        for (int i =0;i<a.length;i++){
            p++;
            for(int j=i;j<a.length;j++){
                p++;
                if (a[i]>a[j])
                {
                    int aux=a[j];
                    a[j]=a[i];
                    a[i]=aux;
                }
            }
            
            
        }
        
        for(int l=0;l<a.length;l++){
            System.out.println(a[l]);
        }
        return p;
    }
    
    
    
}


