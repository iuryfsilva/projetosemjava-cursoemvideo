/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Iury Silva
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int numero1 = 3;
        int numero2 = 5;
        float media = (numero1 + numero2)/2;
        
        System.out.printf("A média é: %.2f \n", media);
        int numero = 10;
        int valor = 4 + numero--;
        
        System.out.println(valor);
        System.out.println(numero);
        
        
        int x = 4;
        x +=2;//x = x + 2
        System.out.println(x);
        
        float valor = 8.4f;
        int arredondamento = (int) Math.ceil(valor);
        System.out.println(arredondamento);*/
        
        
        //NUMERO ALEATORIO EM JAVA 
        double aleatorio = Math.random();
        int valorDe5a10 = (int) (15 + aleatorio * (33 - 15));
        System.out.println(valorDe5a10);
        
        /*
        int numero = 4;
        System.out.println("O valor da variavel é " + numero++);// primeiro imprime o valor ne numero e depois faz o incremento
        System.out.println("O valor final da variavel numero é " + numero);
        System.out.println("O valor preincrementado é " + ++numero);// incrementa durante a a impressão
        */
        
    }   
    
    
}
