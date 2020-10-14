import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

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
}
