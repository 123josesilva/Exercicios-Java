package POO.online_shopping_system;

import java.util.ArrayList;

public class Cart {
    // actions
    public Produto products;
    public Produto[] storage;
    // methods
    // cart product storage
    // show cart
    // total do carrinho

    // metodo para armazenar produtos{quantidade, prduto}
    ArrayList<Produto> listCart = new ArrayList<Produto>();

    public void storageOfProducts(Produto prod) {
        listCart.add(prod); 
    }

    public void showCart(){
        System.out.println(listCart.size());
        System.out.println(listCart);
    }
}
