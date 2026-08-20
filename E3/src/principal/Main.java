package principal;

import funcionarios.FuncionarioPresencial;
import funcionarios.FuncionarioRemoto;

public class Main {

    public static void main(String[] args) {
        FuncionarioPresencial presencial = new FuncionarioPresencial();
        presencial.setFuncionario("Ana");
        presencial.setFuncao("Recepcionista");
        presencial.setEntrada(8.0);
        presencial.setSaida(17.0);

        System.out.println("===== FUNCIONARIO PRESENCIAL =====");
        presencial.selecionarFuncao();
        presencial.baterPontoEntrada();
        presencial.baterPontoSaida();

        System.out.println();

        FuncionarioRemoto remoto = new FuncionarioRemoto();
        remoto.setFuncionario("Carlos");
        remoto.setFuncao("Programador");
        remoto.setEntrada(9.0);
        remoto.setSaida(18.0);

        System.out.println("===== FUNCIONARIO REMOTO =====");
        remoto.selecionarFuncao();
        remoto.baterPontoEntrada();
        remoto.baterPontoSaida();
    }
}
