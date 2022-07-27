package ListaExe;
/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
 */


import java.util.Arrays;

public class ListaExe {

    public static void main(String[] args) {

        System.out.println("Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.");
        //vetor == Array

        int[] arr = {1,2,3,4,5,6,7};
        int i;
        for (i = 0; i<=5; i++){

            System.out.println(arr[i]);
        }

        System.out.println("Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.");
        int[] numerosInteiros = {1,2,3,4,5,6,7,8,9,10};
        int ordemInversa = 0;


        for (i = numerosInteiros.length -1; i >= 0; i--) {

            ordemInversa =+ numerosInteiros[i];
            System.out.println(ordemInversa);
        }

        System.out.println("Faça um Programa que leia 4 notas, mostre as notas e a média na tela.");

        double[] notas = {7.0, 3.0, 5.5,9.8};

        for (i = 0; i<=notas.length; i++){
            System.out.println("Nota: " + notas[i]);

            double media =+ notas[i] /4;
            System.out.println("Média: " + media);
        }


    }

}
