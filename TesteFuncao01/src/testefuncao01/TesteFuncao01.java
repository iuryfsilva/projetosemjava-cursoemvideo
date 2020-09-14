/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author Iury Silva
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int valor1, int valor2){//esse metodo é não instanciado só funciona dentro dessa classe
        int soma = valor1 + valor2;
        System.out.println("Soma: " + soma);
    }
    
    static int subtracao(int valor1, int valor2){
        int subtracao = valor1 - valor2;
        return subtracao;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio do Programa.... ");
        soma(15,15);
        //System.out.println("\n");
        System.out.println("Subtracao: " + subtracao(15,55));
                
        
    }
    
}
