package org.wecancodeit.courses;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND, reason="Bad Request, Course Not Found!")
public class CourseNotFoundException extends Exception {
}
