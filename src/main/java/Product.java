import java.util.ArrayList;

public class Product {
    private String code;
    private String name;
    private double price;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Packaging Option{" +
                "code='" + this.code + "'" +
                ", name='" + this.name + "'" +
                ", price=" + this.price + "}";
    }

    /**
     * If mismatch in order results in failure.
     * Incase of user defined objects, the objects should override equals() method.
     * Then assertArrayEquals() method called equals method to check the equality on each object.
     */
    public boolean equals(Object obj){
        Product product = (Product) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(product.name)
                && this.code.equalsIgnoreCase(product.code)
                && this.price == product.price){
            status = true;
        }
        return status;
    }

    public static ArrayList<Product> getProductList() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("CE", "Cheese", 5.95d));
        products.add(new Product("HM", "Ham", 7.95d));
        products.add(new Product("SS", "Soy Sauce", 11.95d));
        return products;
    }
}
