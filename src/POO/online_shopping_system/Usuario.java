package POO.online_shopping_system;

public class Usuario {
    //atributo 
    //id
    // name
    //email 
    //cart 
    public double id; 
    public String name; 
    public String email;  
    public Produto prod; 
    public Cart userCart;  

    public void addToCart(Cart userCart, Produto prod){
        userCart.storageOfProducts(prod);
    } 

}
