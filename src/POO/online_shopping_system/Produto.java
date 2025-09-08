package POO.online_shopping_system;

public class Produto {
    // atributos
    // categoria
    // marca
    // price
    // name

    public String productName;
    public String marca;
    public String categoria;
    public double price;

    public Produto(String productName, String marca, String categoria, double price) {
        this.productName = productName;
        this.marca = marca;
        this.categoria = categoria;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + productName + '\'' +
                ", marca='" + marca + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + price +
                '}';
    }
}
