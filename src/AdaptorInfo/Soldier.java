package AdaptorInfo;

class Soldier implements EnemyAttacker{
	/*
	 * class soldier implements the class EnemyAttacker Interface and can use all it's actions
	 */
	String name;

	public Soldier(String name) {
		this.name = name;
	}

	@Override
	public void fire() { 
		System.out.printf( "soldier %s is shooting fire.%n",this.name );
		
	}

	@Override
	public void attack() {
		System.out.printf( "soldier %s is attacking.%n",this.name );
		
	}
	
}
