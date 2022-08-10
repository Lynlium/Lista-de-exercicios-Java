package ListaExe;
//Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.
public class SomadoQuadrados {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 1; i< A.length; i++){
            int square = 0;
            square = (int) Math.sqrt(A[i]);

            System.out.println("Raiz quadrada de : " + A[i] + " é: " + square);

            square = A[i] + square;
            System.out.println("A soma dos quadrados é: " + square);

        }

    }
}
