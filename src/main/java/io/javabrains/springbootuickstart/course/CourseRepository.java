package io.javabrains.springbootuickstart.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);
    // No need to implement this method spring Jpa will provide the implementation based on the method name

}

