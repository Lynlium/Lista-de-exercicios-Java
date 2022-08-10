package ListaExe;
//Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu
// respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.

import java.util.Scanner;

public class IdadeEAltura {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        Scanner altura = new Scanner(System.in);

       double alturaEIdadeIndex = 2;

        for (int i = 0; i < alturaEIdadeIndex; i++){
            System.out.println("Qual a sua idade? ");
            int addIdade = idade.nextInt();
            System.out.println("Qual sua altura? ");
            double addAltura = altura.nextDouble();

            System.out.println("Altura: " + addAltura + " metros " + "Idade: " + addIdade + " anos");

        }


    }
}
