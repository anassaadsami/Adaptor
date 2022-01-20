package AdaptorInfo;

public class EnemyCar {   
	/*
	 *   this is adaptee in design pattern's concept and it means we want to
	 *    use Interface's action without implements it by using Adaptor 
	 */
	
	String name ;
	
	public EnemyCar(String name) {
		this.name = name;
	}

	/*
	 * this class does't implements EnemyAttacker and we want to use
	 * EnemyAttacker methods but without change inside EnemyCar class
	 * by implementation the EnemyAttacker's all abstract methods!!
	 */
	
	public void pumb() {
		System.out.printf("%s is bumbing a fire.%n",this.name);
		
	}

	public void drive() {
		System.out.printf("%s is forword.%n", this.name);
		
	}
	

}
