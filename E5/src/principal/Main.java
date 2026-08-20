package principal;

import dispositivos.AparelhoSom;
import dispositivos.Computador;
import dispositivos.Televisao;

public class Main {

    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        televisao.setNomeDispositivo("TV da sala");
        televisao.setLigado(true);
        televisao.setVolume(25);
        televisao.setMidiaAReproduzir("Filme de aventura");
        televisao.setMidiaNaFila(2);

        System.out.println("===== TELEVISAO =====");
        televisao.buscarDispositivo();
        televisao.mostrarMidiaEmReproducao();
        televisao.mostrarMidiaGeral();

        System.out.println();

        AparelhoSom aparelhoSom = new AparelhoSom();
        aparelhoSom.setNomeDispositivo("Caixa de som");
        aparelhoSom.setLigado(true);
        aparelhoSom.setVolume(40);
        aparelhoSom.setMidiaAReproduzir("Musica favorita");
        aparelhoSom.setMidiaNaFila(5);

        System.out.println("===== APARELHO DE SOM =====");
        aparelhoSom.buscarDispositivo();
        aparelhoSom.mostrarMidiaEmReproducao();
        aparelhoSom.mostrarMidiaGeral();

        System.out.println();

        Computador computador = new Computador();
        computador.setNomeDispositivo("Notebook do escritorio");
        computador.setLigado(true);
        computador.setVolume(60);
        computador.setMidiaAReproduzir("Aula de Java");
        computador.setMidiaNaFila(3);

        System.out.println("===== COMPUTADOR =====");
        computador.buscarDispositivo();
        computador.mostrarMidiaEmReproducao();
        computador.mostrarMidiaGeral();
    }
}
