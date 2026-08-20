package principal;

import notificacoes.NotificacaoEmail;
import notificacoes.NotificacaoSms;
import notificacoes.NotificacaoWhatsapp;

public class Main {

    public static void main(String[] args) {
        NotificacaoEmail email = new NotificacaoEmail();
        email.setDestinatario("cliente@exemplo.com");
        email.setPerfilCliente("Cliente empresarial");
        email.setMensagem("Sua nota fiscal esta disponivel.");

        System.out.println("===== E-MAIL =====");
        email.canalDeComunicacao();
        email.perfilDeCliente();
        email.enviarMensagem();

        System.out.println();

        NotificacaoSms sms = new NotificacaoSms();
        sms.setDestinatario("(11) 99999-1111");
        sms.setPerfilCliente("Cliente sem internet");
        sms.setMensagem("Seu pedido saiu para entrega.");

        System.out.println("===== SMS =====");
        sms.canalDeComunicacao();
        sms.perfilDeCliente();
        sms.enviarMensagem();

        System.out.println();

        NotificacaoWhatsapp whatsapp = new NotificacaoWhatsapp();
        whatsapp.setDestinatario("(11) 98888-2222");
        whatsapp.setPerfilCliente("Cliente cadastrado no WhatsApp");
        whatsapp.setMensagem("Ola! Podemos ajudar com alguma duvida?");

        System.out.println("===== WHATSAPP =====");
        whatsapp.canalDeComunicacao();
        whatsapp.perfilDeCliente();
        whatsapp.enviarMensagem();

        System.out.println();
        System.out.println("===== ESTADOS FINAIS =====");
        System.out.println("E-mail enviado: " + email.getEnviado());
        System.out.println("SMS enviado: " + sms.getEnviado());
        System.out.println("WhatsApp enviado: " + whatsapp.getEnviado());
    }
}
