package formas;

import interfaces.Pagamento;

public class PagamentoPix implements Pagamento {

    private double valor;
    private String chavePix;
    private boolean realizado;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public boolean getRealizado() {
        return realizado;
    }

    @Override
    public void realizarPagamento() {
        if (realizado == false) {
            realizado = true;
            System.out.println("Pagamento PIX de R$ " + valor
                    + " realizado para a chave " + chavePix + ".");
        } else {
            System.out.println("O pagamento PIX ja foi realizado.");
        }
    }

    @Override
    public void cancelarPagamento() {
        if (realizado == true) {
            realizado = false;
            System.out.println("Pagamento PIX de R$ " + valor
                    + " cancelado e devolvido ao pagador.");
        } else {
            System.out.println("Nao existe pagamento PIX para cancelar.");
        }
    }
}
