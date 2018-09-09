/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import javax.swing.JOptionPane;

/**
 *
 * @author tadeu
 */
public class Pontuacao {
    private int pontos;
    
    
    public void verificarQuestao(Questao questao){
        if(questao.verificarResposta()){
            this.pontos += questao.pontos;
        }
        
    }
    
    public void exibirPontuacao(){
        JOptionPane.showMessageDialog(null, "Sua pontuação foi de: " + this.pontos);
        
    }
}
