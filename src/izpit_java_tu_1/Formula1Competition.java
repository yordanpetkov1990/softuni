package izpit_java_tu_1;

public class Formula1Competition extends CompetitionA{
    private double winnersTime;

    public Formula1Competition(double winnersTime) {
        super();
        this.winnersTime = winnersTime;
    }
    public Formula1Competition(){
        super();
    }

    public double getWinnersTime() {
        return winnersTime;
    }

    public void setWinnersTime(double winnersTime) {
        this.winnersTime = winnersTime;
    }
}
