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
    
    public void verificarResposta(int resposta){
        
        if (operador1 + operador2 == resposta){
            
            JOptionPane.showMessageDialog(null,"Acertou!!");
            this.pontuacao +=1;
        } else {
            JOptionPane.showMessageDialog(null, "Errou!!");
            this.pontuacao -=1;
        }
    }
    
    public void exibirResultado(){}// pensar depois com a pontuação
     /*   if(sinal == 1){ // Soma

        }else if(sinal == 2){ // Subtraçao
            String total = JOptionPane.showInputDialog("Quanto é: " + operador1 + " - " + operador2);

            int totalInt = Integer.parseInt(total);

            if (operador1 - operador2 == totalInt) {
                JOptionPane.showMessageDialog(null, "Acertol MiZeravi!!");
            }else {
                JOptionPane.showMessageDialog(null, "Errol Abenssuado!!");
            }
        
        }else if(sinal == 3){ // multiplicação
            
            operador1 = ThreadLocalRandom.current().nextInt(0, 100);
            operador2 = ThreadLocalRandom.current().nextInt(0, 10);
            String total = JOptionPane.showInputDialog("Quanto é: " + operador1 + " * " + operador2);

            int totalInt = Integer.parseInt(total);

            if (operador1 * operador2 == totalInt) {
                JOptionPane.showMessageDialog(null, "Acertou MiZeravi!!");
            } else {
                JOptionPane.showMessageDialog(null, "Errol Abenssuado!!");
            }           
        }else{// divisao
            String total = JOptionPane.showInputDialog("Quanto é: " + operador1 + " / " + operador2);

            double totalInt = Double.parseDouble(total);

            if (operador1 / operador2 == totalInt) {
                JOptionPane.showMessageDialog(null, "Acertol MiZeravi!!");
            } else {
                JOptionPane.showMessageDialog(null, "Errol Abenssuado!!");
            }
        }

       */
    
}
