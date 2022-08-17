package ListaExe;

import java.util.Scanner;

public class LampadaIntensidade {
    public static void main(String[] args) {

        Scanner intensidade = new Scanner(System.in);
        System.out.println("Qual a intensidade da lâmpada? (Entre 0% e 100%)");
        int lampInt = intensidade.nextInt();

        if (lampInt<10 && lampInt >0){
            apagar();
        } else if(lampInt>10 && lampInt<70){
            meialuz();
        }else if(lampInt>=70 && lampInt<=100){
            acender();

        }

        System.out.println("A intensidade da lampada está em: "+ lampInt +"% , " + mostrarEstado());


//        acender();
//        System.out.println(mostrarEstado());
//        apagar();
//        System.out.println(mostrarEstado());
//        meialuz();
//        System.out.println(mostrarEstado());

    }
    static int estadoLampada = 0;


    static void acender() {

        estadoLampada = 0;
    }

    static void apagar() {
        estadoLampada = 1;
    }

    static void meialuz() {
        estadoLampada = 2;
    }

    static String mostrarEstado() {
        if (estadoLampada == 0) {
            return "Lâmpada acesa";
        } else if (estadoLampada == 1) {
            return "Lâmpada apagada";
        } else {
            return "Lâmpada à meia-luz";
        }
    }
}

