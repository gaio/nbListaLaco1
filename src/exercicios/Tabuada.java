/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Gaio
 */
public class Tabuada {
    public static void main(String[] args) {
        
    
    int num=0, cont=0, res=0;
    num=Integer.parseInt(JOptionPane.showInputDialog("Digite o número para o cálculo da tabuada"));
    while(cont<=10){
        res=num*cont;
        JOptionPane.showMessageDialog(null,num+" x "+cont+" = "+res);
        cont++;
    }
    }
}
