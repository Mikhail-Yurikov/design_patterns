package builder_and_singelton.task3;

public class KeyWordFilter implements Filter<Product> {

    private final String keyWord;

    public KeyWordFilter(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public boolean doFiltration(Product product) {
        return product.getManufacturer().toLowerCase().contains(keyWord.toLowerCase()) || product.getModel().toLowerCase().contains(keyWord.toLowerCase());
    }
}
