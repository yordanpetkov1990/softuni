package RaceSystem;

public class SwimmingEvent implements Event {
    private double fastestLap;
    private Competitor[] lineup;

    @Override
    public Competitor[] getLineup() {
        return lineup;
    }

    @Override
    public void setLineUp(Competitor[] competitors) {
        lineup = competitors;
    }

}
