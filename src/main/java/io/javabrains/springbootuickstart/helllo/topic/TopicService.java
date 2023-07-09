package io.javabrains.springbootuickstart.helllo.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service // All service classes are singleton
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","Spring Framework","Spring Framework Application"),
            new Topic("java","Core Java","Core java Application"),
            new Topic("javascript","Java Script","Java Script Application")));

    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }
    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic){
        topics.forEach(t -> {
            if (t.getId().equals(topic.getId())) {
                topics.set(topics.indexOf(t), topic);
                return;
            }
        });
    }

    public void deleteTopic(String id){
        topics.removeIf( t-> t.getId().equals(id));
    }

}
