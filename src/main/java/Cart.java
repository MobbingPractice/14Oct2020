import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<Fruit> items = new ArrayList<>();
	Offer offer;
    
	public void add(Fruit fruit, int quantity) {
    	for(int i=0; i<quantity; i++)
    		items.add(fruit);
    }

    public double getTotalPrice() {
    	double totalPrice = 0;
    	
    	for(Fruit a: items) {
    		totalPrice+=a.getPrice();
    	}
        return totalPrice;
    }

	public void addOffer(Offer offer) {
		this.offer = offer;
	}
}
