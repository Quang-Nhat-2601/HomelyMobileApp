package com.example.homely;

public class CartItem {
    private Product product;
    private int numberInCart;

    public CartItem(Product product, int numberInCart) {
        this.product = product;
        this.numberInCart = numberInCart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}
