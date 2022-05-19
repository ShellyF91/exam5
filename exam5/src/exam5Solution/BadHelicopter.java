package exam5Solution;

public class BadHelicopter {
	

	void yawLeftRight(Sides side) {
		switch(side) {
		case LEFT:
			System.out.println("yawing left!");
			break;
		case RIGHT:
			System.out.println("yawing right!");
			break;
		default:
			System.out.println("");
		}
	}
	
	void fliesUpDown(Vertical vertical) {
		switch(vertical) {
		case UP:
			System.out.println("flying up!");
			break;
		case DOWN:
			System.out.println("flying down!");
			break;
		default:
			System.out.println("");
		}
	}
	
	void launchMissile() {
		System.out.println("launching a missile!");
	}

}
