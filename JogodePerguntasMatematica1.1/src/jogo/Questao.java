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
public abstract class Questao {
    public int operador1;
    public int operador2;
    public int pontos;
    public int resposta;
    
    
    public abstract boolean verificarResposta();
    
    public void exibirResultado(boolean flag ){
        
        if(flag == true){
            JOptionPane.showMessageDialog(null, "Acertou!!");
            this.pontos++;
        } else {
            JOptionPane.showMessageDialog(null, "Errou!!");
            
        }
    }
    
    
    
    
}
