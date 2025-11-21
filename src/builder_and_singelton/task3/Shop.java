package builder_and_singelton.task3;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    protected List<Product> productList = new ArrayList<>();


    void addProduct(Product product) {
        productList.add(product);
    }

    void showAll() {
          productList.forEach(System.out::println);
    }

    public void applyFilters(Filter<Product> filters) {
        List<Product> filteredProducts = new ArrayList<>(productList);
        filteredProducts.removeIf(product -> !filters.doFiltration(product));
        filteredProducts.forEach(System.out::println);
    }
}
