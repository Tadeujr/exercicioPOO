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
public class QuestaoSubtracao extends Questao{
    
    public QuestaoSubtracao() {
        this.pontos = 0;
        this.operador1 = ThreadLocalRandom.current().nextInt(0, 100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0, 20);
    }

    public void criarPergunta() {
        String total = JOptionPane.showInputDialog("Quanto é: " + operador1 + " - " + operador2);

        int totalInt = Integer.parseInt(total);

        this.resposta = totalInt;
    }

    // Verifica se o valor da resposta do usuario esta correta    
     @Override
    public boolean verificarResposta(){
        
        if ((operador1 - operador2) == resposta) {
            return true;
        }
        
        return false;
    } 
   
}
