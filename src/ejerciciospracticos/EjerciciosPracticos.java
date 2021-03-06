/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.regex.*;
import java.text.*;
/**
 *
 * @author estudiante.fit
 */
public class EjerciciosPracticos {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
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
    
            /*
        Ejercicio6 
        You are given two non-empty linked lists representing two non-negative integers.
        The digits are stored in reverse order, and each of their nodes contains a single digit.
        Add the two numbers and return the sum as a linked list.
        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
        Constraints:
        The number of nodes in each linked list is in the range [1, 100].
        0 <= Node.val <= 9
        It is guaranteed that the list represents a number that does not have leading zeros.
        It is guaranteed that bot lists have the same size.
        */
        Ejercicio6 ejemplo6 = new Ejercicio6();
        LinkedList lista1= new LinkedList();
        lista1.addLast(2);
        lista1.addLast(4);
        lista1.addLast(3);
        LinkedList lista2= new LinkedList();
        lista2.addLast(5);
        lista2.addLast(6);
        lista2.addLast(4);
        
        System.out.println("Resultado del ejercicio 6:");
        System.out.println((ejemplo6.addTwoNumbers(lista1,lista2)));    
            
        
        
        /*
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
        determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Input: s = "()[]{}" Output: true
        Input: s = "(]" Output: false
        */
        
        
        Ejercicio7 ejemplo7 = new Ejercicio7();
        String s = "(]";
        
        System.out.println(ejemplo7.isValid(s));
        
        
        
        
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sumar(1,2));
        
        
        //-------------------------------------
        //Reverse array ex: [1,2,3] --> [3,2,1]
        ReverseArray reverse = new ReverseArray();
        
        List<Integer> inicial =new ArrayList<Integer>(); 
        inicial.add(1);
        inicial.add(2);
        inicial.add(3);
        
        
        System.out.println("reversaaaaaaaaaaa ");
        
         List<Integer> res =new ArrayList<Integer>(); 
         
        res=reverse.reverseArray(inicial);
        
        System.out.println(res);
        
        //-------------------------------------
        
        //Anagrams
        
        Anagrams anagramas = new Anagrams();
        
        String[] inicial1={"code","ecod","doce"};
        
        List<String> resultadoAnagramas=anagramas.funWithAnagrams(inicial1);
        
        
        //___________---------------____________---------------
        
       LetraMasRepetida letraMaxima = new LetraMasRepetida();
       
      String cadena= "aaaeeee";
      
        System.out.println(letraMaxima.contarLetra(cadena));
       
        
        //-----------------------------------
        RotateArray rotate = new RotateArray();
        List<Integer> aRotar = new ArrayList<>();
        aRotar.add(1);
        aRotar.add(2);
        aRotar.add(3);
        aRotar.add(4);
        aRotar.add(5);
        
        System.out.println("antes de rotar: "+aRotar);
        
        List<Integer> rotada= rotate.rotLeft(aRotar, 2);
        System.out.println(rotada);
        
        
    String original = "????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????";
    // Cadena de caracteres ASCII que reemplazar??n los originales.
    String ascii = "AAAAAAACEEEEIIIIDNOOOOOOUUUUYBaaaaaaaceeeeiiiionoooooouuuuyy";
    String output = "hol????????a????";
    for (int i=0; i<original.length(); i++) {
    // Reemplazamos los caracteres especiales.

        output = output.replace(original.charAt(i), ascii.charAt(i));

    }//for i
        System.out.println(output);
        
     
        SortA sorted= new SortA();
        
        int[] hola= {5,4,3,2,1};
        
        System.out.println(sorted.sortA(hola));
        
        
    }
    
    
    
    
    
}

