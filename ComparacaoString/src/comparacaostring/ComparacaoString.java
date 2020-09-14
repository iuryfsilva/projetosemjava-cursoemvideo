/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Iury Silva
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome1 = "Iury";
        String nome2 = "Iury";
        String nome3 = new String("Iury");
        String resultado;
        resultado = (nome1 == nome2)? "Igual": "Diferente";
        System.out.println(resultado);
        resultado = (nome2 == nome2)? "Igual": "Diferente";//Testa se os objetos nome2 e nome3 são iguais
        System.out.println(resultado);
        resultado = (nome2.equals(nome3))? "Igual": "Diferente";//Usando o metodo .equals comparamos o conteudo do obj nome2 e do obj nome3
        System.out.println(resultado);
    }
    
}
