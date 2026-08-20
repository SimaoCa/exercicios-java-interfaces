package funcionarios;

import interfaces.RegistroFuncionario;

public class FuncionarioPresencial implements RegistroFuncionario {

    private String funcionario;
    private String funcao;
    private double entrada;
    private double saida;

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(double saida) {
        this.saida = saida;
    }

    @Override
    public void selecionarFuncao() {
        System.out.println(funcionario + " trabalha como " + funcao + " de forma presencial.");
    }

    @Override
    public void baterPontoEntrada() {
        System.out.println("Entrada registrada na catraca da empresa as " + entrada + " horas.");
    }

    @Override
    public void baterPontoSaida() {
        System.out.println("Saida registrada na catraca da empresa as " + saida + " horas.");
    }
}
