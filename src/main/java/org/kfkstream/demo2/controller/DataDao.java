package org.kfkstream.demo2.controller;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataDao {

    public List<Data> getData(){
        return  Arrays.asList(new Data("1","iphone","1","50000"),
                new Data("2","vivo","1","40000"),
                new Data("3","oppo","2","30000"),
                new Data("4","micromax","1","20000"),
                new Data("5","samsumg","1","45000"));
    }
}
