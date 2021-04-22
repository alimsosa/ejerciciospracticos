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
public class Ejercicio2 {

    public int reverse(int x) {
        int sol = 0;
        while (Math.abs(x) > 0) {
            if (sol > Integer.MAX_VALUE / 10 || sol < Integer.MIN_VALUE / 10) {
                return 0;
            } else {
                sol = (x % 10) + (sol * 10);
                x /= 10;
            }
        }
        return sol;
    }

}
