package program;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource("classpath:sport.properties")
//@ComponentScan("main.java.program")
public class FitnessConfig {
    // define bean for sad fortune Service
    @Bean
    public FortuneService fitnessFortuneService() {
        System.out.println("Inside Sportconfig: fitness FortuneService method");
        return new FitnessFortuneService();
    }

    // define bean for swimCoach and inject dependency
    @Bean
    public Coach fitnessCoach(){
        System.out.println("Inside Sportconfig: fitnessCoach method");
        return new FitnessCoach(fitnessFortuneService());

    }


}
