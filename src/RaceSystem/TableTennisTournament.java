package RaceSystem;

public class TableTennisTournament implements Event {
    private double LongestMatch;
    private Competitor[] lineup;

    @Override
    public Competitor[] getLineup() {
        return lineup;
    }

    @Override
    public void setLineUp(Competitor[] competitors) {
        this.lineup = competitors;
    }
}
