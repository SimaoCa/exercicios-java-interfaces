package notificacoes;

import interfaces.Notificacao;

public class NotificacaoEmail implements Notificacao {

    private String destinatario;
    private String perfilCliente;
    private String mensagem;
    private boolean enviado;

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getPerfilCliente() {
        return perfilCliente;
    }

    public void setPerfilCliente(String perfilCliente) {
        this.perfilCliente = perfilCliente;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public void canalDeComunicacao() {
        System.out.println("Canal escolhido: e-mail.");
    }

    @Override
    public void perfilDeCliente() {
        System.out.println("Perfil do cliente: " + perfilCliente + ".");
    }

    @Override
    public void enviarMensagem() {
        enviado = true;
        System.out.println("E-mail enviado para " + destinatario + ": " + mensagem);
    }
}
