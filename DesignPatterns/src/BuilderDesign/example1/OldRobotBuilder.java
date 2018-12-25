package BuilderDesign.example1;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Blowtorch Arms");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Big arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Legs");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
