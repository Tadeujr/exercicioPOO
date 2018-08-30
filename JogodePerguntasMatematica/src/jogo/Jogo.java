/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Scanner;

/**
 *
 * @author 20142bsi0119
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start jogo = new start(); // iniciando a classe start para iniciar o jogo
        
        // em gerarQuestoes() ele recebe a quantidade de pergunta que devemn ser gerarda pelo sistema
        jogo.gerarQuestoes(5);
        
    }
    
}
