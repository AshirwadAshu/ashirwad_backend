package abstraction;

abstract class Plane {
	
	abstract void takeOff();
	abstract void fly();
    abstract void land();
	
}	
 class CargoPlane extends Plane{
	 
	 void takeOff() {
		 System.out.println("Cargo plane takeOff in long runway");
	 }

	@Override
	void fly() {
		System.out.println("cargo plane flying in low height");
		
	}

	@Override
	void land() {
		System.out.println("Cargo plane is landing on long size runway");
		
	}
	 
 }
class PassengerPlane extends Plane{

	@Override
	void takeOff() {
		System.out.println("Passenger is takeOff in medium size runway");
		
	}

	@Override
	void fly() {
		System.out.println("Passenger plane fyling at medium heghit");
		
	}

	@Override
	void land() {
		System.out.println("Passenger plane land on medium size runway");
		
	}
	
}

class FighterPlane extends Plane{

	@Override
	void takeOff() {
		System.out.println("FighterPlane is takeOff in Short size runway");
		
	}

	@Override
	void fly() {
		System.out.println("Fighterplane fyling at great heghit");
		
	}

	@Override
	void land() {
		System.out.println("Fighterplane land on short size runway");
		
	}
	
}

class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		
	}
}
class Demo{
public static void main(String[] args) {
	CargoPlane cp = new CargoPlane();
	PassengerPlane pp = new PassengerPlane();
	FighterPlane fp = new FighterPlane();
	
	Airport ap = new Airport();
	ap.permit(cp);
	ap.permit(pp);
	ap.permit(fp);
	
	
	
}
}