public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, "Preto");

        // PEGANDANDO E IMPRIMINDO AS ATRIBUIÇÕES
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());

    }
}