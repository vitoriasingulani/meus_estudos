public class Main {
    public static void main(String[] args) {

        // add
        Estudante estudante1 = new Estudante("Alice", 1);
        Estudante estudante2 = new Estudante("Bob", 2);
        Estudante estudante3 = new Estudante("Carlos", 3);

        // turma
        Turma turma1 = new Turma("Matemática Primeiro Ano ");

        // Add estudantes na turma
        turma1.adicionarEstudante(estudante1);
        turma1.adicionarEstudante(estudante2);
        turma1.adicionarEstudante(estudante3);

        // apos add
        System.out.println(turma1);

//        // Remover um estudante
//        turma1.removerEstudante(estudante2);

//        // Imprimindo turma dnv
//        System.out.println(turma1);
    }
}