package exam5Solution;

public class EnemyTank implements Enemy {

	@Override
	public void turnLeftRight(Sides side) {
		
		switch(side) {
		case LEFT:
			System.out.println("turning left!");
			break;
		case RIGHT:
			System.out.println("turning right!");
			break;
		default:
			System.out.println("");
		}

	}

	@Override
	public void driveForwardBack(Direction direction) {
		switch(direction) {
		case FORWARD:
			System.out.println("driving forward!");
			break;
		case BACKWARDS:
			System.out.println("driving backwards!");
			break;
		default:
			System.out.println("");
		}
	}

	@Override
	public void fireWeapon() {
		System.out.println("firing a weapon!");
	}



}
