public class Pessoa {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;
    private double peso;
    private double altura;
    private double renda;

                // CONSTRUTOR
    public Pessoa() {
    }

    // GET
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public double getRenda() {
        return renda;
    }

    // SET
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Pessoa:" +
                "nome=" + nome +
                ", endereco=" + endereco +
                ", cpf=" + cpf +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                ", renda=" + renda ;
        }
    }

