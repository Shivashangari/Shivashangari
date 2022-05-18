package Task_18;

class Benz extends Maruti {
	Benz() {
		System.out.println("Class Benz");
	}

	public void speed() {
		System.out.println("Maximum speed: 100Kmph");
		super.speed();
		
	}
}