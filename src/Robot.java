public class Robot implements RobotPlan{
    public String robotCabeza;
    public String robotTorzo;
    public String robotArmas;
    public String robotPiernas;


    @Override
    public String toString() {
        return "Robot{" +
                "robotCabeza='" + robotCabeza + '\'' +
                ", robotTorzo='" + robotTorzo + '\'' +
                ", robotArmas='" + robotArmas + '\'' +
                ", robotPiernas='" + robotPiernas + '\'' +
                '}';
    }
}
