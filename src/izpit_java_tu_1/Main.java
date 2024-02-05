package izpit_java_tu_1;

import RaceSystem.Competitor;
import RaceSystem.EmptyLineupException;
import RaceSystem.Event;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Competition> competitionList = new ArrayList<>();
        Participant[] participants = new Participant[2];
        participants[0] = new Participant("yordan",20,1.5,200);
        participants[1] = new Participant("georgi",20,1.5,200);


        try {
            CreateEvent createEvent = new CreateEvent();
            Competition co = createEvent.getEvent("football");
            competitionList.add(co);
            createEvent.fillSchedule(co,participants);
            System.out.println();

        } catch (EventException | EmptyLineupException e) {
            System.out.println(e.getMessage());
        }
        bets(competitionList.get(0),2,300);

        System.out.println();
        FootballCompetition competition = new FootballCompetition();
        System.out.println(competition.schedule.length);
        System.out.println();


    }
    public static void bets(Competition ob,int id,double bet){
        Participant participant = null;
        for (Participant x : ob.getSchedule()) {
            if(x.getId() == id){
                participant = x;
            }
        }
        assert participant != null;
        double newBet = (participant.getBetForWin() + bet) / participant.getBetForWin();
        participant.setChanceToWin(participant.getChanceToWin() - (participant.getChanceToWin() * newBet / 100));
    }
}
