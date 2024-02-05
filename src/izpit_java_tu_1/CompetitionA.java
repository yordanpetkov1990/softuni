package izpit_java_tu_1;

public abstract class CompetitionA implements Competition{

    protected Participant[] schedule;
    public CompetitionA(){
        schedule = new Participant[2];
    }

    @Override
    public Participant[] getSchedule() {
        return schedule;
    }


}
