import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @Test
    public void testAddOneApple(){
        Cart cart = new Cart();
        Apple apple = new Apple(50);

        cart.add(apple, 1);

        double totalPrice = cart.getTotalPrice();

        assertEquals(50, totalPrice);
    }

    @Test
    public void testTwoApples(){
        Cart cart = new Cart();
        Apple apple = new Apple( 50);

        cart.add(apple, 2);

        double totalPrice = cart.getTotalPrice();

        assertEquals(100, totalPrice);
    }

    @Test
    public void testAddOneBanana(){
        Cart cart = new Cart();
        Banana banana = new Banana(30);

        cart.add(banana, 1);

        assertEquals(30, cart.getTotalPrice());
    }

    @Test
    public void testAddQuantityZero(){
        Cart cart = new Cart();
        Banana banana = new Banana(30);

        cart.add(banana, 0);

        assertEquals(0, cart.getTotalPrice());
    }

    @Test
    public void testAddOneBananaAndOneApple(){
        Cart cart = new Cart();
        Banana banana = new Banana(30);
        Apple apple = new Apple( 50);

        cart.add(banana, 1);
        cart.add(apple, 1);

        assertEquals(80, cart.getTotalPrice());
    }

    @Test
    public void testApplyDiscountApple(){
        Cart cart = new Cart();
        Apple apple = new Apple( 50);

        Offer offer = new Offer(Apple.class, 3, 130);
        cart.addOffer(offer);

        cart.add(apple, 3);

        assertEquals(130, cart.getTotalPrice());
    }
}
