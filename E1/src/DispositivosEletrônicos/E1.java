package DispositivosEletrônicos;

import DispositivosCadastrados.DispositivoComum;
import DispositivosCadastrados.DispositivoInteligente;
import DispositivosCadastrados.Dispositivos;
import java.util.ArrayList;
import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Dispositivos> dispositivos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== CONTROLE DE DISPOSITIVOS =====");
            System.out.println("1 - Cadastrar dispositivo");
            System.out.println("2 - Listar dispositivos");
            System.out.println("3 - Ligar dispositivo");
            System.out.println("4 - Desligar dispositivo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarDispositivo(scanner, dispositivos);
                    break;

                case 2:
                    listarDispositivos(dispositivos);
                    break;

                case 3:
                    alterarEstado(scanner, dispositivos, true);
                    break;

                case 4:
                    alterarEstado(scanner, dispositivos, false);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarDispositivo(
            Scanner scanner,
            ArrayList<Dispositivos> dispositivos
    ) {
        System.out.println("\n1 - Dispositivo comum");
        System.out.println("2 - Dispositivo inteligente");
        System.out.print("Categoria: ");
        int categoria = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do dispositivo: ");
        String nome = scanner.nextLine();

        System.out.print("Tipo do dispositivo: ");
        String tipo = scanner.nextLine();

        Dispositivos novoDispositivo;

        if (categoria == 2) {
            System.out.print("Tipo de conexão (Wi-Fi, Bluetooth etc.): ");
            String conexao = scanner.nextLine();

            DispositivoInteligente dispositivoInteligente =
                    new DispositivoInteligente();

            dispositivoInteligente.setNome(nome);
            dispositivoInteligente.setTipo(tipo);
            dispositivoInteligente.setTipoConexao(conexao);

            novoDispositivo = dispositivoInteligente;
        } else {
            DispositivoComum dispositivoComum = new DispositivoComum();

            dispositivoComum.setNome(nome);
            dispositivoComum.setTipo(tipo);

            novoDispositivo = dispositivoComum;
        }

        dispositivos.add(novoDispositivo);
        System.out.println("Dispositivo cadastrado com sucesso.");
    }

    private static void listarDispositivos(
            ArrayList<Dispositivos> dispositivos
    ) {
        if (dispositivos.size() == 0) {
            System.out.println("Nenhum dispositivo cadastrado.");
            return;
        }

        for (int i = 0; i < dispositivos.size(); i++) {
            System.out.println(i + " - " + dispositivos.get(i));
        }
    }

    private static void alterarEstado(
            Scanner scanner,
            ArrayList<Dispositivos> dispositivos,
            boolean ligar
    ) {
        if (dispositivos.size() == 0) {
            System.out.println("Nenhum dispositivo cadastrado.");
            return;
        }

        listarDispositivos(dispositivos);

        System.out.print("Digite o número do dispositivo: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice < 0 || indice >= dispositivos.size()) {
            System.out.println("Dispositivo inválido.");
            return;
        }

        Dispositivos dispositivo = dispositivos.get(indice);

        if (ligar) {
            dispositivo.ligar();
        } else {
            dispositivo.desligar();
        }
    }
}
