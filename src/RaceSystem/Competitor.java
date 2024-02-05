package RaceSystem;

public class Competitor {
    private long id;
    private String name;
    private int age;
    private double oddsToWin;
    private double betForWin;

    public Competitor(long id, String name, int age, double oddsToWin, double betForWin) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.oddsToWin = oddsToWin;
        this.betForWin = betForWin;
    }

    public long getId() {
        return id;
    }

    public double getBetForWin() {
        return betForWin;
    }

    public double getOddsToWin() {
        return oddsToWin;
    }

    public void setOddsToWin(double oddsToWin) {
        this.oddsToWin = oddsToWin;
    }
}
