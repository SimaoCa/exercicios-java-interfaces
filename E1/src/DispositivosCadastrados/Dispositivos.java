/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DispositivosCadastrados;
import Ligar.ligavel;

/**
 *
 * @author simao
 */
public abstract class Dispositivos implements ligavel {

    private String nome;
    private String tipo;
    private boolean ligado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println(nome + " foi ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println(nome + " foi desligado.");
    }

    @Override
    public String toString() {
        String estado;

        if (ligado == true) {
            estado = "Ligado";
        } else {
            estado = "Desligado";
        }

        return nome
                + " | Tipo: " + tipo
                + " | Estado: " + estado;
    }
}

