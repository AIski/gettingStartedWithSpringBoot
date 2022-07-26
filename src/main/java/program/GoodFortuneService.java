package program;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GoodFortuneService implements FortuneService {
    Random random = new Random();
    public GoodFortuneService() throws FileNotFoundException {
        System.out.println("inside GoodFortuneService empty Constructor.");
    }
    List theFortunes = new ArrayList<String>();


    @PostConstruct
    private void loadtheFortune() throws IOException {
        System.out.println("loading fortune");

      BufferedReader br = new BufferedReader(
               new FileReader("C:\\Users\\Andrzej\\IdeaProjects\\spring_intelij\\src\\main\\java\\program\\fortunes.txt"));

       String templine;
       while((templine=br.readLine())!=null){
            theFortunes.add(templine);;
        }
    }


    @Override
    public String getFortune() {
        int index = random.nextInt(theFortunes.size());
        return (String) theFortunes.get(index);
    }
}
