/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros01dowhile;
import java.util.Scanner;
/**
 *
 * @author Iury Silva
 */
public class Numeros01DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();
            soma += numero;
            System.out.println("Quer continuar? [S/N] ");
            resposta = teclado.next();
        }while(resposta.equals("S") || resposta.equals("s"));//aceita teste logico dentro
        System.out.println("A soma de todos os valore é: "+ soma);
        
    }
    
}
