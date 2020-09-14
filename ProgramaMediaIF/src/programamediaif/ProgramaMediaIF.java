/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamediaif;
import java.util.Scanner;
/**
 *
 * @author Iury Silva
 */
public class ProgramaMediaIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float numero1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float numero2 = teclado.nextFloat();
        float media = (numero1 + numero2)/2;
        System.out.println("Média: " + media);
        if (media > 9){
            System.out.println("おめでとうございます、ここからがんばってください。");
        }
        
    }
    
}
