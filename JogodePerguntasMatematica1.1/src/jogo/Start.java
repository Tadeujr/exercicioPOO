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
 * @author tadeu
 */
public class Start {
  private Pontuacao score = new Pontuacao();
    
    // recebe um numero e exibe uma questao de uma da operações
    public void iniciarJogo(int quest){
        QuestaoSoma soma = new QuestaoSoma();
        QuestaoSubtracao sub = new QuestaoSubtracao();
        QuestaoMultiplicacao mult = new QuestaoMultiplicacao();
       
        if(quest == 1){ // Soma
           soma.criarPergunta();
           soma.exibirResultado(soma.verificarResposta());
           this.score.verificarQuestao(soma);
           
        }else if(quest == 2){ // Subtraçao
           sub.criarPergunta();
           sub.exibirResultado(sub.verificarResposta());
           this.score.verificarQuestao(sub);
        }else if(quest == 3){ // multiplicação
           mult.criarPergunta();
           mult.exibirResultado(mult.verificarResposta());
           this.score.verificarQuestao(mult);
        }
        
    }
        
    public void gerarQuestoes(int quant){// recebe a quantidade de questoes 
        int quest;
        
        
        for(int i = 0; i < quant; i++){
            quest = ThreadLocalRandom.current().nextInt(1, 4);
            iniciarJogo(quest);
            
        }
        this.score.exibirPontuacao();
        
    }

   
    
    
}
