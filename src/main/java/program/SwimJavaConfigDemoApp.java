//package program;//package program;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//@SpringBootApplication
//public class SwimJavaConfigDemoApp {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SwimJavaConfigDemoApp.class, args);
//
//        // load spring config file
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(SportConfig.class);
//
//        //retrieve bean from Spring container
//        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
//
//        System.out.println(theCoach.getFortune());
//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println("Coach email:"+theCoach.getEmail());
//        System.out.println("Coach team:"+theCoach.getTeam());
//
//
//        context.close();
//
//    }
//
//}
