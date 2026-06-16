package org.kfkstream.demo2.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {

    private String id;
    private String name;
    private  String quantity;
    private String price;
}
