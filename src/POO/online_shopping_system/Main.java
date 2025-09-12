package POO.online_shopping_system;

public class Main {
    public static void main(String[] args) {
        System.out.println("bem vindo ao filtradao");
        Usuario mario = new Usuario(174.01, "mario", "mm@gmail.com");
        String pName = "Coador de Café HARIO Branco";
        String pMarca = "HARIO"; 
        String pCategoria = "café"; 
        double pPrice = 65.90; 
        Produto v60 = new Produto(pName, pMarca, pCategoria, pPrice);  
        Produto grao = new Produto("Café Super Especial ARARA Torrado e Moído", "Coffee Mais ", "café moido", 39.90); 

     
        mario.addToCart(v60); 
        mario.addToCart(grao);

        mario.viewCart();
    }

}
