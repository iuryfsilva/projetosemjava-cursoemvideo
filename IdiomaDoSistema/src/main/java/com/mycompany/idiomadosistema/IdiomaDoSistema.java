/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idiomadosistema;
import java.util.Locale;

/**
 *
 * @author Iury Silva
 */
public class IdiomaDoSistema {

    public static void main(String[] args){
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }
}
