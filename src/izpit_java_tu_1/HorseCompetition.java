package izpit_java_tu_1;

public class HorseCompetition extends CompetitionA{
    private String breed;

    public HorseCompetition(String breed) {
        super();
        this.breed = breed;
    }
    public HorseCompetition(){
        super();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
