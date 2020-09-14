/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula14;

/**
 *
 * @author Iury Silva
 */
public class ExercicioAula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palavra = "CURSOEMVIDEO";
        char vetor[] = new char[12];
        for(int auxiliar = palavra.length() - 1; auxiliar >= 0; auxiliar-- ){
            vetor[auxiliar] = palavra.charAt(auxiliar);
            System.out.print(vetor[auxiliar]);
        }
        System.out.println("\n");
        for(char imprime: vetor){
            System.out.print(imprime);
        }
        System.out.println("\n");
    }
    
}
