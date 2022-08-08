package ListaExe;

import java.util.Arrays;

////Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.
public class Calculos {
    public static void main(String[] args) {

        int[] numInteiros = {1,2,3,4,5};
        int soma = 0;
        int multiplicacao = 1;


        for(int i=0; i < numInteiros.length; i++){
            soma = soma+numInteiros[i];
            System.out.println("Soma: "+ soma);

        }
        for (int i = 0; i< numInteiros.length; i++){
            multiplicacao = multiplicacao * numInteiros[i];
            System.out.println("Mutiplicação: " + multiplicacao);
        }


        System.out.println("Números inteiros no Array: " + Arrays.toString(Arrays.stream(numInteiros).toArray()));
    }




}
