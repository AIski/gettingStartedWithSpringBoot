package program;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.ForkJoinPool;
public class SwimCoach implements Coach{
//@Qualifier("sadFortuneService")


    @Value("${foo.email}")
    private String email;


    @Value("${foo.team}")
    private String team;


    private FortuneService fortuneService;

    public SwimCoach(FortuneService thefortuneService){  // <--parametr

        fortuneService=thefortuneService;
}
    @Override
    public String getDailyWorkout() {

        return "Swim 100 pools.";
    }

    @Override
    public String getFortune() {

        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

}
