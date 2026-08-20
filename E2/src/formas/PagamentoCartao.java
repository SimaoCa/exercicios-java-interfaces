package formas;

import interfaces.Pagamento;

public class PagamentoCartao implements Pagamento {

    private double valor;
    private String numeroCartao;
    private String nomeTitular;
    private boolean realizado;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public boolean getRealizado() {
        return realizado;
    }

    @Override
    public void realizarPagamento() {
        if (realizado == false) {
            realizado = true;
            System.out.println("Pagamento de R$ " + valor
                    + " autorizado no cartao " + numeroCartao
                    + " de " + nomeTitular + ".");
        } else {
            System.out.println("O pagamento com cartao ja foi realizado.");
        }
    }

    @Override
    public void cancelarPagamento() {
        if (realizado == true) {
            realizado = false;
            System.out.println("Estorno de R$ " + valor
                    + " solicitado para o cartao " + numeroCartao + ".");
        } else {
            System.out.println("Nao existe pagamento com cartao para cancelar.");
        }
    }
}
