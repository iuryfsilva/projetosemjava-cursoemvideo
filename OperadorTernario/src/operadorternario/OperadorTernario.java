/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Iury Silva
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2, resultado;
        numero1 = 9;
        numero2 = 9;
        resultado = (numero1 >= numero2) ? numero1 + 15: numero2 + 500;//a variavel resultado recebe o valor conforme o teste entre parenteses,
        System.out.println(resultado);//caso oteste seja true numero1 + 15 caso false numero2 +500
                                      //o teste pode ser feito com qualquer operador relacional(são os mesmo de C)
        
    }
    
}
