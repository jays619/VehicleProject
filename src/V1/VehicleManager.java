package V1;
import java.util.Scanner;

public class VehicleManager {

	public String i1;
	public String i2;
	public String i3;
	public String i4;
	
	
	// boolean isCar;
	// System.out.print("Type 1 for car or 2 for motorcycle");
	// input -> isCar;
	//System.out.print("Which ");
	//if(isCar)
	// System.out.print(" car ");
	// else
	// System.out.print(" motorcycle");
	// System.out.print("would you like to access?");
	Motorcycle[] Mcycles = new Motorcycle[3];
	Car[] Cars = new Car[3];
	
	public void run(){
		
		
		
		Car car1 = new Car();
		car1.Color = "blue";
		car1.Make = "1996";
		car1.running = false;
		Cars[0] = car1;
		
		Car car2 = new Car();
		car2.running = false;
		car2.Color = "red";
		car2.Make = "2005";
		Cars[1] = car2;
		
		Car car3 = new Car();
		car3.running = false;
		car3.Color = "green";
		car3.Make = "1895";
		Cars[2] = car3;
		
		Motorcycle M1 = new Motorcycle();
		M1.Color = "beige";
		M1.Make = "2000";
		M1.running = false;
		Mcycles[0] = M1;
		
		Motorcycle M2 = new Motorcycle();
		M2.Color = "black";
		M2.Make = "2008";
		M2.running = false;
		Mcycles[1] = M2;
		
		Motorcycle M3 = new Motorcycle();
		M3.Color = "Magneto";
		M3.Make = "2010";
		M3.running = false;
		Mcycles[2] = M3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What car would you like to start? "
				+ "Car1 or Car2 or Car3. Use 1, 2, or 3 as a response.");
		i1 = keyboard.nextLine();
		if(i1.equals("1")){
			System.out.println("Car" + i1 + ": ");
			Cars[0].start();
			
		}
		if(i1.equals("2")){
			System.out.println("Car" + i1 + ": ");
			Cars[1].start();
		}
		if(i1.equals("3")){
			System.out.println("Car" + i1 + ": ");
			Cars[2].start();
		}
		
		
		System.out.println(" What Motorcycle would you like to start? "
				+ "Motor1 or Motor2 Motor3. Use 1, 2, or 3 as a response.");
		i2 = keyboard.nextLine();
		if(i2.equals("1")){
			System.out.println("Motorcycle" + i2 + ": ");
			Mcycles[0].start();
		}
		if(i2.equals("2")){
			System.out.println("Motorcycle" + i2 + ": ");
			Mcycles[1].start();
		}
		if(i2.equals("3")){
			System.out.println("Motorcycle" + i2 + ": ");
			Mcycles[2].start();
		}
		
		
		System.out.println(" What car would you like to Stop? "
				+ "Car1 or Car2 or Car3. Use 1, 2, or 3 as a response.");
		i3 = keyboard.nextLine();
		if(i3.equals("1")){
			System.out.println("Car" + i3 + ": ");
			Cars[0].stopped();
		}
		if(i3.equals("2")){
			System.out.println("Car" + i3 + ": ");
			Cars[1].stopped();
		}
		if(i3.equals("3")){
			System.out.println("Car" + i3 + ": ");
			Cars[2].stopped();
		}
		
		
		System.out.println(" What Motorcycle would you like to Stop? "
				+ "Motor1 or Motor2 Motor3. Use 1, 2, or 3 as a response.");
		i4 = keyboard.nextLine();
		if(i4.equals("0")){
			System.out.println("Motorcycle" + i4 + ": ");
			Mcycles[0].stopped();
		}
		if(i4.equals("1")){
			System.out.println("Motorcycle" + i4 + ": ");
			Mcycles[1].stopped();
		}
		if(i4.equals("3")){
			System.out.println("Motorcycle" + i4 + ": ");
			Mcycles[2].stopped();
		}
		
		System.out.println("These are the status's of all 6 vehicles "
				+ "Car 1:" +Cars[0].running + "Car 2:" + Cars[1].running + "Car 3:" + Cars[2].running
				+ "\nMotorcycle 1:" + Mcycles[0].running + " Motorcycle 2:" + Mcycles[1].running + " Motorcycle 3:"
				+ Mcycles[2].running);
	
	}
	
	
	
}
