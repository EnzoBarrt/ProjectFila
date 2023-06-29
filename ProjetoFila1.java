/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetofila1;

/**
 *
 * @author ezoal
 */
public class ProjetoFila1 {

    public static void main(String[] args) {
      Fila fila = new Fila();
      fila.inserir(1);
      fila.inserir(2);
      fila.inserir(3);
      fila.inserir(4);
      
      while(! fila.isEmpty()){
          int x = fila.retirar();
          System.out.println(x);
      }
    }
}
