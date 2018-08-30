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
public class start {
    public int pontuacao;
    
    
    public start(){
        this.pontuacao = 0;
    } 
    
    // recebe um numero e exibe uma questao de uma da operações
    public void bancoDeQuestoes(int quest){
        QuestaoSoma soma = new QuestaoSoma();
        QuestaoSubtracao sub = new QuestaoSubtracao();
        QuestaoMultiplicacao mult = new QuestaoMultiplicacao();
       
        if(quest == 1){ // Soma
           soma.verificarResposta(soma.criarPergunta());
           this.pontuacao += soma.pontuacaoTotal();
        }else if(quest == 2){ // Subtraçao
           sub.verificarResposta(sub.criarPergunta());
           this.pontuacao += sub.pontuacaoTotal();
            
        
        }else if(quest == 3){ // multiplicação
           mult.verificarResposta(mult.criarPergunta());
           this.pontuacao += mult.pontuacaoTotal();
          
        }
    }
    
    
    public void exibirResultado(){
        JOptionPane.showMessageDialog(null, "Sua pontuação foi de: " + this.pontuacao);
    
    }
    
    public void gerarQuestoes(int quant){// recebe a quantidade de questoes 
        int quest;
        
        
        for(int i = 0; i < quant; i++){
            quest = ThreadLocalRandom.current().nextInt(1, 4);
            bancoDeQuestoes(quest);
            
        }
        
        exibirResultado();
    }

   
    
    
}
