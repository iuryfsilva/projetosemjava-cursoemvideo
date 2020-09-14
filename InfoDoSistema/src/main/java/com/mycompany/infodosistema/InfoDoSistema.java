/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.infodosistema;
import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author Iury Silva
 */
public class InfoDoSistema {
    public static void main(String[] args) {
        
        Date dataEhora = new Date();
        System.out.println("Data e Hora: " + dataEhora.toString());
        
        Locale idiomaDoSistema = Locale.getDefault();
        System.out.println("Idioma do sistema: " + idiomaDoSistema.getDisplayLanguage() +" - "+ idiomaDoSistema.getDisplayCountry());
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("Resolução da tela: " + largura+ "x" + altura);
    
    }
}
