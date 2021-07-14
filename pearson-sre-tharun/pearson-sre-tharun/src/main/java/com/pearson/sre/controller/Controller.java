package com.pearson.sre.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
public class Controller {




    @GetMapping("ping")
    public String ping(){
        return "active";
    }

    @GetMapping("getmoviebygenre")
    public void getmoviebygenre(@RequestParam String genre){




    }


}
