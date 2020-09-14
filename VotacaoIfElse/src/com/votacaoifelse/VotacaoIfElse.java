/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.votacaoifelse;

import java.util.Scanner;

/**
 *
 * @author Iury Silva
 */
public class VotacaoIfElse {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o Ano do Nacimento: ");
        int anoNascimento = teclado.nextInt();
        int idade  = 2020 - anoNascimento;
        
        if(idade < 16){
            System.out.println("Voto Proibido.");
            System.out.println("Idade: " + idade);
        }else if((idade >= 16 && idade < 18) || (idade >70)){
            System.out.println("Voto Opcional.");
            System.out.println("Idade: " + idade);
        }else if(idade <= 70){
            System.out.println("Voto Obrigatório.");
            System.out.println("Idade: " + idade);
        }      
    }
}
