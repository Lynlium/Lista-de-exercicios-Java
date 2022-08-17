package ListaExe;
///* Imagine uma lâmpada que possa ter três estados: apagada, acesa e meia-luz. Usando o modelo
//Lampada (listagem 1.1) como base, escreva o modelo LampadaTresEstados */

public class Lampada {
    public static void main(String[] args) {
        acender();
        System.out.println(mostrarEstado());
        apagar();
        System.out.println(mostrarEstado());
        meialuz();
        System.out.println(mostrarEstado());

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
