/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.List;

/**
 *
 * @author estudiante.fit
 */
public class RotateArray {
    
    public List<Integer> rotLeft(List<Integer> a, int d) {
    // Write your code here
    for (int i=0;i<d;i++){
    int rotate= a.remove(0);
    a.add(rotate);
    }
    
    return a;
    }
}
