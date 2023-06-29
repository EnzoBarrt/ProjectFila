/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofila1;

/**
 *
 * @author ezoal
 */
public class Fila {
     private int[] valores;
     private int  primeiro;
     private int  ultimo;
     private int  total;
    
     public Fila(){
         valores= new int[10];
         primeiro= 0;
         ultimo= 0;
         total= 0;
     }
    
    
    
    
    public void inserir(int elemento){
         if(isFull()){
             throw new RuntimeException("Fila cheia");
         }
        valores[ultimo]= elemento;
         ultimo= (ultimo+ 1) % valores.length;
         total++;
     }
    public int retirar(){
        if(isEmpty()){
            throw new RuntimeException("Fila vazia");
        }
        int elemento= valores[primeiro];
        primeiro= (primeiro+ 1) % valores.length;
        total--;
         return elemento;
        
    }
    public boolean isEmpty(){
        
         return total==0  ;
        
    }
    public boolean isFull(){
        
         return false;
        
    }
}

