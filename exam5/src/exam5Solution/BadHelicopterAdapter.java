package exam5Solution;

public class BadHelicopterAdapter implements Enemy {
	
	private BadHelicopter bedHelicopter; 
	
	public BadHelicopterAdapter(BadHelicopter bedHelicopter){
		this.bedHelicopter = bedHelicopter;
	}

	@Override
	public void turnLeftRight(Sides side) {
		
		switch(side) {
		case LEFT:
			System.out.println("instead of turning left, the bad helicopter is...");
			bedHelicopter.yawLeftRight(side);
			break;
		case RIGHT:
			System.out.println("instead of turning right, the bad helicopter is...");
			bedHelicopter.yawLeftRight(side);
			break;
		default:
			System.out.println("");
		}
	}

	@Override
	public void driveForwardBack(Direction direction) {
		
		switch(direction) {
		case FORWARD:
			System.out.println("instead of driving Forward, the bad helicopter is...");
			bedHelicopter.fliesUpDown(Vertical.UP);
			break;
		case BACKWARDS:
			System.out.println("instead of driving Backwards, the bad helicopter is...");
			bedHelicopter.fliesUpDown(Vertical.DOWN);
			break;
		default:
			System.out.println("");
		}
		
	}

	@Override
	public void fireWeapon() {
		System.out.println("instead of firing a weapon, the bad helicopter is...");
		bedHelicopter.launchMissile();
	}

}
