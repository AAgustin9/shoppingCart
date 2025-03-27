public class CashierTest {

    /*
        - cobrarlo
            - recibir el metodo de pago
            - calcular precio total
                - aplicar descuentos
        - entergar factura dsp de pago
        - Anular compra
        - Consultar precio de un producto

    */

    @Test
    public void calculateTotalForCart() {
        Catalogue catalogue = new Catalogue();
        Product a = new Product("a");
        Product b = new Product("b");
        catalogue.addProduct(a, 10);
        catalogue.addProduct(b, 20);

        Cart aCart = new Cart();
        aCart.add(a);
        aCart.add(b);

        Cashier cashier = new Cashier(catalogue);
        double total = cashier.calculateTotalForCart(aCart);

        assertEquals(total, 30);
    }

    @Test
    public void processPayment() {
        Catalogue catalogue = new Catalogue();
        Product a = new Product("a");
        Product b = new Product("b");
        catalogue.addProduct(a, 10);
        catalogue.addProduct(b, 20);

        Cart aCart = new Cart();
        aCart.add(a);
        aCart.add(b);

        Cashier cashier = new Cashier(catalogue);
        PaymentMethod paymentMethod = new PaymentMethod();
        boolean result = cashier.processPayment(aCart, paymentMethod);

        assertTrue(result);
    }
}
