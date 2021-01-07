package V1;

public class Motorcycle extends motorVehicle implements engineV1{

	
	public void start() {
		running = true;
		System.out.println(this.Make + '\n' + this.Color + "\n This Motorcycle has been started.");
	}

	
	public void stopped() {
		
		running = false;
		System.out.println(this.Make + '\n' + this.Color + "\n This Motorcycle has been stopped.");
	}

}
