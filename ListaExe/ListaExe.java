package ListaExe;
/*
Exercícios a ser resolvido usando ArrayList
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaExe {

    public static void main(String[] args) {

        System.out.println("Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.");
        //vetor == Array

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int i;
        for (i = 0; i <= 5; i++) {

            System.out.println(arr[i]);
        }

        System.out.println("Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.");
        int[] numerosInteiros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ordemInversa = 0;


        for (i = numerosInteiros.length - 1; i >= 0; i--) {

            ordemInversa = +numerosInteiros[i];
            System.out.println(ordemInversa);
        }
        System.out.println("Faça um Programa que leia 4 notas, mostre as notas e a média na tela.");

        double[] notas = {7.0, 3.0, 5.5, 9.8};
        double soma = 0;
        double media = 0;

        for (i = 0; i <= notas.length-1; i++) {

            System.out.println("Nota: " + notas[i]);
            soma = soma + notas[i];

            System.out.println("Soma: " + soma);

        }
        media = (soma / notas.length);
        System.out.println("Média: " + media);



        System.out.println("Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.");

        System.out.println("Digite um número: ");

        byte index = 20; //número máximo de itens no Array

        //criei 3 Arraylits (variáveis do tipo Array list??) para guardar os números
        ArrayList<Integer> ParEImpar = new ArrayList<>();
        ArrayList<Integer> Par = new ArrayList<>();
        ArrayList<Integer> Impar = new ArrayList<>();
        // iniciei o scanner
        Scanner scan = new Scanner(System.in);

        // Iniciado o loop para percorrer os arrays
        for (i = 0; i<= index;++i){
            //exibindo a quantidade de itens dentro do array
            System.out.println(i +1 + " Número ");
            // pedindo o próximo número
            int next = scan.nextInt();
            ParEImpar.add(next); //adicionando todos os números no mesmo array
            if ((Integer)ParEImpar.get(i) % 2 == 0){ //separando-os em Par e ímpar, através de if/else
                Par.add(next);
            }else {
                Impar.add(next);
            }

        }
        //Imprimindo os arrays no console:
        System.out.println("Números: "+ ParEImpar.toString());
        System.out.println("Números Pares: "+ Par.toString());
        System.out.println("Números Ímpares: "+ Impar.toString());



    }

}
