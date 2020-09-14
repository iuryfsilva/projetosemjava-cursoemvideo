/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exerciciosresolvidosDeitel;
import javax.swing.JFrame;

/**
 *
 * @author Iury Silva
 */
public class Main {
    public static void main(String[] args){
        
        DrawPanel painel = new DrawPanel();
        
        JFrame aplicacao = new JFrame();
        
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        aplicacao.add(painel);
        aplicacao.setSize(400,400);
        aplicacao.setVisible(true);
        
    }
    
}
