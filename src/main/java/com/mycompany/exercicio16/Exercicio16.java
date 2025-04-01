/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio16;
import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        Double numero1 = Double.parseDouble(input1); 
        
        String input2 = JOptionPane.showInputDialog("Digite o segundo numero:");
        double numero2 = Double.parseDouble(input2);
        
        String[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "escolha a operação:",
            "Calculadora",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        
        double resultado = 0;
        String operacao = "";
        
            
        switch (escolha) {
            case 0:
                    resultado = numero1 + numero2;
                    operacao = "adição";
                    break;
   
            case 1:
                    resultado = numero1 - numero2;
                    operacao = "subtração";
                    break;
                    
            case 2:
                    resultado = numero1 * numero2;
                    operacao = "mutiplicação";
                    break;
                    
            case 3:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    operacao = "divisão";
                 } else {
                     JOptionPane.showMessageDialog(null, "Erro, Divisão por zero nao é permitida.");
                     
                     return;
                 }
                 break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida.");
        }       
                
        JOptionPane.showMessageDialog(null, "O resultado da " + operacao + " é: " + resultado);        
                    
                    
            
    }
}
