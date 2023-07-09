package io.javabrains.springbootuickstart.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service // All service classes are singleton
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","Spring Framework","Spring Framework Application"),
            new Topic("java","Core Java","Core java Application"),
            new Topic("javascript","Java Script","Java Script Application")));

    public List<Topic> getTopics(){
        List<Topic> topic = new ArrayList<>();
        topicRepository.findAll().forEach(topic::add);
        return topic;
    }

    public Topic getTopic(String id){
        //return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
       return topicRepository.findById(id).get();
    }
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
//        topics.forEach(t -> {
//            if (t.getId().equals(topic.getId())) {
//                topics.set(topics.indexOf(t), topic);
//                return;
//            }
//        });

        topicRepository.save(topic);
    }

    public void deleteTopic(String id){
       // topics.removeIf( t-> t.getId().equals(id));
        topicRepository.deleteById(id);
    }

}
