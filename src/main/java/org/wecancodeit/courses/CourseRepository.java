package org.wecancodeit.courses;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CourseRepository {

    Map<Long, Course> coursesList = new HashMap<>();
    //constructor to handle our database
    public CourseRepository(){
        Course reading = new Course(1L,"Reading", "I love J.R.R. Tolkien, learn all about this author in this course.");
        Course music = new Course(2L, "Music 101","School of Rock!");
        Course java = new Course(3L, "Java with Spring","The best course ever!");

        coursesList.put(reading.getId(), reading);
        coursesList.put(music.getId(), music);
        coursesList.put(java.getId(), java);


    }

    public CourseRepository(Course ...coursesToAdd) {
        for(Course course: coursesToAdd){
            coursesList.put(course.getId(),course);
        }
    }

    public Course findOne(long id) {
        return coursesList.get(id);
    }

    public Collection<Course> findAll() {
        return coursesList.values();
    }
}
