//package program;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//@SpringBootApplication
//public class JavaConfigDemoApp {
//
//    public static void main(String[] args) {
//        SpringApplication.run(JavaConfigDemoApp.class, args);
//
//        // load spring config file
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");
//        //retrieve bean from Spring container
//        Coach theCoach = context.getBean("tennisCoach", Coach.class);
//
//        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
//        System.out.println(theCoach.getFortune());
//
//        // check if the are the same place in memory
//        boolean result = theCoach.equals(alphaCoach);
//        System.out.println(result);
//
//        System.out.println(theCoach);
//        System.out.println(alphaCoach);
//        context.close();
//
//    }
//
//}
