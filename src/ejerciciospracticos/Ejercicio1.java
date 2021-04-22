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
public class Ejercicio1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) ) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No hay solución");
}
    
}
