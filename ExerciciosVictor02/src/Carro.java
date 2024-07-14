public class Carro {
        private String marca;
        private String modelo;
        private int ano;
        private String cor;

        // CONSTRITOR
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    // GET
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    // Set
    public void setCor(String cor) {
        this.cor = cor;
    }

// NÃO ENTENDI MUITO ESSA PARTE AINDA, PEGUEI MAIS DA INTERNET.
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }
}
