class Catalogue {

    private Map<Product, Double> productosDisponibles = new HashMap<>();

    public Catalogue() {}

    public void addProduct(Product product, double price) {
        productosDisponibles.put(product, price);
    }

    public double getPriceFromProduct(Product product) {
        return productosDisponibles.get(product);
    }
}
