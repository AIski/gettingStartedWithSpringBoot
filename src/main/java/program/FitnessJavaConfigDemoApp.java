package program;//package program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FitnessJavaConfigDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(FitnessJavaConfigDemoApp.class, args);

        // load spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(FitnessConfig.class);

        //retrieve bean from Spring container
        FitnessCoach theCoach = context.getBean("fitnessCoach", FitnessCoach.class);

        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getDailyWorkout());



        context.close();

    }

}
