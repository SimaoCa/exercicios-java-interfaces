package dispositivos;

import interfaces.ControleMidia;

public class Televisao implements ControleMidia {

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
        System.out.println("Televisao encontrada pela rede: " + nomeDispositivo + ".");
    }

    @Override
    public void mostrarMidiaEmReproducao() {
        if (ligado) {
            System.out.println("A televisao esta exibindo: " + midiaAReproduzir + ".");
        } else {
            System.out.println("A televisao esta desligada.");
        }
    }

    @Override
    public void mostrarMidiaGeral() {
        System.out.println("Volume da televisao: " + volume + ". Midias na fila: " + midiaNaFila + ".");
    }
}
