/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;
import java.util.Scanner;
/**
 *
 * @author Iury Silva
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "Iury"; //instância  a vaviavel nome
        
        float nota = (float)8.5;
        
        System.out.printf("A nota de %s é %.8f \n", nome, nota + 0.1245);
        System.out.format("A nota de %s é %.8f \n", nome, nota - 0.98754);
        System.out.print("A nota é: " + nota);
        System.out.println("A nota é: " + nota);
        System.out.printf("A nota é: %.3f \n", nota);//essa parte parece linguagem C
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o novo nome: ");
        nome = teclado.nextLine();//Aqui a variavel recebeu o valor do metodo 
        System.out.println("Digite a nova nota: ");
        nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.8f \n", nome, nota - 0.98754);
        
        
        
        
        
    }
    
}
