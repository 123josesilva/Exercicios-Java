package POO.online_shopping_system;

public class Main {
    public static void main(String[] args) {
        System.out.println("bem vindo ao filtradao");
        String pName = "Coador de Café HARIO Branco";
        String pMarca = "HARIO"; 
        String pCategoria = "café"; 
        double pPrice = 65.90; 
        Produto v60 = new Produto(pName, pMarca, pCategoria, pPrice);  
        Usuario mario = new Usuario();
        Cart marioCart = new Cart(); 
        mario.addToCart(marioCart, v60); 
        marioCart.showCart();
    }

}
