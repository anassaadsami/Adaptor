package Adaptor2;

public class Main {

	public static void main(String[] args) {
		Anas a1 = new Anas("anas1");
		a1.useGun();
		a1.useMachineGun();
		Gun g = new Anas("anas2");
		// polymorphism   the same but there is no g.useMachineGun()
		g.useGun();   
		 
		System.out.println("----------------");
		/*
		 * if i want to use Ali class with Interfaces Gun, MachineGun 
		 * without implements them using Adaptor ( AliAdaptor class)
		 * 
		 * here aa use interfaces's  methods name with Ali class methods' implementation
		 */
		Ali b1 = new Ali("ali1");
		AliAdaptor aa = new AliAdaptor(b1);
		aa.useGun();     
		aa.useMachineGun();
		// polymorphism   the same 
		
		Gun g2 = new AliAdaptor(b1);
		g2.useGun();   // g2.useMachineGun() is error
		MachineGun m = new AliAdaptor(b1);
		m.useMachineGun();  // g2.useGun() is error 
	}

}
