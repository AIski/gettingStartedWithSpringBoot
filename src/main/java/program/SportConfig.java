package program;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.FileNotFoundException;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("main.java.program")
public class SportConfig {
    // define bean for sad fortune Service
    @Bean
    public FortuneService sadFortuneService() {
        System.out.println("Inside Sportconfig: goodFortuneService method");
        return new SadFortuneService();
    }

    // define bean for swimCoach and inject dependency
    @Bean
    public Coach swimCoach() throws FileNotFoundException {
        System.out.println("Inside Sportconfig: swimCoach method");
        return new SwimCoach(sadFortuneService());

    }


}
