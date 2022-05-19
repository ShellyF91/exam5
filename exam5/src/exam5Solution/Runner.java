package exam5Solution;

public class Runner {
	
//The Adapter pattern 
	public static void main(String[] args) {
		
		EnemyTank enemyTank = new EnemyTank();
		BadHelicopterAdapter badHelicopterAdapter = new BadHelicopterAdapter(new BadHelicopter());
		
		System.out.println("enemyTank:");
		enemyTank.turnLeftRight(Sides.RIGHT);
		enemyTank.driveForwardBack(Direction.BACKWARDS);
		enemyTank.fireWeapon();
		
		System.out.println("");
		
		System.out.println("badHelicopter:");
		badHelicopterAdapter.turnLeftRight(Sides.RIGHT);
		badHelicopterAdapter.driveForwardBack(Direction.BACKWARDS);
		badHelicopterAdapter.fireWeapon();
	}
}
