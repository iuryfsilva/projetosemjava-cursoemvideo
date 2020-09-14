/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01exerciciosaula15;

/**
 *
 * @author Iury Silva
 */
public class Funcao01ExerciciosAula15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial novoFatorial = new Fatorial();
        novoFatorial.setValor(16);//limite para os valores tipo int nesse fatorial é 16
        System.out.print(novoFatorial.getFormula());
        System.out.println(novoFatorial.getFatorial());
    }
    
}
