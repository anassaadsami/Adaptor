package Adaptor2;

public class Anas implements Gun, MachineGun{
	String name;

	public Anas(String name) {
		this.name = name;
	}

	@Override
	public void useMachineGun() {
		System.out.printf("%s use machine gun.%n",this.name);
		
	}

	@Override
	public void useGun() {
		System.out.printf("%s use gun.%n",this.name);
		
	}
	

}
