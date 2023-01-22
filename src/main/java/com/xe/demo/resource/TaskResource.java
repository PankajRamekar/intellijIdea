package com.xe.demo.resource;

import com.xe.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/task")
public class TaskResource {
    @GetMapping("/TEST")
    public String getName(String name){
        return "name";
    }

   /* public ResponseEntity<TaskResponse> getTasks(@RequestBody(value="id", required = false) int id){

    }*/
}

