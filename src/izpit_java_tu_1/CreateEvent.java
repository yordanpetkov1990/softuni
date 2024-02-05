package izpit_java_tu_1;

import RaceSystem.EmptyLineupException;

public class CreateEvent {
    private String typeOfEvent;
    public Competition getEvent (String competitionType) throws EventException {
        Competition competition = null;
        switch (competitionType){
            case"football":
                competition = new FootballCompetition();
                break;
            case"formula1":
                competition = new Formula1Competition();
                break;
            case"horse":
                competition = new HorseCompetition();
                break;
            default:
                throw new EventException("invalid");
        }



        return competition;
    }
    public void fillSchedule(Competition ob,Participant[] schedule) throws EmptyLineupException{
        if(schedule == null || schedule.length == 0){
            throw new EmptyLineupException("empty");
        }
        Participant[] schedule1 = ob.getSchedule();
        if(schedule.length == schedule1.length){
            System.arraycopy(schedule, 0, schedule1, 0, schedule1.length);
        }
    }
}
