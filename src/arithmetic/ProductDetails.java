package arithmetic;

public class ProductDetails {

    int prices;
    String description;

    ProductDetails(int prices, String description){
        this.prices=prices;
        this.description=description;
    }

    public int getPrices() {
        return prices;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "prices=" + prices +
                ", description='" + description + '\'' +
                '}';
    }
}
