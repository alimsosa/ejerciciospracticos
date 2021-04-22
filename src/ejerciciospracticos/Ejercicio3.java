/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author estudiante.fit
 */
public class Ejercicio3 {

    public boolean isPalindrome(int x) {
        if (x < 0) { //los numeros negativos no los contamos como palindromes
            return false;
        }
        Stack pila = new Stack();
        Queue<Integer> cola = new LinkedList();
        while (x != 0) {
            pila.push(x % 10);
            cola.add(x % 10);
            x /= 10;
        }
        while (pila.size() != 0) {
            int i = (int) pila.pop();
            int j = (int) cola.remove();
            if (i != j) {
                return false;
            }
        }
        return true;

    }

}
