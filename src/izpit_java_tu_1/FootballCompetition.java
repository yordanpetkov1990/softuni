package izpit_java_tu_1;

public class FootballCompetition extends CompetitionA{
    private double fastestGoal;


    public FootballCompetition(double fastestGoal) {
        super();
        this.fastestGoal = fastestGoal;
    }
    public FootballCompetition(){
        super();
    }

    public double getFastestGoal() {
        return fastestGoal;
    }

    public void setFastestGoal(double fastestGoal) {
        this.fastestGoal = fastestGoal;
    }
}
