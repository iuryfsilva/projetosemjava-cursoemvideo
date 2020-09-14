/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepitadowhile;
import javax.swing.JOptionPane;
/**
 *
 * @author Iury Silva
 */
public class ExercicioRepitaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Olá mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        int numero, soma = 0,totalValores = 1, totalPares = 0, totalImpares = 0, acimaDeCem = 0;
        float media = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "<html>Informe um numero: <br><en>(O valor 0 interrompe o laço!)</en></html>"));
            //informar os seguintes valores: 3,6,5,200,150,120,5,9,0
            if(numero != 0){
                totalValores++;
                if((numero % 2) == 0) totalPares++;
                else totalImpares++;                
                if(numero > 100) acimaDeCem++;
                soma += numero;
                media = soma/totalValores;
                
            }else{
                if((numero % 2) == 0) totalPares++;
                else totalImpares++;                
                if(numero > 100) acimaDeCem++;
                soma += numero;
                media = soma / totalValores;
                //totalValores++;
            }
            
        }while(numero != 0);
        
        JOptionPane.showMessageDialog(null,
        "<html>Total de Valores:  " + totalValores +"<br>Total de Pares:  " + totalPares +
        "<br>Total de Ímpares:  " + totalImpares + "<br>Acima de 100:  " + acimaDeCem +  
        "<br>Média dos valores:  " + media + "</html>", "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
