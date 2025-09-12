package POO.online_shopping_system;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Produto> produtos = new ArrayList<>();
    private double totalCart;

    public void storageOfProducts(Produto produto) {
        produtos.add(produto);
    }

    public void showCart() {
        
        for (int i = 0; i < produtos.size(); i++) {
            totalCart = totalCart + produtos.get(i).price;
            System.out.println("" + produtos.get(i).productName);
            System.out.println("" + produtos.get(i).marca);
            System.out.println("" + produtos.get(i).price);
        }

        System.out.println("totoal do carrinho: " + totalCart);
        System.out.println("quantidade de itens: " + produtos.size());
    }
}
