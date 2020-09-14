/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.resolucaodosistema;
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author Iury Silva
 */
public class ResolucaoDoSistema {
    public static void main(String[] args){
        Dimension Tela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Resolução da tela: " + Tela.width + "x" + Tela.height);//somente exibe as informações
    }
}
