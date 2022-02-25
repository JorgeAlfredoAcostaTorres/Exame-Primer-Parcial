package uaslp.objetos.parcial1.examen.pos;

public class Product {
    public String name;
    public float precio;

    public Product(String name, float precio) {
        this.name = name;
        this.precio = precio;
    }

    public PointOfSale getProducts() {
        return new PointOfSale(this);
    }
}
