package com.mycompany.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    
    public static void main(String[] args) {
        int anodeFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalcarrosSeminovos = 0;
        int totalCarros = 0;
        
        Scanner leitor = new Scanner(System.in);
              
        char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S'){
            System.out.println("Digite o ano de fabricação do veículo");
            anodeFabricacao = leitor.nextInt();
        
            System.out.println("Digite o valor do veículo");
            valorVeiculo = leitor.nextFloat();
        
            if(anodeFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalcarrosSeminovos++;
            }  
            totalCarros++;
        
            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;
        
            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("O valor a pagar � de: " + valorPagar);
                  
            System.out.println("Deseja fazer mais consultas? S para Sim ou N para Não");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        System.out.println("Total de carros semi novos: " + totalcarrosSeminovos);
        System.out.println("Total de carros: " + totalCarros);
    }
}