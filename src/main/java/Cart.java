import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<Apple> items = new ArrayList<Apple>();
    
	public void add(Apple apple, int quantity) {
    	for(int i=0; i<quantity; i++)
    		items.add(apple);
    }

    public double getTotalPrice() {
    	double totalPrice = 0;
    	
    	for(Apple a: items) {
    		totalPrice+=a.getPrice();
    	}
        return totalPrice;
    }
}
