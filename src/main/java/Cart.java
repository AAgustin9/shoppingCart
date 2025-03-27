import java.util.ArrayList;
import java.util.List;

public class Cart {

    private ArrayList<Product> items = new ArrayList<>();

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void add(Product product) {
        this.items.add(product);
    }

    public boolean remove(Product product) {
        if (isEmpty()) {
            return false;
        } else {
            items.remove(product);
            return true;
        }
    }

    public int size() {
        return items.size();
    }

    public List<String> listItems() {
        List<String> products = new ArrayList<>();
        for (Product item : items) {
            products.add(item.toString());
        }
        return products;
    }

    public void clear() {
        while (!items.isEmpty()) {
            items.remove(0);
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product item : items) {
            total += Catalogue.getPriceFromProduct(item.toString());
        }
        return total;
    }
}
