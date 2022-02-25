package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class PointOfSale {
    public int cantidad;
    public Product product;

    public PointOfSale(Product product) {
        this.product = product;
    }

    public PointOfSale() {

    }

    public void addToCart(int cantidad, Product name) {
        this.cantidad = cantidad;
    }

    public ArrayList<CartItem> getProducts() {
        return null;
    }

    public int getTotal() {
        return 0;
    }

    public String getCountByName(String name) {
        return null;
    }
}
