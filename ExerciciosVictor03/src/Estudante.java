
public class Estudante {
    private String nome;
    private int id;

    // Construtor
    public Estudante(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}