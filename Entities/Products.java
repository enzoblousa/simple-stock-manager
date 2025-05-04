public class Products {
    private String nameProduct;
    private Double price;
    private Integer quantity;
    
public Products(){
    }
    
public Products(String nameProduct, Double price, Integer quantity) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
    }

public String getNameProduct() {
    return nameProduct;
}

public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
}

public Double getPrice() {
    return price;
}

public void setPrice(Double price) {
    this.price = price;
}

public Integer getQuantity() {
    return quantity;
}

public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}

public double totalPrice(){
    return price * quantity;
}

public String toString() {
    return String.format("Quantidade de itens:%3d | Total: R$ %.2f",
        quantity, totalPrice());
}
}
