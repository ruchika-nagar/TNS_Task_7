package TNS_task_7;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pizza pizza1 = new Pizza("large", 2, 1, 1);
	     Pizza pizza2 = new Pizza("medium", 2, 2, 1);

	     PizzaOrder order = new PizzaOrder();
	     order.addPizza(pizza1);
	     order.addPizza(pizza2);

	     System.out.println("Pizza 1 Description: " + pizza1.getDescription());
	     System.out.println("Pizza 1 Cost: $" + pizza1.calcCost());

	     System.out.println("Pizza 2 Description: " + pizza2.getDescription());
	     System.out.println("Pizza 2 Cost: $" + pizza2.calcCost());

	     System.out.println("Total Cost of Order: $" + order.calcTotal());
	}
	}


