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
public class QuestaoSoma {
    private int operador1 = ThreadLocalRandom.current().nextInt(0, 100);
    private int operador2 = ThreadLocalRandom.current().nextInt(0, 20);
    public int pontuacao;
    /* tenho que criar o contrutor com o mesmo nome*/
    
    public QuestaoSoma() {
        this.pontuacao = 0;
    }

    public int criarPergunta() {
        String total = JOptionPane.showInputDialog("Quanto é: " + operador1 + " + " + operador2);

        int totalInt = Integer.parseInt(total);

        return totalInt;
    }
    
    // Verifica se o valor da resposta do usuario esta correta
    public void verificarResposta(int resposta){
        
        if ((operador1 + operador2) == resposta){
            
            JOptionPane.showMessageDialog(null,"Acertou!!");
            this.pontuacao ++;
        } else {
            JOptionPane.showMessageDialog(null, "Errou!!");
            
        }
    }
    
   // metodo retorna pontuação do tipo de questão
    public int pontuacaoTotal(){
        return this.pontuacao;
        
    }
    
}
