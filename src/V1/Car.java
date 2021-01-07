package V1;

public class Car extends motorVehicle implements engineV1{
	
	


	public void start() {
		running = true;
		System.out.println(this.Make + '\n' + this.Color + "\n This car has been started.");
	}

	
	public void stopped() {
		
		running = false;
		System.out.println(this.Make + '\n' + this.Color + "\n This car has been stopped.");
		
		
	}

}
