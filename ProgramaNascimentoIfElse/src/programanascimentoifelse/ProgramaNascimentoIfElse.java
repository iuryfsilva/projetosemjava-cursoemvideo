/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programanascimentoifelse;
import java.util.Scanner;
/**
 *
 * @author Iury Silva
 */
public class ProgramaNascimentoIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o ano do nascimento: ");
        int anoNascimento = teclado.nextInt();
        int idade = 2020 - anoNascimento; 
        System.out.println(idade);
            
        if(idade >= 18){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
    }
    
}
