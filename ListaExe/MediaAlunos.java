package ListaExe;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {

        System.out.println("Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.");
        ArrayList<Double> Notas = new ArrayList<>();
        ArrayList<ArrayList<Double>> Media = new ArrayList<>();
        ArrayList<String> Alunos = new ArrayList<>();
        double indexAlunos = 3; //10;
        //  double indexNotas = 12;//40;


        // scanner notas e nomes, vão recerber os valores
        Scanner notas = new Scanner(System.in);
        Scanner nomes = new Scanner(System.in);


        int i;
        for (i = 0; i <= indexAlunos; i++) {
            System.out.println("Digite Nome do Aluno: ");
            var nome = nomes.next();
            Alunos.add(nome);

            //System.out.println("Os alunos com média maior que 7.0:  " + Alunos.get((int) i) + " " + Notas.get((int) i));

            // double next = notas.nextDouble();
            //variáveis notas
            System.out.println("Digite a Nota AV1 do aluno " + nome + ": ");
            double av1 = notas.nextDouble();
            System.out.println("Digite a Nota AV2 do aluno " + nome + ": ");
            double av2 = notas.nextDouble();
            System.out.println("Digite a Nota AV3 do aluno " + nome + ": ");
            double av3 = notas.nextDouble();
            System.out.println("Digite a Nota AV4 do aluno " + nome + ": ");
            double av4 = notas.nextDouble();
            //Adicionando as médias ao Array Notas
            Notas.add((av1 + av2 + av3 + av4) / 4);

            System.out.println("A média do aluno " + Alunos.get(i) + "é " + Notas.get(i));
        }

        //For para retornar nome e média > 7 dos alunos
        int Aprovados = 0;
        for (i = 0; i<= Notas.size();i++ ){
            System.out.println(Notas.get(i));
            if (Notas.get(i)>=7){
                Aprovados = Aprovados + 1;
                System.out.println("A quantidade de alunos aprovados é: "+ Aprovados);
            }
        }

    }};




