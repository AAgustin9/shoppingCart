import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    // exista, esta vacio, pongo algo y se pone, saco algo y se saca, puedo listar las cosas,
    // pagar carrito, vaciar carrito
    String a = "aProduct";
    String b = "bProduct";

    @Test
    public void cartIsEmptyWhenCreated() {
        Cart aCart = new Cart();
        assertTrue(aCart.isEmpty());
    }

    @Test
    public void addItemToAnEmptyCart() {
        Cart aCart = new Cart();
        Product aProduct = new Product(a);
        aCart.add(aProduct);

        assertFalse(aCart.isEmpty());
        assertEquals(aCart.size(), 1);
    }

    @Test
    public void removeItemFromAnEmptyCart() {
        Cart aCart = new Cart();
        Product aProduct = new Product(a);

        assertFalse(aCart.remove(aProduct));
    }

    @Test
    public void addMultipleItemsToCart() {
        Cart aCart = new Cart();
        Product aProduct = new Product(a);
        Product bProduct = new Product(b);
        aCart.add(aProduct);
        aCart.add(bProduct);

        assertFalse(aCart.isEmpty());
        assertEquals(aCart.size(), 2);
    }

    @Test
    public void addMoreThatOneOfTheSameProductToTheCart() {
        Cart aCart = new Cart();
        Product aProduct = new Product(a);
        Product aProduct2 = new Product(a);
        aCart.add(aProduct);
        aCart.add(aProduct2);

        assertFalse(aCart.isEmpty());
        
    }

    @Test
    public void removeItemFromACartThatHasItem() {
        Cart aCart = new Cart();
        Product aProduct = new Product(a);
        aCart.add(aProduct);
        assertFalse(aCart.isEmpty());
        aCart.remove(aProduct);
        assertTrue(aCart.isEmpty());
    }

    @Test
    public void removeItemsWhenItsNotInCart() {
        Cart aCart = new Cart();
        Product aProduct = new Product(a);
        Product bProduct = new Product(b);

        aCart.add(aProduct);
        assertEquals(aCart.size(), 1);
        aCart.remove(bProduct);
        assertEquals(aCart.size(), 1);

    }

    @Test
    public void listItemsInCartWithThings() {
        Cart aCart = new Cart();
        Product aProduct = new Product(a);
        Product bProduct = new Product(b);
        aCart.add(aProduct);
        aCart.add(bProduct);
        List<String> expected = Arrays.asList("aProduct", "bProduct");
        assertEquals(aCart.listItems(), expected);
    }

    @Test
    public void listItemsInCartWhenEmpty() {
        Cart aCart = new Cart();
        Product aProduct = new Product(a);
        Product bProduct = new Product(b);

        List<String> expected = new ArrayList<>();
        assertEquals(aCart.listItems(), expected);

    }

    @Test
    public void emptyCartClearsAllProductsInTheCart() {
        Cart aCart = new Cart();
        Product aProduct = new Product(a);
        Product bProduct = new Product(b);
        aCart.add(aProduct);
        aCart.add(bProduct);

        assertEquals(aCart.size(), 2);
        assertFalse(aCart.isEmpty());

        aCart.clear();
        assertTrue(aCart.isEmpty());
        assertEquals(aCart.size(), 0);
    }
}
