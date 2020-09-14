/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Iury Silva
 */
public class Fatorial {
    
    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
    public void setValor(int valor){
        numero = valor;
        int resultadoFatorial = 1;
        String frase = "";
        for(int contador = valor; contador > 1; contador--){
            resultadoFatorial *= contador;
            frase += contador + " * ";
        }
        frase += "1 = ";
        fatorial = resultadoFatorial;
        formula = frase;
    }
    
    public int getFatorial(){
        return fatorial;
    }
    
    public String getFormula(){
        return formula;
    }
}
