package izpit_java_tu_1;

public class Participant {
    private static int count = 1;

    private long id;
    private String name;
    private int age;
    private double chanceToWin;
    private double betForWin;

    public Participant( String name, int age, double chanceToWin, double betForWin) {
        this.id = count;
        count++;
        this.name = name;
        this.age = age;
        this.chanceToWin = chanceToWin;
        this.betForWin = betForWin;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getChanceToWin() {
        return chanceToWin;
    }

    public void setChanceToWin(double chanceToWin) {
        this.chanceToWin = chanceToWin;
    }

    public double getBetForWin() {
        return betForWin;
    }

    public void setBetForWin(double betForWin) {
        this.betForWin = betForWin;
    }
}
