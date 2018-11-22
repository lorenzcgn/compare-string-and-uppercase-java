/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestringa;
import java.lang.*;
import java.util.*;
import java.io.*;



public class essestring {


    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    String ciao= "ciao";
    String bello = s.next();
    
    if (ciao.equals(bello))
        System.out.println("le due stringhe sono uguali");
    else
        System.out.println("le due stringhe sono diverse");
    System.out.println(bello.toUpperCase());
}
}
