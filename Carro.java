public class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getDescricao() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}
