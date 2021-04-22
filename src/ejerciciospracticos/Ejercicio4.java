/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author estudiante.fit
 */

public class Ejercicio4 {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        String[] digits = s.split("(?<=.)");
        //int valor1 = map.get("valor1");
        int resultado = 0;
        int i = 0;
        while (i < digits.length - 1) {
            if (map.get(digits[i]) >= map.get(digits[i + 1])) {
                resultado += map.get(digits[i]);
            } else {
                resultado -= map.get(digits[i]);
            }
            i += 1;
        }
        resultado += map.get(digits[i]);
        return resultado;
    }

}
