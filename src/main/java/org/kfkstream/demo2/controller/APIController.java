package org.kfkstream.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class APIController {

    @Autowired
    private DataDao dataDao;

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name){
       return "Hi "+name+" welcome to AWS demo2";
    }

    @GetMapping
    public String status(){
        return "Application is up and running";
    }

    @GetMapping("/data")
    public List<Data> getData(){
        return dataDao.getData();
    }
}
