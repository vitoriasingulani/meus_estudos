public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        // ATRIBUIÇÕES DOS SET
        pessoa.setNome("MARIA VITORIA");
        pessoa.setEndereco("Rua MORISE DE MIRANDA GUSMÃO, 216");
        pessoa.setCpf("172.200.317-00");
        pessoa.setIdade(23);
        pessoa.setPeso(65.0);
        pessoa.setAltura(1.65);
        pessoa.setRenda(1000.0);

        // PEGADO E IMPRIMINDO OS ATRIBUTOS
        System.out.println("Nome: " + pessoa.getNome());

        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("CPF: " + pessoa.getCpf());

        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Renda: " + pessoa.getRenda());

        // RESULTADO
        System.out.println(pessoa);
    }
}
