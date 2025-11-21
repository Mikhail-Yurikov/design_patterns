package builder_and_singelton.task3;

public class PriceFilter implements Filter<Product> {
    private final int price;

    public PriceFilter(int price) {
        this.price = price;
    }

    @Override
    public boolean doFiltration(Product product) {
        return product.getPrice() <= price;
    }
}
