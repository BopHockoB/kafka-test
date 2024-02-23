package ua.example.kafkatest.kafkaListeners;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaListener {

    @KafkaListener(
            topics = "example",
            groupId = "myId")
    void listener(String data){
        System.out.println("Data from Kafka.example: " + data);
    }
}
