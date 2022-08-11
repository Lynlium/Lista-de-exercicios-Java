package ListaExe;

import java.util.ArrayList;

//Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos,
// cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
public class VetorMultiDimensional {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<String> sobrenomes = new ArrayList<String>();
        ArrayList<String>nomesEsobrenomes = new ArrayList<>();
nomes.add("Marie");
nomes.add("Connie");
nomes.add("Alfredo");
nomes.add("Frederico");
nomes.add("Jinora");
nomes.add("Tupi");
nomes.add("Mommi");
nomes.add("Minji");
nomes.add("Pizis");
nomes.add("Bire");

sobrenomes.add("Courrie");
sobrenomes.add("Head");
sobrenomes.add("Chatão");
sobrenomes.add("Fredinho");
sobrenomes.add("Jiji");
sobrenomes.add("Tupinha");
sobrenomes.add("Gata");
sobrenomes.add("Mini-Ginga");
sobrenomes.add("Pizocks");
sobrenomes.add("cadê meu dragão?");

for (int i = 0; i < nomes.size(); i++){

    nomesEsobrenomes.add(nomes.get(i));
    nomesEsobrenomes.add(sobrenomes.get(i));
    System.out.println("Nomes e Sobrenomes: "+ nomesEsobrenomes);
}

    }
}
