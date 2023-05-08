import java.awt.*;
import java.util.Scanner;

public class RobotEngineer {
    public Robot robot;
    public BuilderRobot build;

    public RobotEngineer() {
        robot = new Robot();
        build = new BuilderRobot();
    }

    public Robot getRobot(){
    return robot;
    }

    public void hacerRobot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite el tipo de cabeza");
        String params = sc.nextLine();
        robot.robotCabeza = build.buildRobotCabeza(params);
        System.out.println("digite el tipo de torzo");
        params = sc.nextLine();
        robot.robotTorzo = build.buildRobotTorzo(params);
        System.out.println("digite el tipo de armas");
        params = sc.nextLine();
        robot.robotArmas = build.buildRobotArmas(params);
        System.out.println("digite el tipo de piernas");
        params = sc.nextLine();
        robot.robotPiernas = build.buildRobotPiernas(params);
    }
}
