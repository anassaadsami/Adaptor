package Adaptor2;

public class AliAdaptor implements Gun, MachineGun{
	Ali a ; 

	public AliAdaptor(Ali a) {
		this.a = a;
	}

	@Override
	public void useMachineGun() {
		a.shootMachineGun();
	}

	@Override
	public void useGun() {
		a.shootGun();
		
	}

}
