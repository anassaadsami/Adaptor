package AdaptorInfo;
/*
 * this class is as a connect between EnemyAttacker and EnemyCar
 */
public class EnemyCarAdaptor implements EnemyAttacker {    
	EnemyCar car ;   // here we have reference variable of type EnemyCar class as a field 

	public EnemyCarAdaptor(EnemyCar car) {   // constructor
		this.car = car;
	}

	@Override
	public void fire() {
		car.pumb();
		
		
	}

	@Override
	public void attack() {
		car.drive();
		
	}
	
	public static void main(String[] args) { 
		/*
		 * now we talk about relationship between Soldier and EnemyAttack
		 */
		
		Soldier s1 = new Soldier("anas");
		s1.fire();
		s1.attack();
		
		System.out.println();
		
		// we can make the same but by polymorphism
		EnemyAttacker s2 = new Soldier("ali");
		s2.fire();
		s2.attack();
		
		System.out.println("----------------");
		
		EnemyCar car1 = new EnemyCar("Dababe 1");
		car1.drive();   // car1 just can use it's methods 
		car1.pumb();
		
		/*
		 *  but now there is no relationship between EnemyCar and EnemyAttacker so can NOT use polymorphism
		 *  and that's why use Adaptor
		 */
//		car1.fire()  //error
//		car1.attack();   //error
		
		
//		EnemyAttacker y = new EnemyCarAdaptor(car1);
//		y.fire();
		System.out.println("---------- Adaptor -----------\n ");
		
		EnemyCarAdaptor c1 = new EnemyCarAdaptor(car1); // the same code in lines 41,42
		c1.fire();    // here Dababe 1 can use fire() method and make it's implementations
		c1.attack();
		System.out.println("-------------s");
		// here we can use polymorphism
		EnemyAttacker c2 = new EnemyCarAdaptor(car1);
		c2.fire();
		c2.attack();
				
		
	}
	
}
