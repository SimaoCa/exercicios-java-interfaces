package dispositivos;

import interfaces.ControleMidia;

public class Computador implements ControleMidia {

    private boolean ligado;
    private int volume;
    private String nomeDispositivo;
    private String midiaAReproduzir;
    private int midiaNaFila;

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getNomeDispositivo() {
        return nomeDispositivo;
    }

    public void setNomeDispositivo(String nomeDispositivo) {
        this.nomeDispositivo = nomeDispositivo;
    }

    public String getMidiaAReproduzir() {
        return midiaAReproduzir;
    }

    public void setMidiaAReproduzir(String midiaAReproduzir) {
        this.midiaAReproduzir = midiaAReproduzir;
    }

    public int getMidiaNaFila() {
        return midiaNaFila;
    }

    public void setMidiaNaFila(int midiaNaFila) {
        this.midiaNaFila = midiaNaFila;
    }

    @Override
    public void buscarDispositivo() {
        System.out.println("Computador disponivel na rede local: " + nomeDispositivo + ".");
    }

    @Override
    public void mostrarMidiaEmReproducao() {
        if (ligado) {
            System.out.println("O computador esta reproduzindo no player: " + midiaAReproduzir + ".");
        } else {
            System.out.println("O computador esta desligado.");
        }
    }

    @Override
    public void mostrarMidiaGeral() {
        System.out.println("Volume do computador: " + volume + ". Arquivos na fila: " + midiaNaFila + ".");
    }
}
