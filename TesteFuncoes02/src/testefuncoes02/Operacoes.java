/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncoes02;

/**
 *
 * @author Iury Silva
 */
public class Operacoes {
    
    public static String contador(int inicio, int fim){
        String palavra = "";
        for(int controle = inicio; controle <= fim; controle++){
            palavra += controle + " ";
        }
        return palavra;
    }
}
