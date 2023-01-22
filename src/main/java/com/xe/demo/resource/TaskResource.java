package com.xe.demo.resource;

import com.xe.demo.resource.response.TaskResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/task")
public class TaskResource {

  @GetMapping("/find")
    public String findMyName(){
      return "Supriya";
  }
    @GetMapping("/TEST")
    public String getName(String name){
        String task = "Pankaj";
        return task;
    }
}


