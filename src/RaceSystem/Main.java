package RaceSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventCreator eventCreator = new EventCreator();
        List<Event> eventList = new ArrayList<>();
        Competitor[] competitors = new Competitor[5];
        competitors[0] = new Competitor(1,"yordan",15,1.15,200);
        competitors[1] = new Competitor(2,"yordan",15,1.25,300);
        competitors[2] = new Competitor(3,"yordan",15,1.35,400);
        competitors[3] = new Competitor(4,"yordan",15,1.45,500);
        competitors[4] = new Competitor(5,"yordan",15,1.55,600);
        BasketballMatch basketballMatch = new BasketballMatch();
        Event event;
        try{
            event =eventCreator.getEvent("BasketballMatch");
            event.setLineUp(competitors);
            eventList.add(event);
        }catch (EventException e){
            System.out.println(e.getMessage());
        }
        EventCreator.placeBet(eventList.get(0),5,300);
        System.out.println();
        SwimmingEvent swimmingEvent = new SwimmingEvent();
        for (Event event1 : eventList) {
            if(event1 instanceof BasketballMatch){

            }else if(event1 instanceof SwimmingEvent){

            }
        }


    }
}
