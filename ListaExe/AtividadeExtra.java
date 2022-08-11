package ListaExe;
// Percorra o vetor e retorne a décima palavra.


public class AtividadeExtra {
    public static void main(String[] args) {
        String paragrafo ="Uma planta bem cuidada é capaz de transformar um ambiente da casa. No entanto, a escolha das plantas que irão compor um determinado espaço deve ser pensado com cuidado, pois cada espécie tem uma necessidade específica para se desenvolver, seja pela luminosidade, qualidade do solo ou frequência de regas. E em se tratando de áreas externas, por exemplo, onde a luz é mais intensa e constante é importante optarmos por flores que gostam de sol.";
             String [] contarPalavras = new String[paragrafo.split(" ").length];

             contarPalavras = paragrafo.split(" ");

        System.out.println("contar palavras: " + contarPalavras.length);
        System.out.println("Décima palavra: "+ contarPalavras[9]);


    }
}
