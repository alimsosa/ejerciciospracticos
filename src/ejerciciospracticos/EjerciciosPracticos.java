/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author estudiante.fit
 */
public class EjerciciosPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Ejercicio 1:
        Given an array of integers nums and an integer target, return indices of the two numbers
        such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the
        same element twice.
        You can return the answer in any order.
        Ex:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
        */
        Ejercicio1 ejemplo = new Ejercicio1();
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println("Las posiciones que contienen la solucion del ej1 son:");
        System.out.println(Arrays.toString(ejemplo.twoSum(nums, target)));
        
        
        
    }  
    }



