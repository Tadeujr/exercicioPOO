/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author 20142bsi0119
 */
public class QuestaoMultiplicacao {
    private int operador1 = ThreadLocalRandom.current().nextInt(0, 100);
    private int operador2 = ThreadLocalRandom.current().nextInt(0, 10);
    public int pontuacao;
    /* tenho que criar o contrutor com o mesmo nome*/
    
    public QuestaoMultiplicacao() {
        this.pontuacao = 0;
    }

    public int criarPergunta() {
        String total = JOptionPane.showInputDialog("Quanto é: " + operador1 + " - " + operador2);

        int totalInt = Integer.parseInt(total);

        return totalInt;
    }
    
    public void verificarResposta(int resposta){
        
        if (operador1 * operador2 == resposta) {
            JOptionPane.showMessageDialog(null, "Acertou!!");
            this.pontuacao +=1;
        } else {
            JOptionPane.showMessageDialog(null, "Errou!!");
            this.pontuacao -=1;
        }
    } 
    
    public void exibirResultado(){}// pensar depois com a pontuação
    
    
}
