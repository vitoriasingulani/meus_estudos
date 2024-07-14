import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nomeDaTurma;
    private List<Estudante> estudantes;

    // Construtor
    public Turma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
        this.estudantes = new ArrayList<>();
    }


    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }


    public void removerEstudante(Estudante estudante) {
        estudantes.remove(estudante);
    }

    public Estudante[] getEstudantes() {
        return estudantes.toArray(new Estudante[0]);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nomeDaTurma='" + nomeDaTurma + '\'' +
                ", estudantes=" + estudantes +
                '}';
    }
}