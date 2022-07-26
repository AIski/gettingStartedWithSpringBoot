package program;

public class FitnessCoach implements Coach{
    private FortuneService fortuneService;
    public FitnessCoach(FortuneService fortuneService) {
        fortuneService=this.fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getFortune() {
        return null;
    }
}
