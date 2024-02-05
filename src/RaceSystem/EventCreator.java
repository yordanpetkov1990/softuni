package RaceSystem;

public class EventCreator {
    private String eventType;


    public Event getEvent(String competitionType) throws EventException{
        Event event = null;
        switch (competitionType){
            case "SwimmingEvent":
                event = new SwimmingEvent();
                break;
            case "BasketballMatch":
                event = new BasketballMatch();
                break;
            case "TableTennisTournament":
                event = new TableTennisTournament();
                break;
            default:
                throw new EventException("not a valid event");
        }
        return event;
    }
    public void fillLineup(Event ob, Competitor[] lineup) throws EmptyLineupException{
        if(lineup.length == 0){
            throw new EmptyLineupException("empty lineup");
        }

        ob.setLineUp(lineup);

    }
     public static void placeBet(Event ob, int competitorId, double bet) throws IllegalStateException {
        Competitor competitor = null;
         for (Competitor x : ob.getLineup()) {
             if(x.getId() == competitorId){
                 competitor = x;
             }
         }
         if(competitor == null){
             throw new IllegalStateException("not a valid id");
         }
         double newBet = (competitor.getBetForWin() + bet )/ competitor.getBetForWin();
         double newOddForWin = competitor.getOddsToWin() - (competitor.getOddsToWin() * newBet/100);

         if(newOddForWin<1.05){

             newOddForWin = 1.05;

         }

         competitor.setOddsToWin(newOddForWin);
     }
}
