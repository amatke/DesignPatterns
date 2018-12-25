package BuilderDesign.example1;

public class TestRobotBuilder {

	public static void main(String[] args) {

		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		RobotDirector robotDirector = new RobotDirector(oldStyleRobot);
		
		robotDirector.makeRobot();
		
		Robot firstRobot = robotDirector.getRobot();
		
		System.out.println(firstRobot.getRobotHead());
	}

}
