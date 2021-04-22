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
        
        
        /*Ejercicio 2:
        Given a signed 32-bit integer x, return x with its digits reversed.
        Ex:
        Input: x = 123
        Output: 321
        
        */
        Ejercicio2 ejemplo2 = new Ejercicio2();
        int input=893;
        System.out.println("Resultado del ejercicio 2:");
        System.out.println((ejemplo2.reverse(input)));   
        
        /*Ejercicio3
        Given an integer x, return true if x is palindrome integer.
        An integer is a palindrome when it reads the same backward as forward.
        For example, 121 is palindrome while 123 is not.
        */
        
        Ejercicio3 ejemplo3 = new Ejercicio3();
        int input2=121; //deveria volver true
        System.out.println("Resultado del ejercicio 3, con 121:");
        System.out.println((ejemplo3.isPalindrome(input2)));   
        
        /*
        Ejercicio4
        Given a roman numeral, convert it to an integer.
        Example:
        Input: s = "III"
        Output: 3
                    */
        Ejercicio4 ejemplo4 = new Ejercicio4();
        String input4="IV";
        System.out.println("Resultado del ejercicio 4, con IV:");
        System.out.println((ejemplo4.romanToInt(input4)));   
    
    
    /*
    Ejercicio 5
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string ""
    Ex:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    */
        Ejercicio5 ejemplo5 = new Ejercicio5();
        String[] input5={"flower","flow","flight"};
        System.out.println("Resultado del ejercicio 5:");
        System.out.println((ejemplo5.longestCommonPrefix(input5)));   
    }
    }



