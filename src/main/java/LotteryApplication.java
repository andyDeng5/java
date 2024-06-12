import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( value = {"controller", "service", "com.dao"})
public class LotteryApplication {

    public static void main(String[] args) {

        SpringApplication.run(LotteryApplication.class, args);
    }
}