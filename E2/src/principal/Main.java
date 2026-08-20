package principal;

import formas.PagamentoCartao;
import formas.PagamentoPix;

public class Main {

    public static void main(String[] args) {
        PagamentoPix pagamentoPix = new PagamentoPix();
        pagamentoPix.setValor(150.00);
        pagamentoPix.setChavePix("cliente@exemplo.com");

        System.out.println("===== PIX =====");
        pagamentoPix.realizarPagamento();
        pagamentoPix.cancelarPagamento();

        System.out.println();

        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.setValor(300.00);
        pagamentoCartao.setNumeroCartao("**** **** **** 1234");
        pagamentoCartao.setNomeTitular("Cliente Teste");

        System.out.println("===== CARTAO =====");
        pagamentoCartao.realizarPagamento();
        pagamentoCartao.cancelarPagamento();

        System.out.println();
        System.out.println("===== ESTADOS =====");
        System.out.println("PIX realizado: " + pagamentoPix.getRealizado());
        System.out.println("Cartao realizado: " + pagamentoCartao.getRealizado());
    }
}
