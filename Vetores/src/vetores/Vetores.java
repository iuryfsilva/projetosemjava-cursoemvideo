/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;
import java.util.Arrays;
/**
 *
 * @author Iury Silva
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int vetorInteiros[] = {1,2,3,4,5,6,7,8,9,15,1500,152};
        System.out.println("Total de casas do vetor: " + vetorInteiros.length);
        
        for(int controle = 0; controle < vetorInteiros.length; controle++){
            System.out.println(vetorInteiros[controle]);
        }*/
        
        /*
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
                        "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String totalDias[] = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
        
        for(int controle = 0; controle < mes.length; controle++){
            System.out.println("Mês: " + mes[controle] + "  -  " + "Quantidade de Dias: " + totalDias[controle]);
        }*/
        /*
        int numero[] = {8,2,45,4,123};
        
        Arrays.sort(numero);//ordena o vetor
       
        for(int valor: numero){
            System.out.println(valor + " ");
        }
        */
        /*
        int vetor[] = {3,7,8,15,1,5,4,12};
        
        for(int valor: vetor){
            System.out.print(valor);
        }
        
        int posicao = Arrays.binarySearch(vetor, 15);
        
        System.out.println("");
        System.out.println("Encontrei o valor na posição: " + posicao);
        */
        
        int vetorVintePosicoes[] = new int[20];
        Arrays.fill(vetorVintePosicoes, 0);//preenche todos os espaços do vetor com o numero 0
        
        for(int valor: vetorVintePosicoes){
            System.out.print(valor + " ");
        }
    }
    
}
