class Cashier {

    private Catalogue catalogue;

    public void Cashier(Catalogue catalogue) {
        this.cart = cart;
        this.paymentMethod = paymentMethod;
        this.catalogue = catalogue;
    }

    public double calculateTotalForCart(Cart cart) {
        private final List<String> items = cart.listItems();

        double total = 0;
        for (String item : items) {
            total += catalogue.getPriceFromProduct(item.toString());
        }
        return total;
    }

    public boolean processPayment(Cart cart, PaymentMethod paymentMethod) {
        double total = calculateTotalForCart(cart);
        return paymentMethod.processPayment(total);
    }
}
