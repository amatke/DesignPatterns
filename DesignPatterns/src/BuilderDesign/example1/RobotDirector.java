package BuilderDesign.example1;

/*Direktor treba da poziva pravljenje objekta.
Direktor vraca napravljeni objekat na kraju.*/
public class RobotDirector {

	
	private RobotBuilder robotBuilder;
	
	public RobotDirector(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}
	
	public Robot getRobot() {
		return this.robotBuilder.getRobot();
	}
	
	public void makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}
}
