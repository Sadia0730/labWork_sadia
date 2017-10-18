package Sadiaclasswork;

public class Main {

	public static void doSomething(Vehicle_interface... vehicles) {
		for(Vehicle_interface v : vehicles) {
			if(v instanceof Car) {
				Car c = (Car) v;
				c.aFunc();
			}
			if(v instanceof Bus) {
				Bus b = (Bus) v;
				b.aFunc();
			}
			if(v instanceof Ship) {
				Ship s = (Ship) v;
				s.aFunc();
			}
			if(v instanceof Boat) {
				Boat bt = (Boat) v;
				bt.aFunc();
			}
			if(v instanceof Aeroplane) {
				Aeroplane a = (Aeroplane) v;
				a.aFunc();
			}
			if(v instanceof Helicopter) {
				Helicopter h = (Helicopter) v;
				h.aFunc();
			}
		}
	}
	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		Main obj= new Main();
		Bus p=new Bus();
		Car q=new Car();
		Boat r=new Boat();
		Ship s=new Ship();
		Aeroplane t=new Aeroplane();
		obj.doSomething(p,q,r,s,t);
			
	}
	

}
