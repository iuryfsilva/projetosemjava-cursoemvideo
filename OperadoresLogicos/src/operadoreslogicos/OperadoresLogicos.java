/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Iury Silva
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        resultado = (x < y && y < z)? true: false; 
        System.out.println(resultado);
        resultado = (x < y || y == z)? true: false;
        System.out.println(resultado);
        resultado = (x < y ^ y < z)? true: false; 
        System.out.println(resultado);
        resultado = (x < y && y > z)? true: false; 
        System.out.println(resultado);
        
        //                   0                 0                       1
        boolean valor1 = (4 >= 5), valor2 = (4 < 4), valor3 = (valor1 == valor2);
        boolean valor4 = valor1 ^ valor3;//Operador XOR, valor 1 
        boolean valor5 = !valor2 && valor4;//1
        System.out.println(valor4 + " " + valor5);// aqui exibe 1 e 1
        
        
    }
    
}
