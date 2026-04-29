

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println(" bem vindo ao sistema de soma   ");

        int num = 1;
        int soma = 0;
        int contador = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;


        for (; num != 0; ) {
            System.out.println("digite numeros ou 0 para sair ");
            num = ler.nextInt();

            if (num != 0) {
                soma += num;
                contador++;
            }
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }

        }

        System.out.println("---escolha uma opcao do que deseja saber--- ");
        System.out.println("1- contar quantidade de vezes digitadas ");
        System.out.println("2- somar numeros ");
        System.out.println("3- media");
        System.out.println("4- mostrar o menor e maior numero digitado ");

        int opcao = ler.nextInt();

        switch(opcao){
            case 1:
                System.out.println("voce digitou: "+contador);
                break;

            case 2:
                System.out.println("resultado: "+soma);
                break;

            case 3:
                if(contador>0){
                    double media = (double)soma/contador;
                    System.out.printf("media: %.2f\n", media);
                }break;

            case 4:
                System.out.println("menor numero: "+menor );
                System.out.println("maior numero: "+maior);
                break;}
        ler.close();




    }
}