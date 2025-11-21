package builder_and_singelton.task3;

import java.util.List;

public class Product {
    private static final int SHOP_COEF = 2;
    protected int price;
    protected String manufacturer;
    protected String model;


    public Product(int price, String manufacturer, String model) {
        this.price = price * SHOP_COEF;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
