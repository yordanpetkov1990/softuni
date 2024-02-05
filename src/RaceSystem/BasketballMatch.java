package RaceSystem;

public class BasketballMatch implements Event {
    private double mostPointsScored;
    private Competitor[] lineup;

    @Override
    public Competitor[] getLineup() {
        return lineup;
    }
    public void setLineUp(Competitor[] competitors) {
        this.lineup = competitors;
    }
}
