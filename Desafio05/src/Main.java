import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("Deseja cadastrar uma nova pessoa? (s/n)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }

            Pessoa pessoa = new Pessoa();

            System.out.print("Digite o nome da pessoa: ");
            pessoa.setNome(scanner.nextLine());

            System.out.print("Digite o CPF da pessoa: ");
            pessoa.setCpf(scanner.nextLine());

            System.out.print("Digite o ano de nascimento da pessoa: ");
            pessoa.setAnoNascimento(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Quantos carros essa pessoa possui? ");
            int quantidadeCarros = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < quantidadeCarros; i++) {
                Carro carro = new Carro();
                System.out.print("Digite o modelo do carro " + (i + 1) + ": ");
                carro.setModelo(scanner.nextLine());
                pessoa.adicionarCarro(carro);
            }

            pessoas.add(pessoa);
        }

        // donos e seus carros
        for (Pessoa pessoa : pessoas) {
            System.out.println("Pessoa - nome: \"" + pessoa.getNome() + "\" - cpf: \"" + pessoa.getCpf() + "\" - ano nascimento: \"" + pessoa.getAnoNascimento() + "\"");
            System.out.println("Carros de \"" + pessoa.getNome() + "\":");
            int contador = 1;
            for (Carro carro : pessoa.getCarros()) {
                System.out.println("Carro " + contador + " - Modelo: \"" + carro.getModelo() + "\"");
                contador++;
            }
        }


    }
}