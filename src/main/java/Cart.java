import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<Fruit> items = new ArrayList<Fruit>();
    
	public void add(Fruit apple, int quantity) {
    	for(int i=0; i<quantity; i++)
    		items.add(apple);
    }

    public double getTotalPrice() {
    	double totalPrice = 0;
    	
    	for(Fruit a: items) {
    		totalPrice+=a.getPrice();
    	}
        return totalPrice;
    }
}
