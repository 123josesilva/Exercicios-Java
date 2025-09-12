package POO.online_shopping_system;

public class Usuario {

    private double id; 
    private String name; 
    private String email;  
    private Cart userCart;  

    public Usuario(double id, String name, String email){
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.userCart = new Cart(); 

    }

    public void addToCart(Produto produto){
        userCart.storageOfProducts(produto);
    } 

    public void viewCart(){
        userCart.showCart();
    }

}   
