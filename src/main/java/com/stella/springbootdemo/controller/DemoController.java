package com.stella.springbootdemo.controller;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Getter
    @Setter
    private Integer count;

}
