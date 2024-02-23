package ua.example.kafkatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaTestApplication.class, args);
    }

/*
    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
            kafkaTemplate.send("example", "Ты уже мертвый?");
            for (int i = 1000; i > 0; i = i - 7) {
                kafkaTemplate.send("example", "Ты уже мертвый?");
                Thread.sleep(2000);
                kafkaTemplate.send("example", i +" - 7");
            }

        };
    }
*/
}
