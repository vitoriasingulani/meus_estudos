import java.util.ArrayList;
import java.util.List; // cuuuuidado para nao esquecer os imports!!!!!!!!

public class Pessoa {
    private String nome;
    private String cpf;
    private int anoNascimento;
    private List<Carro> carros;

    public Pessoa() {
        this.carros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void adicionarCarro(Carro carro) {
        this.carros.add(carro);
    }
}

